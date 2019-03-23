package com.ooops.servant.services.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.mapper.AnsCardMapper;
import com.ooops.servant.services.AnsCardService;

@Service
@Primary
public class AnsCardServiceImpl extends BaseServiceImpl<AnsCard, AnsCardMapper> implements AnsCardService {

	@Override
	public List<TopicDict> getError(AnsCard ansCard) {
		return mapper.selectError(ansCard);
	}

}

