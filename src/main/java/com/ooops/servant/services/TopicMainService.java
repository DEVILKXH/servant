package com.ooops.servant.services;


import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.vo.TopicMainVo;
import com.core.extend.base.service.BaseService;

public interface TopicMainService extends BaseService<TopicMain>{

	TopicMainVo getTopicMain(TopicDict topicDict, String creatorId);

	TopicMainVo checkTopicMain(TopicMainVo vo);
	
}

