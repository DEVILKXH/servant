package com.ooops.servant.entity;

import java.util.Date;

import com.core.extend.base.entity.BaseEntity;

public class FileInfo extends BaseEntity{	
		private String fileName;   	private String fileSize;   	private String filePath;   	private String fileType;   	private Date createTime;
	private String parentFileId;	public String getFileName() {	    return this.fileName;	}	public void setFileName(String fileName) {	    this.fileName=fileName;	}	public String getFileSize() {	    return this.fileSize;	}	public void setFileSize(String fileSize) {	    this.fileSize=fileSize;	}	public String getFilePath() {	    return this.filePath;	}	public void setFilePath(String filePath) {	    this.filePath=filePath;	}	public String getFileType() {	    return this.fileType;	}	public void setFileType(String fileType) {	    this.fileType=fileType;	}	public Date getCreateTime() {	    return this.createTime;	}	public void setCreateTime(Date createTime) {	    this.createTime=createTime;	}
	public String getParentFileId() {
		return parentFileId;
	}
	public void setParentFileId(String parentFileId) {
		this.parentFileId = parentFileId;
	}
	
}

