package com.changhoon.spring.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.changhoon.spring.lesson04.model.Realtor;

@Repository
public interface RealtorDAO {
	
	public int insertRealtor(Realtor realtor);
}
