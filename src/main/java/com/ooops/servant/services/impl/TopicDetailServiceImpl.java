package com.ooops.servant.services.impl;

import org.springframework.stereotype.Service;
import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.TopicDetail;
import com.ooops.servant.mapper.TopicDetailMapper;
import com.ooops.servant.services.TopicDetailService;

@Service
public class TopicDetailServiceImpl extends BaseServiceImpl<TopicDetail, TopicDetailMapper> implements TopicDetailService {

}

