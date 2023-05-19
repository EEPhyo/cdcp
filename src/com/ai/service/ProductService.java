package com.ai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.model.Product;
import com.ai.persistant.dao.ProductDao;
import com.ai.persistant.dto.ProductDto;

@Service
public class ProductService {
	
	private ProductDao productDao;

	    @Autowired
	    public ProductService(ProductDao productDao) {
	        this.productDao = productDao;
	    }

	    public void insertData(ProductDto product) {
	        // Perform any necessary validations or business logic before adding the product
	        productDao.insertData(product);
	    }
	}

