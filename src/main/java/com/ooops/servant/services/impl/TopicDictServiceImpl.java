package com.ooops.servant.services.impl;

import org.springframework.stereotype.Service;
import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.mapper.TopicDictMapper;
import com.ooops.servant.services.TopicDictService;

@Service
public class TopicDictServiceImpl extends BaseServiceImpl<TopicDict, TopicDictMapper> implements TopicDictService {

}

