package com.ooops.servant.services.impl;

import org.springframework.stereotype.Service;
import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.mapper.TopicMainMapper;
import com.ooops.servant.services.TopicMainService;

@Service
public class TopicMainServiceImpl extends BaseServiceImpl<TopicMain, TopicMainMapper> implements TopicMainService {

}

