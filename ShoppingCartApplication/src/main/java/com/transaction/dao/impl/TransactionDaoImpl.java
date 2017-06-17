package com.transaction.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ShoppingCartApplication.entity.Product;
import com.ShoppingCartApplication.entity.PurchaseDetails;
import com.transaction.dao.TransactionDao;

@Component("transactionDao")
public class TransactionDaoImpl implements TransactionDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> getProducts() {
		List<Product> productList =null;
		Product product =new Product();
		product.setProductIndentifier(1);
		product.setProductName("apple");
		product.setPrice(BigDecimal.TEN);
		productList.add(product);
		try{
			Session session=sessionFactory.openSession(); 
			Query query = (Query) session.getNamedQuery("getAllProducts");
			productList = query.getResultList();
		}
		catch(EmptyResultDataAccessException emptyResultexception){
			
		}
		return productList;
	}

	public List<PurchaseDetails> getPurchaseDetails() {
		List<PurchaseDetails> purchaseDetailsList =null;
		PurchaseDetails purchaseDetails =new PurchaseDetails();
		purchaseDetailsList.add(purchaseDetails);
		try{
			Session session=sessionFactory.openSession(); 
			Query query = (Query) session.getNamedQuery("getAllProducts");
			purchaseDetailsList = query.getResultList();
		}
		catch(EmptyResultDataAccessException emptyResultexception){
			
		}
		return purchaseDetailsList;
	}

	public int insertPurchaseDetails(PurchaseDetails purchaseDetails) {
		int purchaseDetailIdentifier= 0;
		try{
			Session session=sessionFactory.openSession(); 
			purchaseDetailIdentifier =(Integer) session.save(purchaseDetails);
		}
		catch(EmptyResultDataAccessException emptyResultexception){
			
		}
		return purchaseDetailIdentifier;
	}

}
