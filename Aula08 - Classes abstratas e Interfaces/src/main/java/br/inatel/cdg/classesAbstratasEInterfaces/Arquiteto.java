package br.inatel.cdg.classesAbstratasEInterfaces;

public class Arquiteto extends Funcionario implements GerenciarProjetos {
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
        System.out.println(this.getNome()+" está desenhando!!!");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome()+" Gerenciou o projeto Y");
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