* 域名
- www.lrans.xin

* 登录
- url: doLogin
- 方式: POST
- 参数: 
```
{
	loginName: '',
	password: '',
	type: 'S(学生), T(教师)'
}
```
- 返回值:
```
{
	status: '',
	message: '',
	object: {
		id: '',
		loginName:'',
		type: '',
		status: ''
	}
}
```

* 分类编码(topicCode)
- 常识判断: CSPD
- 言语理解与表达: YYLJYBD
- 数量关系: SLGX
- 判断关系: PDGX
- 资料分析: ZLFX

* 自动组卷
- url: /topicMain/getTopicMain.do
- 方式: GET
- 参数: topicCode=topicCode&creatorId=creatorId
- 返回值:

```
{`
	id: '主表id',
	testTitle: '考试标题',
	testType: '试卷类型', 
	creatrTime: '答卷时间',
	detail: [
		{
			id: '明细表id',
			ansTitle: '明细表标题',
			ansOption: '选项',
			ansAnswer: '答案',
			topicMainId: '主表id'
		}
	]
}
```

* 自动改卷
- url: /topicMain/checkTopicMain.do
- 方式: POST
- 参数: 

```
{
	id: '主表id',
	detail: [
		{
			id: '明细表id',
			ansMyAnswer: '答案'
		}
	]
}
```
- 返回值:
```
{
	id: '主表id',
	testTitle: '考试标题',
	testType: '试卷类型', 
	creatrTime: '答卷时间',
	detail: [
		{
			id: '明细表id',
			ansTitle: '明细表标题',
			ansOption: '选项',
			ansAnswer: '答案',
			topicMainId: '主表id'
		}
	]
}
```

* 练习历史
- url: /topicMain/history.do
- 方式: GET
- 参数: 
- 返回值:
```
{
	id: "", 
	testTitle: "",
	creatrTime: "",
	testCreatorId: "",
	testTitle: "",
	testType: "",
	updateTime: "没有这个时间则为没有交卷"
}
```

* 我的错题
- url: /ansCard/error.do
- 方式: POST
- 参数: 
```
{
	ansId: '创建者id'
}
```
- 返回值:
```
[
	{
		id: 'id',
		ansTitle: '明细表标题',
		ansOption: '选项',
		ansAnswer: '答案',
		ansMyAnswer: '我的答案',
		topicMainId: '主表id'
	}
]
```

* 获取试卷内容
- url: /topicMain/getTopicMainById.do
- 方式: POST
- 参数: 
```
{id: id}
```
- 返回值:
```
{
	id: '主表id',
	testTitle: '考试标题',
	testType: '试卷类型', 
	creatrTime: '答卷时间',
	detail: [
		{
			id: '明细表id',
			ansTitle: '明细表标题',
			ansOption: '选项',
			ansAnswer: '答案',
			topicMainId: '主表id'
		}
	]
}
```

* 获取文件列表
- url: /fileInfo/getFileInfo.do
- 方式: GET
- 参数:
```
{
	fileName: '',
	fileType: ''
}
```
- 返回值:
```
{
	id: '',
	fileName: '',
	fileSize: '',
	filePath: '',
	fileType: '',
	createTime: ''
}
```

* 文件下载
- url: /fileInfo/download.do
- 方式: GET
- 参数: id=id
