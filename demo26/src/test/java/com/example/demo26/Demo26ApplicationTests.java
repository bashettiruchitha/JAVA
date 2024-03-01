package com.example.demo26;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo26.layer3.AccountRepository;

@SpringBootTest
class Demo26ApplicationTests {
	@Autowired
	AccountRepository accountrepo;

	@Test
	void contextLoads() {
	}


}
