package br.inatel.cdg.Heranca;

public class Arquiteto extends Funcionario {
    // Especialidade do arquiteto
    private String especialidade;


    // Reescrita - Particular para arquiteto
    @Override
    public void mostrarInfos(){
        System.out.println();
        System.out.println("Informações do Arquiteto");
        super.mostrarInfos();
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println();
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome()+" Está desenhando");
    }

    @Override
    public double salarioBonus(){
        return  this.getSalario()+1200;
    }
    // Getters and setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
