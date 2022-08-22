package ExercicioProposto;

public class Estudante {
    // Atributos do estudante
    String nome;
    String anoLetivo;
    int idade;

    // Metódos da classe de estudante
    public void mostraInfo(){
        System.out.println();
        System.out.println("--- INFORMAÇÕES DOS ESTUDANTES ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Ano Letivo: "+this.anoLetivo);
    }

}
