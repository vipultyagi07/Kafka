package com.vip.service;

import org.springframework.kafka.core.KafkaTemplate;

public interface CabLocationService {
    boolean updateLocation(String location);
}