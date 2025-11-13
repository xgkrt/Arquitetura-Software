package observe;

import enums.Status;

import java.lang.reflect.Method;

public class AdminNotification implements Observer{
    @Override
    public void update(Status status) {
        System.out.println("[" + this.getClass().getName() + " ] " + "Pedido está atualizado para " + status);
    }
}
