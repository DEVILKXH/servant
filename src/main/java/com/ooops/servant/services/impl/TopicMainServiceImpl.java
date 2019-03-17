package com.ooops.servant.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.core.extend.util.StringUtil;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDetail;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.entity.TopicMain;
import com.ooops.servant.mapper.TopicMainMapper;
import com.ooops.servant.services.AnsCardService;
import com.ooops.servant.services.TopicDetailService;
import com.ooops.servant.services.TopicDictService;
import com.ooops.servant.services.TopicMainService;
import com.ooops.servant.vo.TopicMainVo;

@Service
@Primary
public class TopicMainServiceImpl extends BaseServiceImpl<TopicMain, TopicMainMapper> implements TopicMainService {

	@Autowired
	private TopicDetailService topicDetailService;
	
	@Autowired
	private TopicDictService topicDictService;
	
	@Autowired
	private AnsCardService ansCardService;
	
	@Override
	public TopicMainVo getTopicMain(TopicDict topicDict) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		TopicDetail topicDetail = new TopicDetail();
		int size = 8;
		String title = "的测试";
		if(null != topicDict && StringUtil.isNotNull(topicDict.getTopicCode())){
			TopicDict dict = topicDictService.selectOne(topicDict);
			topicDetail.setTopicId(dict.getId());
			size = 4;
			title = dict.getTopicName() + "的专项测试";
		}
		List<TopicDetail> detail = topicDetailService.selectRandList(topicDetail, size);
		TopicMain main = new TopicMain();
		main.setId(UUID.randomUUID().toString());
		main.setTestTitle(sdf.format(new Date()) + title);
		main.setCreatrTime(new Date());
		
		mapper.insertSelective(main);
		
		List<AnsCard> ansCards = new ArrayList<AnsCard>();
		for(TopicDetail d: detail){
			AnsCard ansCard = getAnsCard(main, d);
			ansCards.add(ansCard);
			ansCardService.insertSelective(ansCard);
		}
		
		
		TopicMainVo vo = new TopicMainVo();
		vo.setId(main.getId());
		vo.setTestTitle(main.getTestTitle());
		vo.setCreatrTime(main.getCreatrTime());
		
		vo.setDetail(ansCards);
		return vo;
	}

	private AnsCard getAnsCard(TopicMain main, TopicDetail d) {
		AnsCard ansCard = new AnsCard();
		ansCard.setId(UUID.randomUUID().toString());
		ansCard.setAnsDesp(d.getQuesDesc());
		ansCard.setAnsAnswer(d.getQuesAnswer());
		ansCard.setAnsOption(d.getQuesOptions());
		ansCard.setAnsTitle(d.getQuesTitle());
		ansCard.setAnsType(d.getQuesType());
		ansCard.setTopicDictId(d.getTopicId());
		ansCard.setTopicMainId(main.getId());
		return ansCard;
	}

}

