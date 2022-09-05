package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {
        // Criando objetos de funcionário
        Funcionario f1=new Funcionario();
        Funcionario f2=new Funcionario();

        // Colocando os nomes - através do setter
        f1.setNome("Gabriel");
        f2.setNome("Marcos");
        // Péssima prática de programação
        //System.out.println("Quantidade de funcionários da minha empresa: "+f1.cont);

        // Atribuindo valores ao contador do funcionário através de setter
        //Funcionario.setCont(4000); // Setter

        // Boa prática de programação
        System.out.println("Quantidade de funcionários da minha empresa: "+Funcionario.getCont());
        //f1.mostraInfo();

        // Estrutura para mostrar os valores usando o get
        System.out.println("Funcionário : "+f1.getNome()+" ID: "+f1.getId());
        f2.mostraInfo();
    }
}
