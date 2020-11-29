package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
	}

	@Test
	public void testThat(){
		Assert.assertNotNull("Hello");
	}


}
