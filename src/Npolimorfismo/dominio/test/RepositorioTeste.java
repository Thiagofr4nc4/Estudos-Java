package Npolimorfismo.dominio.test;

import Npolimorfismo.dominio.repositorio.Repositorio;
import Npolimorfismo.dominio.service.RepositorioBancoDeDados;
import Npolimorfismo.dominio.service.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
