package com.carnoprojet.carnoprojet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carnoprojet.carnoprojet.models.Category;
import com.carnoprojet.carnoprojet.models.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

	SubCategory findSubCategoryBySubName(Category category);

	static Optional<Category> findSubCategoryBySubId(Long subId) {
		// TODO Auto-generated method stub
		return null;
	}

}
