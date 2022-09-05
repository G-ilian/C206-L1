package br.inatel.cdg.Heranca;

// Classe filha
public class Engenheiro extends Funcionario{
    //Ramo do engenheiro
    private String ramo;

    // Métodos do engenheiro

    // Reescrita - Particular para engenheiro
    @Override
    public void mostrarInfos(){
        System.out.println();
        System.out.println("Informações do Engenheiro");
        super.mostrarInfos();
        System.out.println("Ramo: "+this.ramo);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome()+" Está programando");
    }

    @Override
    public double salarioBonus(){
        return this.getSalario()+1400;
    }

    // Getters and setters
    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
}
