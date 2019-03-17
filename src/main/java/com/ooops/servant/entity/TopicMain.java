package com.ooops.servant.entity;

import java.util.Date;

import com.core.extend.base.entity.BaseEntity;

public class TopicMain extends BaseEntity{	
		private String testTitle;   //试卷标题	private String testCreatorId;   //答卷人	private Date creatrTime;   //答卷时间	private Date updateTime;   //交卷时间	public String getTestTitle() {	    return this.testTitle;	}	public void setTestTitle(String testTitle) {	    this.testTitle=testTitle;	}	public String getTestCreatorId() {	    return this.testCreatorId;	}	public void setTestCreatorId(String testCreatorId) {	    this.testCreatorId=testCreatorId;	}	public Date getCreatrTime() {	    return this.creatrTime;	}	public void setCreatrTime(Date creatrTime) {	    this.creatrTime=creatrTime;	}	public Date getUpdateTime() {	    return this.updateTime;	}	public void setUpdateTime(Date updateTime) {	    this.updateTime=updateTime;	}
}

