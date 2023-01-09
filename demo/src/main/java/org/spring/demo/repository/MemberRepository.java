package org.spring.demo.repository;

import org.spring.demo.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
//	@Entity 객체를 사용한다. 
	
	
}
