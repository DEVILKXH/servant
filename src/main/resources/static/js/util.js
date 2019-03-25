/**
 * 
 */

function setCookie(name, value, iDay)
{
	var oDate=new Date();
	
	oDate.setDate(oDate.getDate()+iDay);
	
	document.cookie=name+'='+value+';expires='+oDate;
}

function getCookie(name)
{
	var arr=document.cookie.split('; ');
	var i=0;
	
	
	for(i=0;i<arr.length;i++)
	{
		var arr2=arr[i].split('=');
		
		if(arr2[0]==name)
		{
			return arr2[1];
		}
	}
	
	return '';
}

function removeCookie(name)
{
	setCookie(name, '1', -1);
}

function myAlert(value){
	console.log(value);
}

function isNull(value){
	if(null == value || undefined == value || "" == value){
		return true;
	}
	return false;
}


function $post(options){
	var url = options.url || ''
	var data = options.data
	var callback = options.callback || function() {}
	var errors = options.errors || function(res){console.log(res);myAlert('服务器出错')}
	$.ajax({
		url: url,
		data: JSON.stringify(data),
		type: 'POST',
		contentType:'application/json;charset=utf-8',
		dataType : "json",
		success: callback,
		error: errors
	})
}