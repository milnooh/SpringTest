package com.changhoon.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.changhoon.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {

	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateByRentPrice(@Param("rent") int rent);
	
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
	
	// test02_1
	public int insertRealEstateAsObject(RealEstate realEstate);
	
	// test02_2
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice	
			);
	
	// update test03
	public int updatedRealEstae(RealEstate realEstate);
}
