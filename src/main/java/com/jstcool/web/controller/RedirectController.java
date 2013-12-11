package com.jstcool.web.controller;


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RedirectController {
    @RequestMapping(value = "/link/{key}", method = RequestMethod.GET)
    public String link(@RequestParam(value = "key") String key) {
        if (StringUtils.isBlank(key)) {

        }
        return "";
    }
}
