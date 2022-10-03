package br.inatel.cdg.ExercicioProposto;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }
    // Getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto p) {
        return this.nome.compareTo(p.getNome());
    }

    // Ordenando de maneira crescente no preço
    /*
    @Override
    public int compareTo(Produto p) {
        return Double.compare(this.preco,p.getPreco());
    }
     */
}
