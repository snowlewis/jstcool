package com.jstcool.web.controller;

import com.jstcool.util.DevLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String homepage() {
        DevLog.info(this, "这是一个很好玩的网站");
        return "homePage";
    }

}
