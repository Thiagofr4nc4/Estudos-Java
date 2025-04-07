package Npolimorfismo.dominio.service;

import Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioMemoria  implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
