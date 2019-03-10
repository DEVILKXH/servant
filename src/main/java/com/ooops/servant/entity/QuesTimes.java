package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class QuesTimes extends BaseEntity{	
		private java.lang.String id;   	private java.lang.String userId;   //用户ID	private java.lang.String quesId;   //题目ID	private java.lang.String times;   //次数	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.String getUserId() {	    return this.userId;	}	public void setUserId(java.lang.String userId) {	    this.userId=userId;	}	public java.lang.String getQuesId() {	    return this.quesId;	}	public void setQuesId(java.lang.String quesId) {	    this.quesId=quesId;	}	public java.lang.String getTimes() {	    return this.times;	}	public void setTimes(java.lang.String times) {	    this.times=times;	}
}

