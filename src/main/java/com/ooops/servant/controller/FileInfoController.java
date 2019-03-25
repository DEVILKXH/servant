package com.ooops.servant.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.core.extend.base.controller.BaseController;
import com.core.extend.vo.AjaxResult;
import com.ooops.servant.entity.FileInfo;
import com.ooops.servant.services.FileInfoService;

@Controller
@RequestMapping(value="/fileInfo")
public class FileInfoController extends BaseController<FileInfo, FileInfoService> {
	
	@Value("${upload.path}")
	private String UPLOADPATH;
	
	@RequestMapping("/index")
	public String index(){
		return "fileInfo/index";
	}
	
	@RequestMapping("/upload")
	public String upload(){
		return "fileInfo/upload";
	}
	
	@RequestMapping("/getFileInfo.do")
	@ResponseBody
	public List<FileInfo> getFileInfo(FileInfo entity){
		return service.select(entity);
	}
	
	@RequestMapping("/uploadFile.do")
	@SuppressWarnings("unused")
	public String uploadFile(HttpServletRequest request){
		String error = "";
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		File dir = new File(UPLOADPATH);
		if(!dir.exists()){
			dir.mkdirs();
		}
		for(MultipartFile file: files){
			String fileName = file.getOriginalFilename();
			if(file.isEmpty()){
				error += ("上传文件: " + fileName + " 失败");
			}
			int index = fileName.lastIndexOf(".");
			String type =  fileName.substring(index + 1, fileName.length());
			File target = new File(UPLOADPATH + fileName);
			try {
	            file.transferTo(target);
	            
	            FileInfo fileInfo = new FileInfo();
	            fileInfo.setId(UUID.randomUUID().toString());
	            fileInfo.setCreateTime(new Date());
	            fileInfo.setFileName(fileName);
	            fileInfo.setFilePath(UPLOADPATH + fileName);
	            fileInfo.setFileSize(file.getSize() + "");
	            fileInfo.setFileType(type);
	            service.insertSelective(fileInfo);
	        } catch (IOException e) {
	        	error += ("上传文件: " + fileName + " 失败");
	        }
		}
		return "fileInfo/index";
	}
	
	@RequestMapping(value = "/delete.do",method={RequestMethod.GET})
	@ResponseBody
	public AjaxResult<FileInfo> delete(FileInfo record){
		AjaxResult<FileInfo> ajax = new AjaxResult<FileInfo>();
		int flag = service.deleteByPrimaryKey(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("删除失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage("删除成功");
		}
		return ajax;
	}
	

	@RequestMapping(value = "/download.do",method={RequestMethod.GET})
	public void download(FileInfo record, HttpServletResponse response) throws Exception{
		FileInfo fileInfo = service.selectByPrimaryKey(record.getId());
		File file = new File(fileInfo.getFilePath());
		 response.setHeader("content-type", "application/octet-stream");
         response.setContentType("application/octet-stream");
         // 下载文件能正常显示中文
         response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileInfo.getFileName(), "UTF-8"));

         // 实现文件下载
         FileInputStream fis = new FileInputStream(file);
         OutputStream os = response.getOutputStream();
         byte [] b = new byte[1024];
         int length = 0;
         while ((length = fis.read(b)) != -1) {
             os.write(b, 0, length);
         }
         fis.close();
         os.close();
	}
}
