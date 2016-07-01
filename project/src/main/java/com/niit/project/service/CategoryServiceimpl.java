package com.niit.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.project.dao.CategoryDAO;
import com.niit.project.model.CategoryModel;
import com.niit.project.service.CategoryService;

@Service
public class CategoryServiceimpl implements CategoryService {

		@Autowired
		CategoryDAO categoryDAO;
		public void insertCategoryModel(CategoryModel u)
		{
			categoryDAO.insertCategoryModel(u);
		}

}
