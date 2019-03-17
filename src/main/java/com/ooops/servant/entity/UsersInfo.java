package com.ooops.servant.entity;

import java.util.Date;

import com.core.extend.base.entity.BaseEntity;

public class UsersInfo extends BaseEntity{	
		private String loginName;   //登录名	private String nickName;   //昵称	private String password;   //密码	private String type;   //类型	private Integer status;   //状态	private Date loginTime;   //登录时间	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getLoginName() {	    return this.loginName;	}	public void setLoginName(String loginName) {	    this.loginName=loginName;	}	public String getNickName() {	    return this.nickName;	}	public void setNickName(String nickName) {	    this.nickName=nickName;	}	public String getPassword() {	    return this.password;	}	public void setPassword(String password) {	    this.password=password;	}	public String getType() {	    return this.type;	}	public void setType(String type) {	    this.type=type;	}	public Integer getStatus() {	    return this.status;	}	public void setStatus(Integer status) {	    this.status=status;	}	public Date getLoginTime() {	    return this.loginTime;	}	public void setLoginTime(Date loginTime) {	    this.loginTime=loginTime;	}
}

