package factory;

public class PixPayment implements Payment{
    @Override
    public void pay(Double value) {
        System.out.println("Pagando R$ " + value + " via Pix.");
    }
}
