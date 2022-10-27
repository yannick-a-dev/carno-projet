package com.carnoprojet.carnoprojet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carnoprojet.carnoprojet.exception.UserNotFoundException;
import com.carnoprojet.carnoprojet.models.Category;
import com.carnoprojet.carnoprojet.models.SubCategory;
import com.carnoprojet.carnoprojet.services.CategoryService;
import com.carnoprojet.carnoprojet.services.SubCategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/categories")
@Api("http://localhost:8080/")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SubCategoryService subCategoryService;

	@GetMapping("/all")
	@ApiOperation(value = "Lister toutes les categories", notes =" Cette methodes permet de lister toutes les categories")
	@ApiResponse(code = 200, message = "liste des message")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.findAllCategories();
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}
	
	@PostMapping("/subCategories")
	@ApiResponse(code = 201, message = "La category a ete creer")
	public ResponseEntity<SubCategory> addSubCategories(@RequestBody SubCategory subCategory) {
		SubCategory newSubCategory = subCategoryService.save(subCategory);
		return new ResponseEntity<>(newSubCategory, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}/subCategories")
	@ApiResponse(code = 200, message = "Liste des subcategories par id ")
	public ResponseEntity<SubCategory> getSubCategory(@PathVariable("id") Long id){
		Category category = categoryService.findCategoryById(id).orElseThrow(
				()-> new UserNotFoundException("Category by id" + id + "was not found"));
	     SubCategory subCategory = new SubCategory();	
	     subCategory.setSubId(category.getId());
	     subCategory.setSubName(category.getName());
		return new ResponseEntity<>(subCategory, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	@ApiResponse(code = 201, message = "Creer les category")
	public ResponseEntity<Category> addEmployee(@RequestBody Category category){
		Category newCategory = categoryService.addCategory(category);
		return new ResponseEntity<>(newCategory, HttpStatus.CREATED);	
	}
}