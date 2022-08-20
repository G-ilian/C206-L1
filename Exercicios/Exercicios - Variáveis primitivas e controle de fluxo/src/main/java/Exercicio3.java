import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /* ENTRADA DE DADOS */
        Scanner entrada=new Scanner(System.in); // Variável para entrada de dados

        double qtdLitros;// Quantidade de litros de combustível
        String aux; // Variável auxiliar para entrada de dados
        char tipoCombustivel; // Tipo de combustível adquirido pelo cliente

        // Crítica de dados para que o usuário selecione apenas um dos dois tipos de combustíveis
        do {
            System.out.println("--- TIPO DE COMBUSTÍVEL ---");
            System.out.println("G- Gasolina | A- Álcool");
            aux=entrada.nextLine();
            tipoCombustivel=aux.toUpperCase().charAt(0);
        }while(!(tipoCombustivel=='G'||tipoCombustivel=='A'));

        // Crítica de dados para impedir que o usuário entre com valores de litros nulo ou negativo
        do{
            System.out.println("Quantidade de litros: ");
            qtdLitros = entrada.nextDouble();
        }while(qtdLitros<=0);



        // Swtich case que é responsável pela cálculo do desconto
        switch(tipoCombustivel) {
            case 'A':
                System.out.println("VALOR SEM DESCONTO: "+(qtdLitros*4.90));
                if(qtdLitros<=20){
                    System.out.println("VALOR COM 3% DE DESCONTO: "+(qtdLitros*4.90)*0.97);
                }else{
                    System.out.println("VALOR COM 5% DE DESCONTO: "+(qtdLitros*4.90)*0.95);
                }

                break;
            case 'G':
                System.out.println("VALOR SEM DESCONTO: "+(qtdLitros*6));

                if(qtdLitros<=20){
                    System.out.println("VALOR COM 4% DE DESCONTO: "+(qtdLitros*6)*0.96);
                }else{
                    System.out.println("VALOR COM 6% DE DESCONTO: "+(qtdLitros*6)*0.94);
                }
                break;
        }

        entrada.close(); // Fechando a entrada de dados depois de termos utilizado.
    }
}
