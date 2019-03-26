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

	/**
	 * 用户信息页面
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index(){
		return "userInfo/index";
	}
	
	/**
	 * 编辑页面
	 * @return
	 */
	@RequestMapping(value="/edit")
	public String edit(){
		return "userInfo/edit";
	}
	
	/**
	 * 新增页面
	 * @return
	 */
	@RequestMapping(value="/add")
	public String add(){
		return "userInfo/add";
	}
	
	/**
	 * 获取用户列表(S: 学生, T: 教师)
	 * @param usersInfo
	 * @return
	 */
	@RequestMapping(value="/getUserInfo.do")
	@ResponseBody
	public List<UsersInfo> getUserInfo(UsersInfo usersInfo){
		return service.select(usersInfo);
	}
}
