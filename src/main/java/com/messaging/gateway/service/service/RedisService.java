package com.messaging.gateway.service.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RedisService {

    public void saveDataRedis(){
        //TODO caching data
        log.info("save data of cache");
    }

    public String getDataFromCache(String prefixName){
        //TODO return data from cache
        return "data";
    }
}
