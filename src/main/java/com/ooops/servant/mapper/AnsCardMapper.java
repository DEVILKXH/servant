package com.ooops.servant.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.core.extend.base.mapper.BaseMapper;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;

public interface AnsCardMapper extends BaseMapper<AnsCard>{

	List<TopicDict> selectError(AnsCard ansCard);
	
	List<Map<String, String>> getAnalyseByTopicCode(@Param("answer") String answer);
	
	List<Map<String, String>> getAnalyse(@Param("answer") String answer);
}

