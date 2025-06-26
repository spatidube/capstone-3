package org.yearup.data;

import org.yearup.models.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryDao
{
    List<Category> getAllCategories()throws SQLException;
    Category getById(int categoryId);
    Category create(Category category);
    void update(int categoryId, Category category);
    void delete(int categoryId);
}
