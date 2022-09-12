package br.inatel.cdg.ExercicioProposto;

public class Hatch extends Carro {
    private int portas;

    // Construtor

    public Hatch(String cor,int ano,double valor,int portas) {
        this.setCor(cor);
        this.setAno(ano);
        this.setValor(valor);
        this.portas = portas;
    }

    // Métodos reescritos da interface
    @Override
    public void taxa() {
        System.out.println("TAXA SUV : "+200+ "R$/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("--- Informações HATCH ---");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Valor: "+this.getValor());
        System.out.println("nº Portas: "+this.portas);
    }
}
