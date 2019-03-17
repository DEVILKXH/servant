package com.ooops.servant.services;


import java.util.List;

import com.core.extend.base.service.BaseService;
import com.core.extend.vo.AjaxResult;
import com.ooops.servant.entity.TopicDetail;

public interface TopicDetailService extends BaseService<TopicDetail>{

	AjaxResult<TopicDetail> saveList(List<TopicDetail> records);
	
	public List<TopicDetail> selectRandList(TopicDetail topicDetail, int size);
}

