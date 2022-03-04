package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class jUnitTestMyRestController {
	
	@Autowired
    private MyRestController myRestController;
 
    @Test
    void contextLoads() {
        assertThat(myRestController).isNotNull();

}
}
