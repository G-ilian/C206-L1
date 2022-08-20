public class Estudante {
    // Atributos de um estudante de acordo com a UML
    String nome; // Nome
    int idade; // Idade
    String ano; // Ano letivo a qual o aluno está

    // Metódos conforme a UML
    public void mostraInfos() {
        // Aqui são mostradas todas as informações da escola
        System.out.println();
        System.out.println("--- INFORMAÇÕES DO ALUNO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano Letivo : " + this.ano);
        System.out.println("*********************************");
    }


}
