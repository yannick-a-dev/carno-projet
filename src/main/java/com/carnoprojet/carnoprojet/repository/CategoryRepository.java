package com.carnoprojet.carnoprojet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.carnoprojet.carnoprojet.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

   	Optional<Category> findCategoryById(Long id);

	Optional<Category> findSubCategoryById(Long id);

}
