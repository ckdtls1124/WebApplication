package org.spring.demo.DI;

import org.springframework.beans.factory.annotation.Autowired;

public class DIMain {

//	1. Using Constructor
	
//	1-1.
	private DISub disub;
	
	public DIMain(DISub disub) {
		this.disub=disub;
//	Loose connection => DI
	}
	
	
//	1-2.
	public static void main(String[] args) {
		DISub d1=new DISub();
//	Strong connection => DL(?)
	}
	
	
//	2. Using setters
	public void setDisub(DISub disub) {
		this.disub = disub;
	}
	
	
//	3. Using @AutoWired : it automatically connects the external Bean
	@Autowired
	private DISub disub2;
	
	
}
