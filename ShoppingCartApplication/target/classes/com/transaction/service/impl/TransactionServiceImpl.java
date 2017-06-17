package com.transaction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ShoppingCartApplication.entity.Product;
import com.transaction.dao.TransactionDao;
import com.transaction.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	TransactionDao transactionDao;

	public List<Product> getProducts() {
		return transactionDao.getProducts();
	}

}
