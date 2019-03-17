package com.ooops.servant.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.core.extend.vo.AjaxResult;
import com.ooops.servant.entity.TopicDetail;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.mapper.TopicDetailMapper;
import com.ooops.servant.services.TopicDetailService;
import com.ooops.servant.services.TopicDictService;

@Service
@Primary
public class TopicDetailServiceImpl extends BaseServiceImpl<TopicDetail, TopicDetailMapper> implements TopicDetailService {

	@Autowired
	private TopicDictService topicDictService;
	
	@Override
	public AjaxResult<TopicDetail> saveList(List<TopicDetail> records) {
		String topicCode = records.get(0).getTopicId();
		TopicDict topicDict = new TopicDict();
		topicDict.setTopicCode(topicCode);
		TopicDict _topicDict = topicDictService.selectOne(topicDict);
		AjaxResult<TopicDetail> ajax = new AjaxResult<TopicDetail>();
		int flag = 0;
		for(TopicDetail record :records){
			record.setId(UUID.randomUUID().toString());
			record.setTopicId(_topicDict.getId());
			flag = mapper.insertSelective(record);
		}
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("插入成功");
		}
		return ajax;
	}

	@Override
	public List<TopicDetail> selectRandList(TopicDetail topicDetail, int size) {
		return mapper.selectRandList(topicDetail, size);
	}

}

