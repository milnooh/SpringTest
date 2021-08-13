package com.changhoon.spring.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.changhoon.spring.lesson02.dao.StoreDAO;
import com.changhoon.spring.lesson02.model.Store;

public class StoreBO {
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList() {
		return storeDAO.selectStoreList();
	}
}
