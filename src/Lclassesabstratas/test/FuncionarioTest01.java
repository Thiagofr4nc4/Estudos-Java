package Lclassesabstratas.test;

import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Funcionario;
import Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 2000);
       Gerente gerente = new Gerente("Luffy", 5000);
        System.out.println(desenvolvedor);
       System.out.println(gerente);
    }
}
