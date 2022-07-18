package com.spring.boot.service;

import com.spring.boot.common.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

@Service
@EnableScheduling
public class MyService {

    @Resource
    private RestTemplate restTemplate;

    String URL = "http://localhost:8888/homepage/postReceiveByMap";

    public Map<String, Object> postSend(){

        //RestTemplate在postForObject时，用MultiValueMap，不可使用HashMap。
        MultiValueMap<String, String> sendData = new LinkedMultiValueMap<>();
        sendData.add("number", "3");
        sendData.add("name", "张三");


        ResponseEntity<ResponseResult> responseData = restTemplate.postForEntity(URL, sendData, ResponseResult.class);
        Map<String, Object> returnData = new HashMap<>();
        returnData.put("StatusCode:", responseData.getStatusCode());
        returnData.put("Body:", responseData.getBody());

        System.out.println("sendData:" + sendData + "\n");
        System.out.println("responseData:" + responseData + "\n");
        System.out.println("returnData:" + returnData + "\n");

        return returnData;
    }

}
