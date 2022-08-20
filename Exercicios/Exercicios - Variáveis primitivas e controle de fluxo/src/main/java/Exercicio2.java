import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); // Variável responsável pela entrada de dados
        int np1,np2; // Nota 1 e nota 2 das provas

        // Entrada de Dados
        System.out.println("NP1: ");
        np1= entrada.nextInt(); // Entrando com a nota da primeira prova
        System.out.println("NP2: ");
        np2= entrada.nextInt(); // Entrando com a nota da segunda prova

        System.out.println("Média: "+(np1+np2)/2); // Imprimindo a média final do aluno

        entrada.close(); // Fechando o canal para entrada de dados
    }
}
