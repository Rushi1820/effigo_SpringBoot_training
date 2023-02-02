package com.jsonhandlers.json.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsonhandlers.json.dto.Product;

@RestController
public class Mycontroller {

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public Product getProduct() {
		Product p = new Product();
		p.setName("Water bottle");
		p.setTargetArea("");
		return p;
	}

}
