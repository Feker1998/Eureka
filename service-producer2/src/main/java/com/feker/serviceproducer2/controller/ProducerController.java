package com.feker.serviceproducer2.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ProducerController {
    @Value("${server.port}")
    String serverPort;

    @Value("http://service-consumer-ribbon/getPortInfo/")
    String url;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/postPortInfo")
    public String producePost(@RequestBody JSONObject jsonObject) {
        log.info("传入参数为   {}",jsonObject.toString());
        jsonObject.put("id",10087);
        return "调用服务的端口号为：" + serverPort+ "   返回值为："+jsonObject;
    }

    @GetMapping("/getPortInfo/{id}")
    public String produceGet(@PathVariable("id") Integer id) {
        log.info("传入参数为   {}",id);
        id+=1;
        return "调用服务的端口号为：" + serverPort+ "   返回值为："+id;
    }

    @GetMapping("/getConsumerInfo")
    public String getPoducerInfo() {
        Integer id=3;
        String result = this.restTemplate.getForObject(url+id,String.class);
        return result;
    }
}
