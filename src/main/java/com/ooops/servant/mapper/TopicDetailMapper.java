package com.ooops.servant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.core.extend.base.mapper.BaseMapper;
import com.ooops.servant.entity.TopicDetail;

public interface TopicDetailMapper extends BaseMapper<TopicDetail>{
	public List<TopicDetail> selectRandList(@Param("topicDetail")TopicDetail topicDetail, @Param("size")int size);
}

