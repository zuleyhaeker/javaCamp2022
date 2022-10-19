package business;

import java.util.ArrayList;
import java.util.List;

import logger.Logger;
import dataAccess.CategoryDao;
import entity.Category;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Logger> loggers = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        boolean isRepeat = false;
        for (Category c : categoryDao.getCategories()) {
            if (category.getName().equals(c.getName())) {
                isRepeat = true;
            }

        }
        if (!isRepeat) {
            categoryDao.add(category);
        } else {
            throw new Exception("Kategori ismi tekrar edemez!");
        }

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }

    public void delete(int id) {
        categoryDao.delete(id);
    }

    public void update(int id, Category category) {
        categoryDao.update(id, category);
    }

    public Category findById(int id) {
        return categoryDao.findById(id);
    }

    public List<Category> getCategories() {
        return categoryDao.getCategories();
    }
}
