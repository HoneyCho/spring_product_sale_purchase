package com.best.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best.product.model.Product;
import com.best.product.model.Purchase;
import com.best.product.model.Sale;
import com.best.product.service.ProductService;

@Controller
public class PurchaseController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/new_purchase.htm")
	public String createPurchase(Model model) {
		model.addAttribute("purchase", new Purchase());
		model.addAttribute("productList", productService.getProductList());
		return "new_purchase";
	}
	@RequestMapping(value="/new_purchase.htm",method = RequestMethod.POST)
	public String savePurchase(@ModelAttribute(value="purchase") Purchase purchase) {
		productService.savePurchase(purchase);
		return "redirect:/purchase_list.htm";
	}
	@RequestMapping(value="/purchase_list.htm")
	public String showSale(Model model) {
		model.addAttribute("purchase", productService.getPurchaseList());
		return "purchase_list";
	}
	
}
