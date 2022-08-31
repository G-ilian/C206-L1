package ExercicioProposto;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Abrindo variável para armazenar entradas de dados
        Scanner sc=new Scanner(System.in);

        Escola escola=new Escola("Escola do Paulo",
                "escolaDoPaulo@paulo.com",
                565,"Rua da sorte"); // Instanciando escola

        boolean flag=true; // Flag de controle do while

        while(flag){
            System.out.println("--- BEM VINDO "+escola.nome+" ---");
            System.out.println("1 - Cadastrar estudantes");
            System.out.println("2 - Mostrar as informações dos estudantes");
            System.out.println("3 - Mostrar quantidade de estudantes por ano");
            System.out.println("4 - Sair do sistema");
            int opcao=sc.nextInt(); // Atribuindo a entrada de dados a variável opção
            sc.nextLine();
            switch(opcao){
                case 1:
                    // Criando o estudante que será adicionado no array de estudantes
                    Estudante e =new Estudante();
                    System.out.println("Nome do aluno: ");
                    e.nome=sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    e.idade=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano letivo do aluno: ");
                    e.anoLetivo=sc.nextLine();

                    // Adicionando estudante criado na escola
                    escola.addEstudante(e);
                    break;

                case 2:
                    escola.mostraInfos(); // Mostrando as informações da escola e dos estudantes
                    break;
                case 3:
                    escola.qtdEstudantesPorAno();// Quantidade de aluno por ano letivo
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("Opção inválida !!");
                    break;


            }
        }




        sc.close();// Fechando a entrada de dados
    }
}
