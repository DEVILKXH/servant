package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.services.TopicDictService;

@Controller
@RequestMapping(value="/servent/topicDict")
public class TopicDictController extends BaseController<TopicDict, TopicDictService> {
	
}
