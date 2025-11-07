package observe;

import enums.Status;

public class CustomerNotification implements Observer{

    @Override
    public void update(Status status) {
        System.out.println("Seu pedido está: " + status);
    }
}
