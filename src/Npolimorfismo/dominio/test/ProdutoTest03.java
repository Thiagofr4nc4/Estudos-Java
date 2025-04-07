package Npolimorfismo.dominio.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.dominio.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 4600G", 550.99);

        Tomate tomate = new Tomate("Tomate pequeno", 1.99);
        tomate.setDataValidade("07/04/2025");
        CalculadoraImposto.voidcalcularImposto(tomate);
        System.out.println("-------------------------------------------------------");
        CalculadoraImposto.voidcalcularImposto(produto);
    }
}
