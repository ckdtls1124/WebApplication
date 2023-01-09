package org.spring.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test example");
	}
	
	/*
	 * @Test void calculatorAddTest() { Calculator work=new Calculator();
	 * 
	 * assertEquals(20, work.add(10, 10)); System.out.println("더하기 테스트"); }
	 * 
	 * @Test void calculatorSubTest() { Calculator work=new Calculator();
	 * 
	 * assertEquals(0, work.sub(10, 10)); System.out.println("빼기 테스트"); }
	 * 
	 * @Test void calculatorMultiTest() { Calculator work=new Calculator();
	 * 
	 * assertEquals(20, work.multi(10, 10)); System.out.println("곱하기 테스트"); }
	 * 
	 * @Test void calculatorDivTest() { Calculator work=new Calculator();
	 * 
	 * assertEquals(1, work.div(10, 10)); System.out.println("나누기 테스트"); }
	 */
	
}
