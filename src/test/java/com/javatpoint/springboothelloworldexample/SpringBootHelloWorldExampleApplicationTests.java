package com.javatpoint.springboothelloworldexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootHelloWorldExampleApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootHelloWorldExampleApplicationTests.class);

	//@Test
	void contextLoads() {
		assertEquals(true,true);
		
		
	}

	

}
