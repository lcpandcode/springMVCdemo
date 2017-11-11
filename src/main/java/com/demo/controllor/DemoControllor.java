package com.demo.controllor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lcplcp on 2017/11/11.
 */
@Controller
public class DemoControllor {
    private static final Logger logger = LoggerFactory.getLogger(DemoControllor.class);
    @RequestMapping("/index")
    public String index(){
        logger.info("request in");
        return "/index";
    }
}
