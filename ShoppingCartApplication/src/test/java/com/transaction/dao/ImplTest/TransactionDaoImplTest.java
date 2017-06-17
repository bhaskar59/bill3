package com.transaction.dao.ImplTest;

import java.util.List;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.ShoppingCartApplication.entity.Product;
import com.transaction.dao.TransactionDao;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-dao-test.xml" })
@TransactionConfiguration
public class TransactionDaoImplTest {
	
	@Autowired
	public TransactionDao transactionDao;
	
	
	public TransactionDao getTransactionDao() {
		return transactionDao;
	}


	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}


	@Test
	public void testGetAllProducts(){
		List<Product> productlist = transactionDao.getProducts();
		Assert.assertTrue(!productlist.isEmpty());
	}
	

}
