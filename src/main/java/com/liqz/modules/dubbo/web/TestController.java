package com.liqz.modules.dubbo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/test")
@Controller
public class TestController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
