public class Customer {

    public Customer(){
        System.out.println("Müşteri nesnesi başlatıldı");
    }
    public int id;


    public String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}
