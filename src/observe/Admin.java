package observe;

import enums.Status;

public class Admin implements Observer{
    @Override
    public void update(Status status) {
        System.out.println("Pedido está atualizado para " + status);
    }
}
