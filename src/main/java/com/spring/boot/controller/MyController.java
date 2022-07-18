package com.spring.boot.controller;

import com.spring.boot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/6/8
 */


@RestController
@RequestMapping("/homepage")
public class MyController {

    @Autowired
    MyService myService;

    @PostMapping("/postSend")
    public Map<String, Object> postSend() {
        return myService.postSend();
    }
}
