package entity;

import enums.Status;
import observe.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> items = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Status status = Status.PENDENTE;

    public Status getStatus() {
        return status;
    }

    public void addProduct(Product p) {
        items.add(p);
    }

    public void attach(Observer obs) {
        observers.add(obs);
    }

    private void notifyAllObservers() {
        for (Observer o : observers)
            o.update(status);
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus;
        notifyAllObservers();
    }

    public double total() {
        return items.stream().mapToDouble(p -> p.getPrice()).sum();
    }
}
