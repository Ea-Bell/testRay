package com.example.demo.test.respository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Test;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class testRepository {

	private final SqlSessionTemplate sessionTemplate;

	public void testInsert(Test test) {
		log.info("저장 완료");
		sessionTemplate.insert("InsertTest", test);
	}
	
}
