package com.feker.serviceconsumerribbon.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Value("http://service-producer/getPortInfo")
    String url;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getPoducerInfo")
    public String getPoducerInfo() {
        JSONObject json = new JSONObject();
        json.put("age", 18);
        json.put("name", "小芳");
        json.put("address", "广东深圳");
        String result = this.restTemplate.postForObject(url,json,String.class);
        return result;
    }
}
