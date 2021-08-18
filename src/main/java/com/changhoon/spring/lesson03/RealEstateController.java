package com.changhoon.spring.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.changhoon.spring.lesson03.bo.RealEstateBO;
import com.changhoon.spring.lesson03.model.RealEstate;

@RequestMapping("/lesson03")
@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO; 
	
	@RequestMapping("/test01/1")
	@ResponseBody
	public RealEstate test01_1(@RequestParam("id") int id) {
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/test01/2")
	@ResponseBody
	public List<RealEstate> test1_2(@RequestParam("rent") int rent) {
		return realEstateBO.getRealEstateByRentPrice(rent);
	}
	
	@RequestMapping("/test01/3")
	@ResponseBody
	public List<RealEstate> test1_3(
			@RequestParam("area") int area
			, @RequestParam("price") int price 
			) {
		return realEstateBO.getRealEstateByAreaPrice(area, price);
	}
	
	@RequestMapping("/test02/1")
	@ResponseBody
	public String test2_1() {
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104동");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateBO.addRealEstateAsObject(realEstate);
		
		return "입력결과 : " +  count;				
	}
	
	@RequestMapping("/test02/2")
	@ResponseBody
	public String test2_2(@RequestParam("realtorId") int realtorId) {
		
		int count = realEstateBO.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력결과 : " +  count;	
	}
	
	// update
	@RequestMapping("/test03")
	@ResponseBody
	public String test03() {
		RealEstate realEstate = new RealEstate();
		realEstate.setId(24);
		realEstate.setType("전세");
		realEstate.setPrice(70000);
		
		int count = realEstateBO.updatedRealEstate(realEstate);
		
		return "수정성공 : " + count;				
	}

}
