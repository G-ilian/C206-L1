import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um array de funcionários
        Funcionario [] func=new Funcionario[3];

        // Criando os funcionários
        Funcionario f1=new Funcionario("Gabriel","dev",21);
        Funcionario f2=new Funcionario("Marcos","Professor",50);
        Funcionario f3=new Funcionario("Rodrigo","Arquiteto",50);

        // Preenchendo o nosso array

        Conta c1=new Conta(700);


        c1.sacar(800);

        System.out.println("Continuando ...");




        // Gerando uma exceção


        /*

        // 1. Exceção de NullPointerException

        try{
            for(int i=0;i< func.length;i++){
                System.out.println("Nome: "+func[i].getNome());
                System.out.println("Cargo: "+func[i].getCargo());
                System.out.println("Idade: "+func[i].getIdade());
            }
        }catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Código segue rodando !!!");

        //2. ArrayIndexOutOfBounds
        try{
            func[0]=f1;
            func[1]=f2;
            func[3]=f3;
        }catch(ArrayIndexOutOfBoundsException e){
            // Mostrando todos os detalhes do erro
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("Código segue rodando !!!");
        //3. Arithemitch Exception
                try{
            n3=n1/n2;
        }catch(Exception e){
            System.out.println(e);
        }

        //4. Try-catch para mais que uma exceção
                int n3=0;

        try{
            System.out.println("Entre com o primeiro número >: ");
            int n1=sc.nextInt();
            System.out.println("Entre com o segundo número >: ");
            int n2=sc.nextInt();
            n3=n1/n2;
        }catch(InputMismatchException e){
            System.out.println("O primeiro número deve ser inteiro !!");
            System.out.println(e);
        }catch (ArithmeticException c){
            System.out.println("Não é permitida a divisão por zero !!");
            System.out.println(c);
        }

                Scanner sc=new Scanner(System.in);

        //4. Finally
        int n3=0;

        try{
            System.out.println("Entre com o primeiro número >: ");
            int n1=sc.nextInt();
            System.out.println("Entre com o segundo número >: ");
            int n2=sc.nextInt();
            n3=n1/n2;
        }catch(InputMismatchException e){
            System.out.println("O primeiro número deve ser inteiro !!");
            System.out.println(e);
        }catch (ArithmeticException c){
            System.out.println("Não é permitida a divisão por zero !!");
            System.out.println(c);
        }finally{
            System.out.println("O resultado da divisão é: "+n3);
        }

        // 5. Exceção personalizada tratamento na main
        try{
            c1.sacar(800);
        }catch(SemSaldoException e){
            System.out.println(e);
        }
         */
    }
}
