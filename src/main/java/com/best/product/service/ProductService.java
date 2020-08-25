package com.best.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best.product.dao.ProductDao;
import com.best.product.model.Category;
import com.best.product.model.Product;
import com.best.product.model.Purchase;
import com.best.product.model.Sale;
@Service
@Transactional
public class ProductService {
	@Autowired
	ProductDao productDao;
	@Transactional
	public void saveCategory(Category category) throws Exception{
		try{
			productDao.saveCategory(category);
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public List<Category> getCategoryList(){
		return productDao.getCategoryList();
	}public void saveProduct(Product product) {
		productDao.saveProduct(product);
	}
	public List<Product> getProductList(){
		return productDao.getProductList();
	}
	
	public void saveSale(Sale sale) {
		//productDao.saveSale(sale);
		try {
			productDao.saveSale(sale);
			productDao.UpdateSale(sale.getProduct().getId(),sale.getQty());
		}
		catch(Exception e) {
			throw e;
		}
	}
	public List<Sale> getSaleList(){
		return productDao.getSaleList();
	}
	public void savePurchase(Purchase purchase) {
		//productDao.savePurchase(purchase);
		try {
			productDao.savePurchase(purchase);
			productDao.UpdatePurchase(purchase.getProduct().getId(),purchase.getQty());
		}
		catch(Exception e) {
			throw e;
		}
	}
	public List<Purchase> getPurchaseList(){
		return productDao.getPurchaseList();
	}
	
	
}