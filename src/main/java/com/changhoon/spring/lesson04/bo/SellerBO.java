package com.changhoon.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changhoon.spring.lesson04.dao.SellerDAO;
import com.changhoon.spring.lesson04.model.Seller;

@Service
public class SellerBO {
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickName, String profileImageUrl, double temperature) {
		return sellerDAO.insertUser(nickName, profileImageUrl, temperature);
	}
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
	}
}
