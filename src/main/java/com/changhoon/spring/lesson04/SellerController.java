package com.changhoon.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.changhoon.spring.lesson04.bo.SellerBO;
import com.changhoon.spring.lesson04.model.Seller;

@RequestMapping("/lesson04/test01")
@Controller
public class SellerController {
	@Autowired
	private SellerBO sellerBO;
	
	@RequestMapping("/1")
	public String ex01() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/add_seller")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickName") String nickName
			, @RequestParam("profileImageUrl") String prfileImageUrl
			, @RequestParam("temperature") double temperature) {
		int count = sellerBO.addSeller(nickName, prfileImageUrl, temperature);
		
		return "입력 성공 : " + count;
	}
	
	@GetMapping("/2")
	public String lastSeller(@RequestParam(value = "id", required = false) int id
			, Model model) {
		
		Seller seller = null;
//		if(id == null) {
//			seller = sellerBO.getLastSeller();
//		} else {
//			seller = sellerBO.getSeller(id);
//		}
		
//		Seller seller = sellerBO.getLastSeller();
//		model.addAttribute("result", seller);
		
		model.addAttribute("result", seller);
		
		return "lesson04/sellerInfo";
	}

}
