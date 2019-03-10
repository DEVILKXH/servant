package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class TopicDict extends BaseEntity{	
		private java.lang.String id;   	private java.lang.String topicCode;   //编码	private java.lang.String topicName;   //名称	private java.lang.Integer topicStatus;   //状态	private java.sql.Timestamp createTime;   //创建时间	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.String getTopicCode() {	    return this.topicCode;	}	public void setTopicCode(java.lang.String topicCode) {	    this.topicCode=topicCode;	}	public java.lang.String getTopicName() {	    return this.topicName;	}	public void setTopicName(java.lang.String topicName) {	    this.topicName=topicName;	}	public java.lang.Integer getTopicStatus() {	    return this.topicStatus;	}	public void setTopicStatus(java.lang.Integer topicStatus) {	    this.topicStatus=topicStatus;	}	public java.sql.Timestamp getCreateTime() {	    return this.createTime;	}	public void setCreateTime(java.sql.Timestamp createTime) {	    this.createTime=createTime;	}
}

