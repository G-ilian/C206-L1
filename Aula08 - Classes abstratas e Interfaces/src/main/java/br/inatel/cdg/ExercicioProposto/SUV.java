package br.inatel.cdg.ExercicioProposto;

public class SUV extends Carro {
    private String tracao;

    //Construtor SUV

    public SUV(String cor,int ano,double valor,String tracao) {
        this.setCor(cor);
        this.setAno(ano);
        this.setValor(valor);
        this.tracao = tracao;
    }

    // Reescrita da interface
    @Override
    public void taxa() {
        System.out.println("TAXA SUV : "+120+ "R$/dia");
    }

    @Override
    public void mostraInfos() {
        System.out.println("--- Informações SUV ---");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Valor: "+this.getValor());
        System.out.println("Tração: "+this.tracao);
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
