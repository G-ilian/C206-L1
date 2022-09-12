package br.inatel.cdg.ExercicioProposto;

public abstract class Carro implements Controle{
    // Atributos da classse de carro - Todos privados
    private double valor;
    private String cor;
    private int ano;

    // Getter e setters - Modificadores de acesso encapsulamento
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>=0)
            this.ano = ano;
        else{
            System.out.println("NaN");
        }


    }
}
