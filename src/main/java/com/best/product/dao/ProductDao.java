package com.best.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.best.product.model.Product;
import com.best.product.model.Category;
import com.best.product.model.Sale;
import com.best.product.model.Purchase;

@Repository
public class ProductDao {
	
	
		 
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	
	public void saveCategory(Category category){
		getSesssion().save(category);
	}
	public List<Category> getCategoryList(){
		Criteria cr=getSesssion().createCriteria(Category.class);
		return (List<Category>)cr.list();
	}
	
	public void saveProduct(Product product){
		getSesssion().save(product);
	}
	public List<Product> getProductList(){
		
		Criteria cr=getSesssion().createCriteria(Product.class);
		return (List<Product>)cr.list();
	}
	
	
	public void saveSale(Sale sale){
		getSesssion().save(sale);
	}
	public List<Sale> getSaleList(){
		
		Criteria cr=getSesssion().createCriteria(Sale.class);
		return (List<Sale>)cr.list();
	}
	
	
	public void savePurchase(Purchase purchase){
		getSesssion().save(purchase);
	}
	public List<Purchase> getPurchaseList(){
		
		Criteria cr=getSesssion().createCriteria(Purchase.class);
		return (List<Purchase>)cr.list();
	}
		
//
//	public Product getProductById(Long id) {
//		Criteria cr=getSesssion().createCriteria(Product.class);
//		cr.add(Restrictions.eq("id", id));
//		return (Product)cr.uniqueResult();
//	}
	
public boolean UpdateSale(Long product_id,Integer qty) {
	String hq="update Product set qty=qty-:qty where id=:id";
	Query query= getSesssion().createQuery(hq);
	query.setParameter("qty",qty);
	query.setParameter("id",product_id);
	query.executeUpdate();
	return true;
	}
public boolean UpdatePurchase(Long product_id,Integer qty) {
	String hq="update Product set qty=qty+:qty where id=:id";
	Query query= getSesssion().createQuery(hq);
	query.setParameter("qty",qty);
	query.setParameter("id",product_id);
	query.executeUpdate();
	return true;
	}

}

