package Npolimorfismo.dominio.service;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public  class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Imposto a ser pago:  " + imposto);
    }

        public static void voidcalcularImposto(Produto produto){
            System.out.println("Relatorio de Imposto");
            double imposto = produto.calcularImposto();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getValor());
            System.out.println("Imposto a ser pago: " + imposto);
            if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }

}
