package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class TopicDict extends BaseEntity{	
		private String topicCode;   //编码	private String topicName;   //名称	private Integer topicStatus;   //状态	private java.sql.Timestamp createTime;   //创建时间	public String getTopicCode() {	    return this.topicCode;	}	public void setTopicCode(String topicCode) {	    this.topicCode=topicCode;	}	public String getTopicName() {	    return this.topicName;	}	public void setTopicName(String topicName) {	    this.topicName=topicName;	}	public Integer getTopicStatus() {	    return this.topicStatus;	}	public void setTopicStatus(Integer topicStatus) {	    this.topicStatus=topicStatus;	}	public java.sql.Timestamp getCreateTime() {	    return this.createTime;	}	public void setCreateTime(java.sql.Timestamp createTime) {	    this.createTime=createTime;	}
}

