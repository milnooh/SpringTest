package com.changhoon.spring.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changhoon.spring.lesson03.dao.RealEstateDAO;
import com.changhoon.spring.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		return realEstateDAO.selectRealEstate(id);
	}
	
	public List<RealEstate> getRealEstateByRentPrice(int rent) {
		return realEstateDAO.selectRealEstateByRentPrice(rent);
	}
	
	public List<RealEstate> getRealEstateByAreaPrice(int area, int price) {
		return realEstateDAO.selectRealEstateByAreaPrice(area, price);
	}
	
	// add
	public int addRealEstateAsObject(RealEstate realEstate) {
		return realEstateDAO.insertRealEstateAsObject(realEstate);
	}
	
	public int addRealEstate(int realtorId,String address, int area, String type, int price, int rentPrice) {
		return realEstateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice);
	}
	
	// update test03
	public int updatedRealEstate(RealEstate realEstate) {
		return realEstateDAO.updatedRealEstae(realEstate);
	}
}
