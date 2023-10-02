package com.example.college;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")
@SpringJUnitConfig
@ActiveProfiles("test")
public class H2ApplicationContextTest {

    @Test
    public void contextLoadsH2ConsoleCheck() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE); //remember to manually shut down this connection
    }

    @Test
    public void contextLoads(){
    }
}