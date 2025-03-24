package Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão!");
    }
    @Override
    public void remover() {
        System.out.println("Removendo dado....");
    }


}
