package com.ooops.servant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.core.extend.vo.AjaxResult;
import com.ooops.servant.entity.TopicDetail;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.services.TopicDetailService;
import com.ooops.servant.services.TopicDictService;

@Controller
@RequestMapping(value="/topicDetail")
public class TopicDetailController extends BaseController<TopicDetail, TopicDetailService> {
	
	@Autowired
	private TopicDictService topicDictService;
	
	@RequestMapping(value="/create")
	public String create(String topicCode, Model model){
		model.addAttribute("topicCode", topicCode);
		return "topicDict/add";
	}
	
	@RequestMapping(value="/edit")
	public String edit(String topicCode, Model model){
		model.addAttribute("topicCode", topicCode);
		return "topicDict/edit";
	}
	
	@RequestMapping(value = "/saveList.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<TopicDetail> insertSelective(@RequestBody List<TopicDetail> records){
		return service.saveList(records);
	}
	
	@RequestMapping(value = "/getList.do")
	@ResponseBody
	public List<TopicDetail> getList(TopicDict record){
		TopicDict dict = topicDictService.selectOne(record);
		TopicDetail detail = new TopicDetail();
		detail.setTopicId(dict.getId());
		return service.select(detail);
	}
}
