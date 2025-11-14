package singleton;

public class ConnectionDatabase {
    private static ConnectionDatabase instance;

    private ConnectionDatabase(){
        System.out.println("Conectando ao banco de dados...");
        System.out.println("Banco de dados conectado com sucesso!");
    }

    public static ConnectionDatabase getInstance(){
        if (instance == null) {
            instance = new ConnectionDatabase();
        }
        return instance;
    }

}
