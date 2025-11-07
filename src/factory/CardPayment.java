package factory;

public class CardPayment implements Payment{
    @Override
    public void pay(Double value) {
        System.out.println("Pagando R$ " + value + " via cartão.");
    }
}
