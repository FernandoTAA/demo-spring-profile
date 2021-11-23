package com.picpay.demo.springprofile.config;

import com.picpay.demo.springprofile.service.DatabaseGetter;
import com.picpay.demo.springprofile.service.MessageGetter;
import com.picpay.demo.springprofile.service.ResponseGetter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("!database")
@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class NoDatabaseConfig {

    @Bean
    @Primary
    public ResponseGetter responseGetter(MessageGetter messageGetter) {
        return messageGetter;
    }


}
