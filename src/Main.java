import dao.DaoProduct;
import entity.Order;
import entity.Product;
import enums.Status;
import factory.Payment;
import factory.PaymentFactory;
import observe.AdminNotification;
import observe.CustomerNotification;
import observe.Notifier;
import singleton.ConnectionDatabase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConnectionDatabase db = ConnectionDatabase.getInstance();
        DaoProduct daoProduct = new DaoProduct(db);
        DaoProduct daoProduct2 = new DaoProduct(db);

        List<Product> products = daoProduct.findAll();

        System.out.println("Produtos disponíveis:");
        products.forEach(System.out::println);

        Notifier notifier = new Notifier();
        notifier.attach(new CustomerNotification());
        notifier.attach(new AdminNotification());

        Order order = new Order(notifier);
        order.addProduct(products.getFirst());

        Payment payment = PaymentFactory.create("pix");
        payment.pay(order.total());

        order.setStatus(Status.PROCESSANDO);
        order.setStatus(Status.ENVIADO);
        order.setStatus(Status.ENTREGUE);
    }
}