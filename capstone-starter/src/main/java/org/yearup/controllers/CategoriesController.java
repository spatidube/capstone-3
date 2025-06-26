package org.yearup.controllers;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.yearup.data.CategoryDao;
import org.yearup.data.ProductDao;
import org.yearup.models.Category;
import org.yearup.models.Product;

import java.util.List;

// add the annotations to make this a REST controller
@RestController // this makes the class a rest API controller
// add the annotation to make this controller the endpoint for the following url: //"http://localhost:8080/categories"
@RequestMapping("/categories")
// add annotation to allow cross site origin requests
@CrossOrigin // allows cross-origin requests form the front end allowing front end access to access thebackend

public class CategoriesController {
    //these are tools that speak to the
    private CategoryDao categoryDao;
    private ProductDao productDao;


    // create an Autowired controller to inject the categoryDao and ProductDao
    @Autowired

    public CategoriesController(CategoryDao categoryDao, ProductDao productDao) {
        this.categoryDao = categoryDao;
        this.productDao = productDao;

    }

    // add the appropriate annotation for a get action
    //preauthorize annotation "permitAll" allows users to access this method
    @GetMapping()
    @PreAuthorize(("permitAll()"))

    public List<Category> getAll() throws SQLException {
        // find and return all categories
        return categoryDao.getAllCategories();
    }

    // add the appropriate annotation for a get action
    @RequestMapping(path = "/{id}")
    @PreAuthorize("permitAll()")
    public Category getById(@PathVariable int id) {

        // get the category by id
        return categoryDao.getById(id);

    }
        // the url to return all products in category 1 would look like this
        // https://localhost:8080/categories/1/products
        @GetMapping("{categoryId}/products")
        @PreAuthorize("permitAll()")

        public List<Product> getProductsById( @PathVariable int categoryId)

        {
            // get a list of product by categoryId
            return productDao.listByCategoryId(categoryId);
        }

        // add annotation to call this method for a POST action
        @PostMapping
        // add annotation to ensure that only an ADMIN can call this function
        @PreAuthorize("hasRole('ADMIN')")
        public Category addCategory(@RequestBody Category category)
        {
            // insert the category
            return categoryDao.create(category);
        }

        // add annotation to call this method for a PUT (update) action - the url path must include the categoryId
        @PutMapping("{id}")

        // add annotation to ensure that only an ADMIN can call this function
        @PreAuthorize("hasRole('ADMIN')")
        public void updateCategory ( @PathVariable int id, @RequestBody Category category)
        {
            // update the category by id
            categoryDao.update(id, category);
        }


        // add annotation to call this method for a DELETE action - the url path must include the categoryId
        @DeleteMapping("{id}")
        // add annotation to ensure that only an ADMIN can call this function
        @PreAuthorize("hasRole('ADMIN')")
        public void deleteCategory ( @PathVariable int id)

        {
            // delete the category by id
            categoryDao.delete(id);
        }
    }
