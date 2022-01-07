package com.Vikas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBootInputData implements ApplicationRunner {
	
	@Value("${product.id}")
	private int productId;
	
	@Value("${product.name}")
	private String productName;
	
	@Value("${product.price}")
	private int productPrice;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Product id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+productPrice);
		
	}

}
