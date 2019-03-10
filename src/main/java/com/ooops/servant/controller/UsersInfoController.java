package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.UsersInfo;
import com.ooops.servant.services.UsersInfoService;

@Controller
@RequestMapping(value="/servent/usersInfo")
public class UsersInfoController extends BaseController<UsersInfo, UsersInfoService> {
	
}
