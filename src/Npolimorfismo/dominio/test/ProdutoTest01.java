package Npolimorfismo.dominio.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.dominio.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD 4600G", 599.9);
        Tomate tomate = new Tomate("Tomate Siciliano", 5.99);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
