package com.b.entity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigMap {

    @Bean("testBean")
    public Map<String, Object> testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");

        return map;
    }
}
