
import java.util.Scanner;

public class MainAula1 {

    public static void main(String[] args) {

        // Estruturas de repetição - Switch Case
        System.out.println("-----Média do aluno----");
        System.out.println("A- Excelente" + " B- Bom"+ " C- Regular"+ " D - Ruim");

        Scanner sc=new Scanner(System.in); // Entrada de dados
        String aux=sc.nextLine(); // Auxiliar que armazenada o valor digitado
        char nota=aux.charAt(0);

        switch(nota){
            case 'A':
                System.out.println("Excelente nota");
                break;
            case 'B':
                System.out.println("Boa nota");
                break;
            case 'C':
                System.out.println("Nota Regular");
                break;
            case 'D':
                System.out.println("Nota ruim");
                break;
            default:
                System.out.println("Inválido");
                break;

        }
    }
}
