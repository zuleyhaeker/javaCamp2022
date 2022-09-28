public class Main {

    public static void main(String[] args) {
        //
        Product product =new Product();
        product.name="laptop";
        product.id=1;
        product.description="asus laptop";
        product.price=5000;
        product.stockAmount=3;
        //System.out.println(product.name);

        //ürün var elimde artık. onu veritabanına eklemem gerekiyor.
        //o işleri başka bir class yapıyor yani productmanager
        // yukarda verilen producttı al ve ekle

        ProductManager productManager=new ProductManager();
        productManager.Add(product);





    }
}
