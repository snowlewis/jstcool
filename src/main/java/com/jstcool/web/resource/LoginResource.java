package com.jstcool.web.resource;

import com.google.gson.Gson;
import com.jstcool.dao.TestDAO;
import com.jstcool.domain.TestDTO;
import com.jstcool.util.DevLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/service", method = {RequestMethod.POST, RequestMethod.GET})
public class LoginResource {

    @Autowired
    private TestDAO testDAO;

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password) {
        System.out.println("[/service/login] ");
        DevLog.info(this, String.format("[/service/login] loginName = %s , password = %s .", loginName, password));

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", "00");

        TestDTO test = testDAO.findTestDTOByName("test");

        resultMap.put("message", test.toString());
        String result = new Gson().toJson(resultMap);

        DevLog.info(this, String.format("[/service/login] result = %s ", result));
        return result;
    }
}
