package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class TopicMain extends BaseEntity{	
		private java.lang.String id;   	private java.lang.String testTitle;   //试卷标题	private java.lang.String testCreatorId;   //答卷人	private java.sql.Timestamp creatrTime;   //答卷时间	private java.sql.Timestamp updateTime;   //交卷时间	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.String getTestTitle() {	    return this.testTitle;	}	public void setTestTitle(java.lang.String testTitle) {	    this.testTitle=testTitle;	}	public java.lang.String getTestCreatorId() {	    return this.testCreatorId;	}	public void setTestCreatorId(java.lang.String testCreatorId) {	    this.testCreatorId=testCreatorId;	}	public java.sql.Timestamp getCreatrTime() {	    return this.creatrTime;	}	public void setCreatrTime(java.sql.Timestamp creatrTime) {	    this.creatrTime=creatrTime;	}	public java.sql.Timestamp getUpdateTime() {	    return this.updateTime;	}	public void setUpdateTime(java.sql.Timestamp updateTime) {	    this.updateTime=updateTime;	}
}

