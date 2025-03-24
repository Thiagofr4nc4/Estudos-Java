package Minterfaces.dominio.Test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.checkPermission();
        dataBaseLoader.remover();
        System.out.println("------------------------------------------------------");
        fileLoader.bemvindo();
        dataBaseLoader.bemvindo();
        fileLoader.load();
        fileLoader.remover();
        System.out.println();

    }
}
