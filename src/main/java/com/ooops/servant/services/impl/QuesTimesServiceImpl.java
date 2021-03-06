package com.ooops.servant.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.core.extend.base.serviceimpl.BaseServiceImpl;
import com.ooops.servant.entity.QuesTimes;
import com.ooops.servant.mapper.QuesTimesMapper;
import com.ooops.servant.services.QuesTimesService;

@Service
@Primary
public class QuesTimesServiceImpl extends BaseServiceImpl<QuesTimes, QuesTimesMapper> implements QuesTimesService {

}

