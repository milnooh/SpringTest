package com.changhoon.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.changhoon.spring.lesson04.model.Seller;

@Repository
public interface SellerDAO {
	public int insertUser(
			@Param("nickName") String nickName
			, @Param("profileImageUrl") String profileImageUrl
			, @Param("temperature") double temperature);
	
	public Seller selectLastSeller();
}
