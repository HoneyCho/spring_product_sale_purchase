package com.best.product.controller;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.product.model.Category;
import com.best.product.service.ProductService;
import com.best.product.model.*;;

@Controller
public class CategoryController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/new_category.htm", method = RequestMethod.GET)
	public String newCategory(Model model) {
		model.addAttribute("category", new Category());
		return "new_category";
	}

	@RequestMapping(value = "/new_category.htm", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute(value = "category") Category category) {
		try {
			productService.saveCategory(category);
		} catch (Exception ex) {

		}
		return "redirect:/category_list.htm";
	}
 @RequestMapping(value = "/category_list.htm")
	public String showCategory(Model model) {
		model.addAttribute("categoryList", productService.getCategoryList());
		return "category_list";
	}
	
 
//	
//	  @RequestMapping(value = "/new_sale.htm", method = RequestMethod.GET) public
//	 String newSale(Model model) { model.addAttribute("sale", new Sale()); return
//	  "new_sale"; }
//	  
//	  @RequestMapping(value = "/new_sale.htm", method = RequestMethod.POST) public
//	  String saveSale(@ModelAttribute(value = "sale") Sale sale) { try {
//	  productService.saveSale(sale); } catch (Exception ex) {
//	  
//	  } return "redirect:/sale_list.htm"; }
//	  
//	  @RequestMapping(value = "/sale_list.htm") public String showSale(Model model)
//	  { model.addAttribute("saleList", productService.getSaleList()); return
//	  "sale_list"; }
	 

}
