package org.spring.demo.service;

import org.spring.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
//	@Repository를 주입한다.
	
	
	@Autowired
	private MemberRepository memberRepo;
	
}
