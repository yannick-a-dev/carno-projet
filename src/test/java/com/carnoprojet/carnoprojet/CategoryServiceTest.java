package com.carnoprojet.carnoprojet;

import static org.junit.Assert.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.carnoprojet.carnoprojet.models.Category;
import com.carnoprojet.carnoprojet.services.CategoryService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {
	
	@Autowired
	private CategoryService categoryService;
	
    @Test
	public void shouldSaveCategoryWithSuccess() {
	
		Category categoryExpected = new Category();
		categoryExpected.setName("Essola");
		
	   Category savedCategory = categoryService.addCategory(categoryExpected);
	   
	   assertNotNull(savedCategory);
	   assertNotNull(savedCategory.getName());
	   assertEquals(categoryExpected.getName(), savedCategory.getName());
	}
    
 
    	
}
