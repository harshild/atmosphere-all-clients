package com.harshild;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AtmosphereServer.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AtmosphereServerTest {
    @Test
    public void dummy(){

    }
}
