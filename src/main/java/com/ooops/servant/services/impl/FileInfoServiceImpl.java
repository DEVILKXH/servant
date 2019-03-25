package com.ooops.servant.services.impl;

import java.io.File;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.FileInfo;
import com.ooops.servant.mapper.FileInfoMapper;
import com.ooops.servant.services.FileInfoService;

@Service
@Primary
public class FileInfoServiceImpl extends BaseServiceImpl<FileInfo, FileInfoMapper> implements FileInfoService {

	@Override
	public int deleteByPrimaryKey(FileInfo entity) {
		FileInfo fileInfo = mapper.selectByPrimaryKey(entity);
		File file = new File(fileInfo.getFilePath());
		if(file.exists()){
			file.delete();
		}
		return mapper.deleteByPrimaryKey(entity);
	}
}

