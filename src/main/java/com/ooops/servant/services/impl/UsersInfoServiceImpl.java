package com.ooops.servant.services.impl;

import org.springframework.stereotype.Service;
import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.UsersInfo;
import com.ooops.servant.mapper.UsersInfoMapper;
import com.ooops.servant.services.UsersInfoService;

@Service
public class UsersInfoServiceImpl extends BaseServiceImpl<UsersInfo, UsersInfoMapper> implements UsersInfoService {

}

