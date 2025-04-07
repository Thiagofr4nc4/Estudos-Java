package Npolimorfismo.dominio.service;

import Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Arquivo");
    }
}
