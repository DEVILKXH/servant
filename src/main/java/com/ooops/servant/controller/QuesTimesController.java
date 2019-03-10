package com.ooops.servant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.extend.base.controller.BaseController;
import com.ooops.servant.entity.QuesTimes;
import com.ooops.servant.services.QuesTimesService;

@Controller
@RequestMapping(value="/servent/quesTimes")
public class QuesTimesController extends BaseController<QuesTimes, QuesTimesService> {
	
}
