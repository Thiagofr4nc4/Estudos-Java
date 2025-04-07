package Npolimorfismo.dominio.service;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Tomate;

public  class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Imposto a ser pagoooo:  " + imposto);
    }

        public static void calcularImpostoTomate(Tomate tomate){
            System.out.println("Relatorio de Imposto do Tomate");
            double imposto = tomate.calcularImposto();
            System.out.println("Tomate: " + tomate.getNome());
            System.out.println("Valor do Tomate: " + tomate.getValor());
            System.out.println("Imposto a ser pago:  " + imposto);
        }

}
