package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class UsersInfo extends BaseEntity{	
		private java.lang.String id;   	private java.lang.String loginName;   //登录名	private java.lang.String nickName;   //昵称	private java.lang.String password;   //密码	private java.lang.String type;   //类型	private java.lang.Integer status;   //状态	private java.sql.Timestamp loginTime;   //登录时间	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.String getLoginName() {	    return this.loginName;	}	public void setLoginName(java.lang.String loginName) {	    this.loginName=loginName;	}	public java.lang.String getNickName() {	    return this.nickName;	}	public void setNickName(java.lang.String nickName) {	    this.nickName=nickName;	}	public java.lang.String getPassword() {	    return this.password;	}	public void setPassword(java.lang.String password) {	    this.password=password;	}	public java.lang.String getType() {	    return this.type;	}	public void setType(java.lang.String type) {	    this.type=type;	}	public java.lang.Integer getStatus() {	    return this.status;	}	public void setStatus(java.lang.Integer status) {	    this.status=status;	}	public java.sql.Timestamp getLoginTime() {	    return this.loginTime;	}	public void setLoginTime(java.sql.Timestamp loginTime) {	    this.loginTime=loginTime;	}
}

