package com.ooops.servant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.core.extend.constant.Constant;
import com.core.extend.vo.AjaxResult;
import com.ooops.servant.entity.UsersInfo;
import com.ooops.servant.services.UsersInfoService;

@Controller
@RequestMapping(value = "")
public class LoginController extends BaseController<UsersInfo, UsersInfoService>{

	@Autowired
	private HttpSession session;
	
	@RequestMapping(value = {"/index",""})
	public String index() {
		return Constant.INDEX;
	}
	
	@RequestMapping(value = {"/login",""})
	public String login() {
		if(session.getAttribute(Constant.USER_KEY) == null){
			return Constant.LOGIN;
		}else {
			return Constant.INDEX;
		}
	}
	
	
	@RequestMapping(value = {"/logout"})
	public String logout() {
		session.invalidate();
		return Constant.LOGIN;
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult<UsersInfo> doLogin(@RequestBody UsersInfo user){
		AjaxResult<UsersInfo> ajax = new AjaxResult<>();
//		user.setId(user.getId().toUpperCase());
		UsersInfo _user = new UsersInfo();
		_user.setLoginName(user.getLoginName());
		_user.setType("T");
		UsersInfo myUser = service.selectOne(_user);
		if(null == myUser || !myUser.getPassword().equals(user.getPassword())) {
			ajax.setStatus("404");
			ajax.setMessage("账号或密码错误");
		}else {
			ajax.setStatus("200");
			ajax.setMessage("登陆成功");
			ajax.setObject(myUser);
			session.setAttribute(Constant.USER_KEY, user.getId());
		}
		return ajax;
	}
	
	@RequestMapping(value = "/doLoginByTeacher.do", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult<UsersInfo> doLoginByTeacher(@RequestBody UsersInfo user){
		AjaxResult<UsersInfo> ajax = new AjaxResult<>();
//		user.setId(user.getId().toUpperCase());
		UsersInfo _user = new UsersInfo();
		_user.setLoginName(user.getLoginName());
		_user.setType("T");
		UsersInfo myUser = service.selectOne(_user);
		if(null == myUser || !myUser.getPassword().equals(user.getPassword())) {
			ajax.setStatus("404");
			ajax.setMessage("账号或密码错误");
		}else {
			ajax.setStatus("200");
			ajax.setMessage("登陆成功");
			ajax.setObject(myUser);
			session.setAttribute(Constant.USER_KEY, user.getId());
		}
		return ajax;
	}
}
