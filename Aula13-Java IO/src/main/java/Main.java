import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um arquivo
        Arquivo arq=new Arquivo();
        // Criando um Funcionario
        Funcionario func=new Funcionario();
        // Entrada de dados
        Scanner sc=new Scanner(System.in);
        // Flag de controle
        boolean flag=true;

        // Criando o menu
        while(flag){
            System.out.println("BEM VINDO AO MENU");
            System.out.println("1- Cadastrar Funcionários");
            System.out.println("2- Listar Funcionários");
            System.out.println("3- Sair");
            System.out.println("Entre com a sua opção: ");
            int opcao=sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    // Atribuindo valores as informações do funcionáro
                    System.out.println("Nome: ");
                    func.setNomeFunc(sc.nextLine());
                    System.out.println("CPF: ");
                    func.setCpfFunc(sc.nextLine());
                    System.out.println("Idade: ");
                    func.setIdadeFunc(sc.nextInt());

                    arq.escrever(func);
                    break;
                case 2:
                    // Armazena o retorno do método de leitura
                    ArrayList<Funcionario> funcs=arq.ler();

                    // Percorre o arrayList
                    for(int i=0;i<funcs.size();i++){
                        System.out.println("Informações do Funcionário \n");
                        System.out.println("Nome: "+funcs.get(i).getNomeFunc());
                        System.out.println("CPF: "+funcs.get(i).getCpfFunc());
                        System.out.println("Idade: "+funcs.get(i).getIdadeFunc());
                    }
                    break;
                case 3:
                    flag=false;
                    break;
            }
        }
        sc.close();
    }
}
