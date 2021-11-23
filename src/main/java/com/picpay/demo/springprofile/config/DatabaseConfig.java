package com.picpay.demo.springprofile.config;

import com.picpay.demo.springprofile.service.DatabaseGetter;
import com.picpay.demo.springprofile.service.ResponseGetter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Profile("database")
@Configuration
public class DatabaseConfig {

    private final JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        jdbcTemplate.execute("CREATE TABLE response (message VARCHAR(200))");
        jdbcTemplate.execute("INSERT INTO response (message) VALUES ('RESPONSE FROM DATABASE')");
    }

    @Bean
    @Primary
    public ResponseGetter responseGetter(DatabaseGetter databaseGetter) {
        return databaseGetter;
    }

}
