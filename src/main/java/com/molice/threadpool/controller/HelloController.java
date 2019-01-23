package com.molice.threadpool.controller;

import com.molice.threadpool.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author molice
 * @date 2019/1/23
 **/
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String submit(){
        logger.info("start submit");

        //启动一个异步任务
        asyncService.executeAsync();

        logger.info("end submit");

        return "success";
    }
}
