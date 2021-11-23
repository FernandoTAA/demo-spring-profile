package com.picpay.demo.springprofile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Profile("database")
@Service
@RequiredArgsConstructor
public class DatabaseGetter implements ResponseGetter {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public String get() {
        return jdbcTemplate.queryForObject("SELECT message FROM response", String.class);
    }

}
