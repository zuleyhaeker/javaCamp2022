public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditmanager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer;
        _creditmanager = creditManager;

    }

    public void save() { //müşteri nesnesi parametre olarak gönderilir
        System.out.println("Müşteri kaydedildi : ");
    }

    public void delete() {
        System.out.println("Müşteri silindi : ");
    }

    public void giveCredit() {
        _creditmanager.calculate();
        System.out.println("Kredi verildi");

    }
}
