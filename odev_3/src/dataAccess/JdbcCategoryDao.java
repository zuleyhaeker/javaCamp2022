package dataAccess;


import java.util.ArrayList;
import java.util.List;
import entity.Category;

public class JdbcCategoryDao implements CategoryDao {

    private List<Category>categories= new ArrayList<>();

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Kategori JDBC ile veritabanina eklendi");
    }

    @Override
    public void delete(int id) {
        categories.remove(id);
        System.out.println("Kategori silindi");
    }

    @Override
    public void update(int id, Category category) {
        categories.set(id, category);
        System.out.println("Kategori guncellendi");
    }

    @Override
    public Category findById(int id) {

        return categories.get(id-1);
    }

    @Override
    public List<Category> getCategories() {
        return categories;
    }
}
