package com.picpay.demo.springprofile;

import com.picpay.demo.springprofile.service.DatabaseGetter;
import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("database")
public class DatabaseIntegrationTest {

    @Autowired
    DatabaseGetter databaseGetter;

    @Test
    public void test() {
        val message = databaseGetter.get();
        Assertions.assertEquals("RESPONSE FROM DATABASE", message);
    }

}
