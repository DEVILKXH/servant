package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class TopicDetail extends BaseEntity{	
		private String quesTitle;   //题目	private String quesOptions;   //选项	private String quesAnswer;   //答案	private String quesDesc;   //解析	private String quesType;   //题目类型	private String topicId;   //关联题目	public String getQuesTitle() {	    return this.quesTitle;	}	public void setQuesTitle(String quesTitle) {	    this.quesTitle=quesTitle;	}	public String getQuesOptions() {	    return this.quesOptions;	}	public void setQuesOptions(String quesOptions) {	    this.quesOptions=quesOptions;	}	public String getQuesAnswer() {	    return this.quesAnswer;	}	public void setQuesAnswer(String questAnswer) {	    this.quesAnswer=questAnswer;	}	public String getQuesDesc() {	    return this.quesDesc;	}	public void setQuesDesc(String quesDesc) {	    this.quesDesc=quesDesc;	}	public String getQuesType() {	    return this.quesType;	}	public void setQuesType(String quesType) {	    this.quesType=quesType;	}	public String getTopicId() {	    return this.topicId;	}	public void setTopicId(String topicId) {	    this.topicId=topicId;	}
}

