package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entity.Category;

public class HibernateCategoryDao implements CategoryDao{

    private List<Category>categories= new ArrayList<>();

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Kategori Hibetnate ile veritabanina eklendi");
    }

    @Override
    public void delete(int id) {
        categories.remove(id);
        System.out.println("Kategori silindi");
    }

    @Override
    public void update(int id,Category category) {
        categories.set(id,category);
        System.out.println("Kategori guncelledi");
    }

    @Override
    public Category findById(int id) {
//		listelerde index 0 dan başladığı için -1 eklendi.
        return categories.get(id-1);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }
}
