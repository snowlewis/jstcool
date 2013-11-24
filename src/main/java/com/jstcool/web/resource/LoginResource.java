package com.jstcool.web.resource;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.jstcool.util.DevLog;

@Controller
public class LoginResource {

	@RequestMapping(value = "/service/login", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password) {

		DevLog.info(this, String.format("[/service/login] loginName = %s , password = %s .", loginName, password));

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "00");
		resultMap.put("message", "");

		String result = new Gson().toJson(resultMap);

		DevLog.info(this, String.format("[/service/login] result = %s ", result));

		return result;
	}
}
