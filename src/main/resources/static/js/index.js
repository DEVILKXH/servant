/**
 * 
 */
var options = {
	0: 'A', 1: 'B', 2: 'C', 
	3: 'D', 4: 'E', 5: 'F', 
	6: 'G', 7: 'H', 8: 'I', 9: 'J'
}
$(function(){
	$(".tpl-content-wrapper").on('click', '.am-panel-add-option', function(){
		var $this = $(this);
		var $body = $this.closest(".ooops-ques-list").find(".am-panel-bd");
		var length = $body.find("span").length;
		var html = "<p class='ooops-options'><span>"+ options[length] +".</span><input type='hidden' value='"+ options[length] +"' class='option-value'><input type='text' value='' placeholder='请输入选项内容' class='ooops-ques-option-input option-text' /><img src='/img/delete.png' width='24' class='ooops-option-del'/></p>";
		$body.append(html)
	});
	
	$(".tpl-content-wrapper").on('click', '.ooops-option-del', function(){
		var $this = $(this);
		var $body = $this.closest(".am-panel-bd");
		$this.closest('p').remove();
		var $options = $body.find("p");
		$options.each(function(i, item){
			$(item).find("span").text(options[i] + ".");
			$(item).find(".option-value").val(options[i]);
		});
	});
	
	$(".tpl-content-wrapper").on('click', '.ooops-ques-del', function(){
		var $this = $(this);
		$this.closest('.ooops-ques-list').remove();
	});
	
	$(".am-panel-add-ques").click(function(){
		var html = '<div class="am-panel am-panel-default ooops-ques-list">' +
					'<div class="ooops-ques-del"></div>' +
				   	'<div class="am-panel-hd ooops-ques-title">' +
				  	'	<input type="text" placeholder="请输入题目" class="ooops-ques-title-input form-data" name="quesTitle">' +
				  	'</div>' +
				  	'<div class="am-panel-bd">' +
				  	'<p class="ooops-options"><span>A.</span><input type="hidden" value="A" class="option-value"><input type="text" value="" placeholder="请输入选项内容" class="ooops-ques-option-input option-text" /><img src="/img/delete.png" width="24" class="ooops-option-del"/></p>' + 
				  	'</div>' +
				  	'<div class="am-panel-foot-answer">' +
			  		'<span class="ques-answer-lab">答案: </span>' +
			  		'<input type="text" class="ooops-ques-answer-input form-data" placeholder="请输入正确答案" name="quesAnswer" />' +
				  	'</div>' + 
				  	'<div class="am-panel-foot-answer">' +
			  		'<span class="ques-answer-lab">解析: </span>' +
			  		'<textarea class="ooops-ques-answer-area form-data" placeholder="请输入正确解析" name="quesDesc" ></textarea>' +
				  	'</div>' + 
				  	'<div class="am-panel-add-option">' +
				  	'	<img src="/img/add.png">' +
				  	'</div>' +
				'</div>';
		$(html).insertBefore($(this))
	});
});