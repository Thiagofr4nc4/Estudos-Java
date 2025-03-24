package Minterfaces.dominio;

public interface DataLoader {
    void load(); //public abstract não é necessário pois está implícito

    void checkPermission();

    public default void bemvindo(){
        System.out.println("Seja bem vindo!!!!!!!!!");
    }

    public static void expulso(){
        System.out.println("Vocẽ foi expuldo ");
    }
}
