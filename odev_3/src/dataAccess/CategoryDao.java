package dataAccess;

import java.util.List;

import entity.Category;

public interface CategoryDao {
    void add(Category category);

    void delete(int id);

    void update(int id, Category category);

    Category findById(int id);

    List<Category> getCategories();
}
