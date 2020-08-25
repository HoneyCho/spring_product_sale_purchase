package com.best.product.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.best.product.model.Sale;

@Entity
public class Product implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private Double price;
private Integer qty;
@ManyToOne
@JoinColumn(name="category_id")
private Category category=new Category();

public Product() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Integer getQty() {
	return qty;
}
public void setQty(Integer qty) {
	this.qty = qty;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

}
