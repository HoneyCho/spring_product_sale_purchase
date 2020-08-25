package com.best.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.product.model.Product;
import com.best.product.model.Sale;
import com.best.product.service.ProductService;

@Controller
public class SaleController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/new_sale.htm")
	public String createSale(Model model) {
		model.addAttribute("sale", new Sale());
		model.addAttribute("productList", productService.getProductList());
		return "new_sale";
	}
	@RequestMapping(value="/new_sale.htm",method = RequestMethod.POST)
	public String saveSale(@ModelAttribute(value="sale") Sale sale) {
		productService.saveSale(sale);
		return "redirect:/sale_list.htm";
	}
	@RequestMapping(value="/sale_list.htm")
	public String showSale(Model model) {
		model.addAttribute("sale", productService.getSaleList());
		return "sale_list";
	}
	
}
