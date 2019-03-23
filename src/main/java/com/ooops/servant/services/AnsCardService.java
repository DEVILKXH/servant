package com.ooops.servant.services;


import java.util.List;

import com.core.extend.base.service.BaseService;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;

public interface AnsCardService extends BaseService<AnsCard>{

	List<TopicDict> getError(AnsCard ansCard);
	
}

