package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class TopicDetail extends BaseEntity{	
		private java.lang.String id;   	private java.lang.String quesTitle;   //题目	private java.lang.String quesOptions;   //选项	private java.lang.String questAnswer;   //答案	private java.lang.String quesDesc;   //解析	private java.lang.String quesType;   //题目类型	private java.lang.String topicId;   //关联题目	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.String getQuesTitle() {	    return this.quesTitle;	}	public void setQuesTitle(java.lang.String quesTitle) {	    this.quesTitle=quesTitle;	}	public java.lang.String getQuesOptions() {	    return this.quesOptions;	}	public void setQuesOptions(java.lang.String quesOptions) {	    this.quesOptions=quesOptions;	}	public java.lang.String getQuestAnswer() {	    return this.questAnswer;	}	public void setQuestAnswer(java.lang.String questAnswer) {	    this.questAnswer=questAnswer;	}	public java.lang.String getQuesDesc() {	    return this.quesDesc;	}	public void setQuesDesc(java.lang.String quesDesc) {	    this.quesDesc=quesDesc;	}	public java.lang.String getQuesType() {	    return this.quesType;	}	public void setQuesType(java.lang.String quesType) {	    this.quesType=quesType;	}	public java.lang.String getTopicId() {	    return this.topicId;	}	public void setTopicId(java.lang.String topicId) {	    this.topicId=topicId;	}
}

