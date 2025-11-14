package entity;

import enums.Status;
import observe.Notifier;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> items = new ArrayList<>();
    private Notifier notifier = new Notifier();
    private Status status = Status.PENDENTE;

    public Order(Notifier notifier) {
        this.notifier = notifier;
    }

    public Status getStatus() {
        return status;
    }

    public void addProduct(Product p) {
        items.add(p);
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus;
        this.notifier.notify(newStatus);
    }

    public double total() {
        return items.stream().mapToDouble(p -> p.getPrice()).sum();
    }
}
