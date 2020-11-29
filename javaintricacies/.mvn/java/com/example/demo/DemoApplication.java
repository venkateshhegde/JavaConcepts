package com.example.demo;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Assert.isNull(null, "Hello");
		try
		{
			System.out.println(100_000);//System.out.println( Integer.parseInt("100_000"));
		}
		catch(NumberFormatException e){e.printStackTrace();}


	}

}
