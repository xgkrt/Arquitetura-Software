import entity.Order;
import enums.Status;
import factory.Payment;
import factory.PaymentFactory;
import observe.Admin;
import observe.CustomerNotification;
import singleton.Database;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        System.out.println("Produtos disponíveis:");
        db.getProductList().forEach(System.out::println);

        Order order = new Order();
        order.addProduct(db.getProductList().get(0));

        order.attach(new CustomerNotification());
        order.attach(new Admin());

        Payment payment = PaymentFactory.create("pix");
        payment.pay(order.total());

        order.setStatus(Status.PROCESSANDO);
        order.setStatus(Status.ENVIADO);
        order.setStatus(Status.ENTREGUE);
    }
}