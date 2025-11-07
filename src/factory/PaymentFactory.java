package factory;

public class PaymentFactory {
    public static Payment create(String type){
        if (type.equalsIgnoreCase("pix")) return new PixPayment();
        if (type.equalsIgnoreCase("card")) return new CardPayment();
        throw new IllegalArgumentException("Método de pagamento inválido!");
    }
}
