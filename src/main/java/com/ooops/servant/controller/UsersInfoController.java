package com.ooops.servant.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.UsersInfo;
import com.ooops.servant.services.UsersInfoService;

@Controller
@RequestMapping(value="/usersInfo")
public class UsersInfoController extends BaseController<UsersInfo, UsersInfoService> {

	@RequestMapping(value="/index")
	public String index(){
		return "userInfo/index";
	}
	
	@RequestMapping(value="/edit")
	public String edit(){
		return "userInfo/edit";
	}
	
	@RequestMapping(value="/add")
	public String add(){
		return "userInfo/add";
	}
	
	@RequestMapping(value="/getUserInfo.do")
	@ResponseBody
	public List<UsersInfo> getUserInfo(UsersInfo usersInfo){
		return service.select(usersInfo);
	}
}
