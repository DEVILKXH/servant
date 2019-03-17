package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class QuesTimes extends BaseEntity{	
		private String userId;   //用户ID	private String quesId;   //题目ID	private String times;   //次数	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getUserId() {	    return this.userId;	}	public void setUserId(String userId) {	    this.userId=userId;	}	public String getQuesId() {	    return this.quesId;	}	public void setQuesId(String quesId) {	    this.quesId=quesId;	}	public String getTimes() {	    return this.times;	}	public void setTimes(String times) {	    this.times=times;	}
}

