package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.services.TopicMainService;

@Controller
@RequestMapping(value="/servent/topicMain")
public class TopicMainController extends BaseController<TopicMain, TopicMainService> {
	
}
