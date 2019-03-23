package com.ooops.servant.mapper;

import java.util.List;

import com.core.extend.base.mapper.BaseMapper;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;

public interface AnsCardMapper extends BaseMapper<AnsCard>{

	List<TopicDict> selectError(AnsCard ansCard);
	
}

