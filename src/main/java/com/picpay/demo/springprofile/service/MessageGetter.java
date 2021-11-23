package com.picpay.demo.springprofile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageGetter implements ResponseGetter {

    @Value("${response.message}")
    private String message;

    @Override
    public String get() {
        return message;
    }

}
