package com.niit.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.project.dao.ProductDAO;
import com.niit.project.model.ProductModel;
import com.niit.project.service.ProductService;

@Service
public class ProductServiceimpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	public void insertProductModel(ProductModel u)
	{
		productDAO.insertProductModel(u);
	}
	}
