package com.ooops.servant.vo;

import java.util.List;

import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicMain;

public class TopicMainVo extends TopicMain{

	private List<AnsCard> detail;

	public List<AnsCard> getDetail() {
		return detail;
	}

	public void setDetail(List<AnsCard> detail) {
		this.detail = detail;
	}
	
}
