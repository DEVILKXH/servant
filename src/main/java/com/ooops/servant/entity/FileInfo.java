package com.ooops.servant.entity;

import java.util.Date;

import com.core.extend.base.entity.BaseEntity;

public class FileInfo extends BaseEntity{	
	
	private String parentFileId;
	public String getParentFileId() {
		return parentFileId;
	}
	public void setParentFileId(String parentFileId) {
		this.parentFileId = parentFileId;
	}
	
}
