package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.services.TopicMainService;
import com.ooops.servant.vo.TopicMainVo;

@Controller
@RequestMapping(value="/topicMain")
public class TopicMainController extends BaseController<TopicMain, TopicMainService> {

	@RequestMapping(value = "/getTopicMain.do")
	@ResponseBody
	public TopicMainVo getTopicMain(TopicDict topicDict){
		return service.getTopicMain(topicDict);
	}
}
