package Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double  IMPOSTO_POR_CENTO = 0.30;
    public Televisao(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
