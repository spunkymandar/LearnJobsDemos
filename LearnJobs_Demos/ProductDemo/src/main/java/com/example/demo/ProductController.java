package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	@GetMapping("/products/{productid}")
	public Optional<Product> getProduct(@PathVariable("productid") int productid )throws ProductNotFoundException {
			Optional<Product> p=productRepository.findById(productid);
			if(!p.isPresent()) {
				throw new ProductNotFoundException("product Id :"+productid +", is not available!!");
			}
			return p;
			
	}
}
