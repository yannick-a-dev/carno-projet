package com.carnoprojet.carnoprojet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnoprojet.carnoprojet.exception.UserNotFoundException;
import com.carnoprojet.carnoprojet.models.Category;
import com.carnoprojet.carnoprojet.models.SubCategory;
import com.carnoprojet.carnoprojet.repository.CategoryRepository;
import com.carnoprojet.carnoprojet.repository.SubCategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;


	public List<Category> findAllCategories() {
		return categoryRepository.findAll();
	}


	public Optional<Category> findCategoryById(Long id) {
		return categoryRepository.findById(id);
	}


	public SubCategory findSubCategoryById(Long id) {
	   Category category = categoryRepository.findCategoryById(id).orElseThrow(
				()-> new UserNotFoundException("Category by id" + id + "was not found"));
	   SubCategory subCategory = subCategoryRepository.findSubCategoryBySubName(category);
		return subCategory;
	}

	public Category findSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category addCategory(Category category) { 
		return categoryRepository.save(category);
	}

}
