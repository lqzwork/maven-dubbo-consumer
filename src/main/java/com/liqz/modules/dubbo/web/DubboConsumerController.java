package com.liqz.modules.dubbo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liqz.modules.dubbo.api.MyService;
import com.liqz.modules.dubbo.api.MyService2;

@RequestMapping("/dubbo")
@RestController
public class DubboConsumerController {
    @Autowired
    private MyService myService;
    @Autowired
    private MyService2 myService2;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return myService.getName() + "  " + myService2.getName2();
    }
}
