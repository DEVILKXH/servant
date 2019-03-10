package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.TopicDetail;
import com.ooops.servant.services.TopicDetailService;

@Controller
@RequestMapping(value="/servent/topicDetail")
public class TopicDetailController extends BaseController<TopicDetail, TopicDetailService> {
	
}
