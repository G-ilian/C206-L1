import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando e preenchendo objetos de escola
        Escola escola=new Escola("Estrada Campo Redondo, KM32","Escola Municipal Bruno Fonseca Pinto",
                "bruno@gmail.com", 22476890);

        // Entrada de dados e menu conforme exigido
        Scanner sc=new Scanner(System.in);

        boolean flag=true; // Flag utilizada no meu while, para determinar a parada ou continuação no menu

        // Criamos então o while, primeiro passo para o menu
        System.out.println();
        System.out.println("++++ BEM-VINDO(A) AO SISTEMA DE CADASTRO DA INSTITUIÇÃO ++++");
        while(flag){
            // Menu com as opções
            System.out.println();
            System.out.println("DIGITE UM VALOR DE ACORDO COM A SUA OPÇÃO ");
            System.out.println("1- Cadastrar estudantes ");
            System.out.println("2- Ver informações ");
            System.out.println("3- Verificar a quantidade de alunos por ano");
            System.out.println("4 - Sair da aplicação ");
            int opcao=sc.nextInt(); // Opção escolhida pelo usuário

            sc.nextLine(); // Limpando o buffer para entrada do dado literal

            // Estrutura condicional switch case para verificação das opções
            switch(opcao){
                case 1:
                    Estudante e=new Estudante(); // Instanciando um estudante - Cadastro
                    System.out.println("Nome do estudante: ");
                    e.nome=sc.nextLine(); // Atribuindo o nome ao atributo de nome da clase Estudante
                    System.out.println("Idade do estudante: ");
                    e.idade= sc.nextInt(); // Atribuindo a idade ao atributo de idade da clase Estudante
                    sc.nextLine();
                    System.out.println("Ano letivo do estudante: ");
                    e.ano= sc.nextLine(); // Atribuindo o ano ao atributo de ano da clase Estudante

                    // Adicionando o estudante através do metódo da classe Escola
                    escola.addEstudantes(e);

                    break; // Parando a execução
                case 2:
                    escola.mostraInfos(); // Mostrando as informações através do metódo
                    break;
                case 3:
                    escola.qtdEstudantesPorAno(); // Mostrando a quantidade de alunos por ano
                    break;
                case 4:
                    flag=false; // Atribuindo false a flag para sairmos do loop
                    break;
                default :
                    System.out.println("Opção inválida!!!");
                    break;


            }

        }
        sc.close();// Fechando a conexão de dados
    }
}
