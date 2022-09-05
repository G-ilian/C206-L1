package br.inatel.cdg.Heranca;

public class Main {
    public static void main(String[] args) {

        // Criando os objetos
        Professor p=new Professor();
        p.setNome("Renzo");
        p.setIdade(40);
        p.setSalario(5000);
        p.setMateria("POO");

        Arquiteto a=new Arquiteto();
        a.setNome("Caio");
        a.setIdade(35);
        a.setSalario(4500);
        a.setEspecialidade("Design");

        Engenheiro e=new Engenheiro();
        e.setNome("Rogério");
        e.setIdade(32);
        e.setSalario(3500);
        e.setRamo("Computação");

        //p.mostrarInfos();
        //a.mostrarInfos();
        //e.mostrarInfos();


        // Lógica para vários funcionários
        Funcionario []funcionarios=new Funcionario[5];

        funcionarios[0]=a;// Funcionário 0 é o arquiteto
        funcionarios[1]=e;// Funcionário 0 é o eng
        funcionarios[2]=p;// Funcionário 0 é o prof
        for(int i=0;i< funcionarios.length;i++){
            if(funcionarios[i]!=null){
                if(funcionarios[i] instanceof Professor){
                    // Casting para professor
                    Professor auxProfessor=(Professor)funcionarios[i];
                    auxProfessor.mostrarInfos();
                    auxProfessor.executaAcao();
                    auxProfessor.corrigirProvas();

                }else if(funcionarios[i] instanceof Arquiteto){
                    // Casting para arquiteto
                    Arquiteto auxArquiteto=(Arquiteto)funcionarios[i];
                    auxArquiteto.mostrarInfos();
                    auxArquiteto.executaAcao();
                }else{
                    // Casting para engenheiro
                    Engenheiro auxEngenheiro=(Engenheiro)funcionarios[i];
                    auxEngenheiro.mostrarInfos();
                    auxEngenheiro.executaAcao();
                }
            }
        }

    }
}
