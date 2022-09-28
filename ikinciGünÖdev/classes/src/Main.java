public class Main {

    public static void main(String[] args) {

        //bir class aşağıdaki gibi çağırılır.
        //customermanager türünde bir örnek oluşturucaz, kullanım yapıcaz
        //classın ismi
        //customermanager türünde bir nesne üretmiş oluyoruz
        //CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager;
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


    }
}

