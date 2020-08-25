package com.best.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.product.model.Product;
import com.best.product.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/index.htm")
	public String createProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categoryList", productService.getCategoryList());
		return "new_product";
	}
	
	@RequestMapping(value="/new_product.htm",method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute(value="product") Product product) {
		productService.saveProduct(product);
		return "redirect:/product_list.htm";
	}
	@RequestMapping(value="/product_list.htm")
	public String showProduct(Model model) {
		model.addAttribute("product", productService.getProductList());
		return "product_list";
	}
	
}
