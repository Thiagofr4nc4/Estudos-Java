package Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double  IMPOSTO_POR_CENTO = 0.2;
    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
