package com.transaction.dao;

import java.util.List;

import com.ShoppingCartApplication.entity.Product;
import com.ShoppingCartApplication.entity.PurchaseDetails;

public interface TransactionDao {
	
	public List<Product> getProducts();
	
	public List<PurchaseDetails> getPurchaseDetails();
	
	public int insertPurchaseDetails(PurchaseDetails purchaseDetails);

}
