package br.inatel.cdg.Heranca;

public class Professor extends Funcionario  {
    // Matéria ministrada pelo professor
    private String materia;

    // Metódos do professor
    @Override
    public void mostrarInfos(){
        System.out.println();
        System.out.println("Informações do Professor");
        super.mostrarInfos();
        System.out.println("Matéria: "+this.materia);
        System.out.println();
    }

    public void corrigirProvas(){
        System.out.println(this.getNome()+" está corrigindo as provas !");
    }

    @Override
    public void executaAcao(){
        System.out.println(this.getNome()+" Está dando aulas");
    }

    @Override
    public double salarioBonus(){
        return this.getSalario()+700;
    }


    // Getter e setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
