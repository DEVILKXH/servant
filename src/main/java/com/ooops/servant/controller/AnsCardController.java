package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.services.AnsCardService;

@Controller
@RequestMapping(value="/servent/ansCard")
public class AnsCardController extends BaseController<AnsCard, AnsCardService> {
	
}
