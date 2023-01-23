package com.example.product.kafka;

import com.example.product.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class KafkaPublishingService {
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    KafkaTemplate kafkaTemplate;

    public void sendProductInformation( Product product){

        try{
            kafkaTemplate.send("SEND.PRODUCT.INFO", this.objectMapper.writeValueAsString(product));
        }catch(Exception e){
        System.out.print(e);
        }

    }
}
