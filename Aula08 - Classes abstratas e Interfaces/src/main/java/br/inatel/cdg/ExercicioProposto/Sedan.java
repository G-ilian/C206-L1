package br.inatel.cdg.ExercicioProposto;

public class Sedan extends Carro{
    private int portaMalas;

    public Sedan(String cor,int ano,double valor,int portaMalas) {
        this.setCor(cor);
        this.setAno(ano);
        this.setValor(valor);
        this.portaMalas = portaMalas;
    }

    // Reescrita da interface de controle
    @Override
    public void taxa() {
        System.out.println("TAXA SUV : "+100+ "R$/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("--- Informações SEDAN ---");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Valor: "+this.getValor());
        System.out.println("Porta Malas: "+this.portaMalas);
    }
}
