package com.ooops.servant.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.AnsCard;
import com.ooops.servant.entity.TopicDict;
import com.ooops.servant.services.AnsCardService;

@Controller
@RequestMapping(value="/ansCard")
public class AnsCardController extends BaseController<AnsCard, AnsCardService> {

	/**
	 * 我的错题页面
	 * @return
	 */
	@RequestMapping(value="/error")
	public String error(){
		return "topicDict/error";
	}
	
	/**
	 * 获得我的错题数据
	 * @param ansCard
	 * @return
	 */
	@RequestMapping(value="/error.do")
	@ResponseBody
	public List<TopicDict> getError(AnsCard ansCard){
		return service.getError(ansCard);
	}
	
	/**
	 * 统计分析页面
	 * @return
	 */
	@RequestMapping(value="/analyse")
	public String analyse(){
		return "topicDict/analyse";
	}
	
	/**
	 * 获得分类统计数据(平均答题数)
	 * @return
	 */
	@RequestMapping(value="/getAnalyseByTopicCode.do")
	@ResponseBody
	public List<List<String>> getAnalyseByTopicCode(){
		List<List<String>> list = new ArrayList<>();
		List<String> header = new ArrayList<>();
		header.add("product");
		header.add("平均答对数");
		header.add("平均答错数");
		list.add(header);
		List<String> CSPD = new ArrayList<>();
		List<String> YYLJYBD = new ArrayList<>();
		List<String> SLGX = new ArrayList<>();
		List<String> PDTL = new ArrayList<>();
		List<String> ZLFX = new ArrayList<>();
		CSPD.add("常识判断");
		YYLJYBD.add("言语理解与表达");
		SLGX.add("数量关系");
		PDTL.add("判断推理");
		ZLFX.add("资料分析");
		
		List<Map<String, String>> mapTrue = service.getAnalyseByTopicCode("true"); 
		List<Map<String, String>> mapFalse = service.getAnalyseByTopicCode("false"); 
		for(Map<String, String> m: mapTrue){
			String key = m.get("TOPIC_NAME");
			Object obj = m.get("avg");
			String value = obj.toString();
			if("常识判断".equals(key)){
				CSPD.add(value);
			}else if("言语理解与表达".equals(key)){
				YYLJYBD.add(value);
			}else if("数量关系".equals(key)){
				SLGX.add(value);
			}else if("判断推理".equals(key)){
				PDTL.add(value);
			}else if("资料分析".equals(key)){
				ZLFX.add(value);
			}
		}
		
		for(Map<String, String> m: mapFalse){
			String key = m.get("TOPIC_NAME");
			String value = String.valueOf(m.get("avg"));
			if("常识判断".equals(key)){
				CSPD.add(value);
			}else if("言语理解与表达".equals(key)){
				YYLJYBD.add(value);
			}else if("数量关系".equals(key)){
				SLGX.add(value);
			}else if("判断推理".equals(key)){
				PDTL.add(value);
			}else if("资料分析".equals(key)){
				ZLFX.add(value);
			}
		}
		list.add(CSPD);
		list.add(YYLJYBD);
		list.add(SLGX);
		list.add(PDTL);
		list.add(ZLFX);
		return list;
	}
	
	/**
	 * 统计分析(个人平均答题数)
	 * @param answer
	 * @return
	 */
	@RequestMapping(value="/getAnalyse.do")
	@ResponseBody
	List<List<String>> getAnalyse(String answer){
		List<List<String>> list = new ArrayList<>();
		List<String> header = new ArrayList<>();
		header.add("product");
		List<String> CSPD = new ArrayList<>();
		List<String> YYLJYBD = new ArrayList<>();
		List<String> SLGX = new ArrayList<>();
		List<String> PDTL = new ArrayList<>();
		List<String> ZLFX = new ArrayList<>();
		CSPD.add("常识判断");
		YYLJYBD.add("言语理解与表达");
		SLGX.add("数量关系");
		PDTL.add("判断推理");
		ZLFX.add("资料分析");
		List<Map<String, String>> map = service.getAnalyse(answer);
		int i = 0;
		for(Map<String, String> m: map){
			String nickName = m.get("nick_name");
			String topicName = m.get("TOPIC_NAME");
			Object obj = m.get("count");
			String value = obj.toString();
			if(!header.contains(nickName)){
				i++;
				CSPD.add("0");
				YYLJYBD.add("0");
				SLGX.add("0");
				PDTL.add("0");
				ZLFX.add("0");
				header.add(nickName);
			}
			if("常识判断".equals(topicName)){
				CSPD.set(i, value);
			}else if("言语理解与表达".equals(topicName)){
				YYLJYBD.set(i, value);
			}else if("数量关系".equals(topicName)){
				SLGX.set(i, value);
			}else if("判断推理".equals(topicName)){
				PDTL.set(i, value);
			}else if("资料分析".equals(topicName)){
				ZLFX.set(i, value);
			}
		}
		list.add(header);
		list.add(CSPD);
		list.add(YYLJYBD);
		list.add(SLGX);
		list.add(PDTL);
		list.add(ZLFX);
		return list;
	}
}
