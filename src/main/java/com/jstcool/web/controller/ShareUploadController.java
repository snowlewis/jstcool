package com.jstcool.web.controller;

import com.jstcool.util.DevLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 13-12-14.
 */
@Controller
public class ShareUploadController {
            @RequestMapping(value = "/share-upload", method = RequestMethod.GET)
            public String shareUploadView(){
                DevLog.info(this,"into share-upload------------>");
                return "homePage";
    }
}
