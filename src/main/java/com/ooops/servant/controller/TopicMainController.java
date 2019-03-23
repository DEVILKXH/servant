package com.ooops.servant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.services.AnsCardService;
import com.ooops.servant.services.TopicMainService;
import com.ooops.servant.vo.TopicMainVo;

import tk.mybatis.mapper.entity.Example;

@Controller
@RequestMapping(value="/topicMain")
public class TopicMainController extends BaseController<TopicMain, TopicMainService> {

	@Autowired
	private AnsCardService ansCardService;
	
	@RequestMapping(value = "/history.do")
	@ResponseBody
	public List<TopicMain> getHistory(){
		Example example = new Example(TopicMain.class);
		example.setOrderByClause("CREATR_TIME DESC");
		return service.selectByExample(example);
	}
	
	@RequestMapping(value = "/history")
	public String history(){
		return "topicMain/history";
	}
	
	@RequestMapping(value = "/getTopicMain.do")
	@ResponseBody
	public TopicMainVo getTopicMain(TopicDict topicDict, String creatorId){
		return service.getTopicMain(topicDict, creatorId);
	}
	
	@RequestMapping(value = "/getTopicMainById.do")
	@ResponseBody
	public TopicMainVo getTopicMain(TopicMainVo vo){
		TopicMain main = service.selectByPrimaryKey(vo.getId());
		vo.setTestTitle(main.getTestTitle());
		vo.setTestType(main.getTestType());
		vo.setCreatrTime(main.getCreatrTime());
		Example example = new Example(AnsCard.class);
		example.createCriteria().andEqualTo("topicMainId", vo.getId());
		example.setOrderByClause("ANS_INDEX ASC");
		List<AnsCard> detail = ansCardService.selectByExample(example);
		vo.setDetail(detail);
		return vo;
	}
	
	@RequestMapping(value = "/checkTopicMain.do")
	@ResponseBody
	public TopicMainVo checkTopicMain(@RequestBody TopicMainVo vo){
		return service.checkTopicMain(vo);
	}
	
	@RequestMapping(value = "/getTopicMain")
	public String getTopicMain(){
		return "topicMain/index";
	}
	
	@RequestMapping(value = "/check")
	public String getTopicMainCheck(){
		return "topicMain/check";
	}
	
	@RequestMapping(value = "/edit")
	public String getTopicMainEdit(){
		return "topicMain/edit";
	}
}
