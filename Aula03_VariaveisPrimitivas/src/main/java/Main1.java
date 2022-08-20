import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); // Variável para entrada de dados

        //System.out.println("Entre com um número inteiro: ");
        //int numero1=teclado.nextInt(); // Entrada de número inteiro

        //System.out.println("Entre com um número float: ");
        //float numero2=teclado.nextFloat(); // Entrada de número inteiro

        //System.out.println("Entre com um número double: ");
        //double numero3= teclado.nextDouble(); // Entrada de número inteiro

        //teclado.nextLine();
        //System.out.println("Qual o seu nome? ");
        //String nome=teclado.nextLine(); // String para nome - Auxiliar
        //char primeiraLetra; // Variável para armazenar primeira letra do nome
        //primeiraLetra=nome.charAt(0);

        // Operador Ternário
        //String maior=(numero1>numero2)?"Número 1 é maior que o número 2":"Número 2 é maior que o número 1";
        //System.out.println(maior);

        // Estrutura de repetição

        //int contador=0;

        //while(contador<25){
            //contador++;
            //System.out.println("Valor contador (while) : "+contador);
        //}
        //for(int i=0;i<25;i++){
            //System.out.println("Valor contador (for): "+i);
        //}

        int valor;

        System.out.println("0- Falso 1- Verdadeiro");
        valor=teclado.nextInt();

        switch(valor){
            case 0:
                System.out.println("Falso");
                break;
            case 1:
                System.out.println("Verdadeiro");
                break;
            default:
                System.out.println("Entrada Inválida");
                break;

        }

        /*
        System.out.println("Número 1: "+numero1);
        System.out.println("Número 2: "+numero2);
        System.out.println("Número 3: "+numero3);
        System.out.println("NOME: "+nome);
        System.out.println("Primeira Letra: "+primeiraLetra);



        // Variáveis Primitivas
        int a=1; // Primitiva do tipo inteiro
        float b=1.3f; // Primitiva do tipo float
        double c=1.75; // Primitiva do tipo double
        char d='d'; // Primitivda do tipo char
        int novo=10; // Novo inteiro
        float novoFloat=10.3f; // Novo float nome composto
        final float PRECO_PASSAGEM; // Declaração de constantes

        int valor=10; // Variável de valor
        double valorCopia=valor;

        // Classe String
        String nome="GABRIEL";

        // Casting
        int num1=1; // Número 1
        int num2=2; // Número 2

        System.out.println("Resultado divisão: "+(double)num1/num2);
        */



    }
}
