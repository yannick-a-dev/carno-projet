package com.carnoprojet.carnoprojet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnoprojet.carnoprojet.models.SubCategory;
import com.carnoprojet.carnoprojet.repository.SubCategoryRepository;

@Service
public class SubCategoryService {
	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public List<SubCategory> findAllSubCategories() {
		return subCategoryRepository.findAll();
	}

	public SubCategory addSubCategory(SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}


	public SubCategory save(SubCategory subCategory) {
		// TODO Auto-generated method stub
		return null;
	}

}
