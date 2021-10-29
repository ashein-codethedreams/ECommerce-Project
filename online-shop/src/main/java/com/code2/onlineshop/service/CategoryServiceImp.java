package com.code2.onlineshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.onlineshop.entity.Category;
import com.code2.onlineshop.repository.CategoryRepository;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	@Transactional
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

	@Override
	@Transactional
	public Category getCategory(Long id) {
		return categoryRepository.getOne(id);
	}

}
