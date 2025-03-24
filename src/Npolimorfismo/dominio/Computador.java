package Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double  IMPOSTO_POR_CENTO = 0.25;
    public Computador(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
