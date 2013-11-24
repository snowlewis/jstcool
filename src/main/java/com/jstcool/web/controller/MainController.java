package com.jstcool.web.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jstcool.util.DevLog;

@Controller
public class MainController {

	Logger log = Logger.getLogger(MainController.class);
	
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public String homepage() {
		System.out.println("2222!!!!!!!!g我是说阿斯多夫" + new Date());
		log.info("adfadsfasdfasdfasdf");
		DevLog.info(this, "11111111111111111111");
		return "homePage";
	}

}
