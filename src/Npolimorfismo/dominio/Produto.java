package Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
