package com.ooops.servant.entity;

import com.core.extend.base.entity.BaseEntity;

public class AnsCard extends BaseEntity{	
		private String ansTitle;   //题目	private String ansOption;   //选项	private String ansAnswer;   //正确答案	private String ansMyAnswer;   //答案	private String ansDesp;   //描述	private String ansType;   //类型	private String topicDictId;   //题目类型ID	private String topicMainId;   //试卷ID	private String ansId;   
	private String ansIndex;
		public String getAnsTitle() {	    return this.ansTitle;	}	public void setAnsTitle(String ansTitle) {	    this.ansTitle=ansTitle;	}	public String getAnsOption() {	    return this.ansOption;	}	public void setAnsOption(String ansOption) {	    this.ansOption=ansOption;	}	public String getAnsAnswer() {	    return this.ansAnswer;	}	public void setAnsAnswer(String ansAnswer) {	    this.ansAnswer=ansAnswer;	}	public String getAnsMyAnswer() {	    return this.ansMyAnswer;	}	public void setAnsMyAnswer(String ansMyAnswer) {	    this.ansMyAnswer=ansMyAnswer;	}	public String getAnsDesp() {	    return this.ansDesp;	}	public void setAnsDesp(String ansDesp) {	    this.ansDesp=ansDesp;	}	public String getAnsType() {	    return this.ansType;	}	public void setAnsType(String ansType) {	    this.ansType=ansType;	}	public String getTopicDictId() {	    return this.topicDictId;	}	public void setTopicDictId(String topicDictId) {	    this.topicDictId=topicDictId;	}	public String getTopicMainId() {	    return this.topicMainId;	}	public void setTopicMainId(String topicMainId) {	    this.topicMainId=topicMainId;	}	public String getAnsId() {	    return this.ansId;	}	public void setAnsId(String ansId) {	    this.ansId=ansId;	}
	public String getAnsIndex() {
		return ansIndex;
	}
	public void setAnsIndex(String ansIndex) {
		this.ansIndex = ansIndex;
	}
	
}

