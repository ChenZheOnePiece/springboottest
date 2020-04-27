package com.example.redistest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping(value = "/redisput")
    public String redisTest() {
        ValueOperations forValue = redisTemplate.opsForValue();
        int random = (int) (Math.random() * 100000);
        int randomv = (int) (Math.random() * 100000);
        redisTemplate.opsForValue().set("test",random,6000L, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set(randomv,random,6000L, TimeUnit.SECONDS);
        return "success";
    }


    @GetMapping(value = "/redisgget")
    public String redisGet() {
        Object chenzhe = redisTemplate.opsForValue().get("test");
        return chenzhe.toString();
    }

    @GetMapping(value = "/redishget")
    public Object redisHGet() {
        Map<String,String> entries = redisTemplate.opsForHash().entries("hk");
        return entries;
    }

    @GetMapping(value = "/redishset")
    public Object redisHSet() {
        int random = (int) (Math.random() * 10000);
        int random2 = (int) (Math.random() * 10000);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(random, random2);

        redisTemplate.opsForHash().put("hk",random,random2);
        return "success";
    }
}
