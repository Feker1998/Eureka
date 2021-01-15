package com.feker.serviceconsumerribbon.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Value("http://service-producer/postPortInfo/")
    String urlPost;

    @Value("http://service-producer/getPortInfo/")
    String urlGet;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/postPoducerInfo")
    public String postPoducerInfo() {
        JSONObject json = new JSONObject();
        json.put("age", 18);
        json.put("name", "小芳");
        json.put("address", "广东深圳");
        String result = this.restTemplate.postForObject(urlPost,json,String.class);
        return result;
    }

    @GetMapping("/getPoducerInfo")
    public String getPoducerInfo() {
        Integer id=1;
        String result = this.restTemplate.getForObject(urlGet+id,String.class);
        return result;
    }

}
