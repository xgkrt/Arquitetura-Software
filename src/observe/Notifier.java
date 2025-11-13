package observe;

import enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Notifier implements Observer  {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notify(Status status) {
        System.out.println("Notificando " + observers.size() + " observadores sobre o status");
        for (Observer o : observers)
            o.update(status);
    }

    @Override
    public void update(Status status) {
        System.out.println("Pedido está atualizado para " + status);
    }

}
