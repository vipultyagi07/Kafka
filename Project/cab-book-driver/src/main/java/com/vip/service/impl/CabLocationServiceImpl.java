package com.vip.service.impl;

import com.vip.common.Constant;
import com.vip.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationServiceImpl implements CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Override
    public boolean updateLocation(String location){

        // This is where we push our data to kafka --> PRODUCER
        kafkaTemplate.send(Constant.CAB_LOCATION,location);
        return true;

    }


}
