package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {
/*

@startuml
!pragma graphviz_dot jdot

class Dummy {
  String data
  void methods()
}
@enduml

@startuml
!pragma graphviz_dot jdot

class Flight {
   flightNumber : Integer
   departureTime : Date
}

Object <|-- ArrayList


@enduml

@startuml
!$ab = "foo1"
!$cd = "foo2"
!$ef = $ab + $cd

Alice -> Bob : $ab
Alice -> Bob : $cd
Alice -> Bob : $ef
@enduml

 */
	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
	}

	@Test
	public void testThat(){
		Assert.assertNotNull("Hello");
	}


}
