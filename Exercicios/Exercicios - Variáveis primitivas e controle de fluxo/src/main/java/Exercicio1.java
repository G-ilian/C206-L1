import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /* ENTRADA DE DADOS */
        Scanner entrada=new Scanner(System.in); // Variável para entrada de dados
        int num1;// Variável númerica para armazenar o primeiro valor
        int num2;// Variável númerica para armazenar o segundo valor

        // Critica de dados para impedir o usuário de entrar com valores negativos ou nulos

        do {
            System.out.println("Número 1: ");
            num1 = entrada.nextInt();
            System.out.println("Número 2: ");
            num2 = entrada.nextInt();
        }while(!(num1>=0 && num2>=0));

        entrada.nextLine();
        /* MENU PARA A ESCOLHA DA OPERAÇÃO POR PARTE DO USUÁRIO */

        char opcao; // Variável que armazenará a opção escolhida pelo usuário
        String aux;// Variável auxiliar para entrada de dados

        // Critica de dados para impedir o usuário de entrar com valores inesperados
        do{
            System.out.println("--- CALCULADORA ---");
            System.out.println("S- Subtração");
            System.out.println("D- Divisão");
            System.out.println("A- Adição");
            System.out.println("M- Multiplicação");
            System.out.println("E- Exponencial");
            aux=entrada.nextLine();
            opcao=aux.toUpperCase().charAt(0);
        }while(!(opcao=='A'||opcao=='D'||opcao=='M'||opcao=='E'||opcao=='S'));


        // Swtich case que é responsável pela realização de cada uma das operações
        switch(opcao){
            case 'A':
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 'S':
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case 'M':
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case 'D':
                /* É realizado um casting no segundo número para garantir que o resultado seja diferente de um inteiro*/
                System.out.println(num1+" / "+num2+" = "+(double)num1/num2);
                break;
            case 'E':
                System.out.println(num1+" ^ "+num2+" = "+(Math.pow(num1,num2)));
                break;

        }

        entrada.close(); // Fechando a entrada de dados depois de termos utilizado.
    }
}
