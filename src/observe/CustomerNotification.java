package observe;

import enums.Status;

import java.lang.reflect.Method;

public class CustomerNotification implements Observer{

    @Override
    public void update(Status status) {
        System.out.println("[" + this.getClass().getName() + " ] " + "Seu pedido está: " + status);
    }
}
