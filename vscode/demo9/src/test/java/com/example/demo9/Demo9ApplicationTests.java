package com.example.demo9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo9ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("context is started");
		System.out.println("line is running");
		Assertions.assertTrue(100>50);
		System.out.println("line 2 is running");
		System.out.println("line 3 is running");

	}

}
