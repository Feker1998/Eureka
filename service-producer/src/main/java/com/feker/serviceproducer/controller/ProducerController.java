package com.feker.serviceproducer.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProducerController {

    @PostMapping("/getPortInfo")
    public String produce(@RequestBody JSONObject jsonObject) {
        log.info("传入参数为   {}",jsonObject.toString());
        jsonObject.put("id",10086);
        return "调用服务的端口号为：" + jsonObject;
    }
}
