package org.spring.SpringMVC0109.dto;



public class LombokEx {
	public static void main(String[] args) {

		MemberDTO work = new MemberDTO();
//		work.(no)

		work.setUsername("test0109");
		work.setUserpw("test0109!");
		work.setUserage("45");

		System.out.println(work.getUsername());
		System.out.println(work.getUserpw());
		System.out.println(work.getUserage());
		
		work.toString();
	}
}