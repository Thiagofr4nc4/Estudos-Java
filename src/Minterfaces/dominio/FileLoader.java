package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void checkPermission() {

    }

    @Override
    public void remover() {
        System.out.println("Removendo um arquivo...");
    }


    public void bemvindo() {
        System.out.println("NÃO BEM VINDO");
    }
}
