package com.ooops.servant.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.services.AnsCardService;

@Controller
@RequestMapping(value="/ansCard")
public class AnsCardController extends BaseController<AnsCard, AnsCardService> {

	@RequestMapping(value="/error")
	public String error(){
		return "topicDict/error";
	}
	
	@RequestMapping(value="/error.do")
	@ResponseBody
	public List<TopicDict> getError(AnsCard ansCard){
		return service.getError(ansCard);
	}
	
	@RequestMapping(value="/analyse")
	public String analyse(){
		return "topicDict/analyse";
	}
}
