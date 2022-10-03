import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Declarando uma ArrayList
        ArrayList listaDeItens=new ArrayList(); // Heterogênea
        ArrayList <Integer> listaDeInteiros=new ArrayList<>(); // Homogênea
        ArrayList <Conta> contas=new ArrayList<>(); // Homogênea ( Tipo Conta)

        Conta c1=new Conta("Gabriel",700);
        Conta c2=new Conta("Caio",7000);
        Conta c3=new Conta("Marcos",1700);

        // Adicionando os objetos no array list de contas
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        // Ordenando a conta
        Collections.sort(contas);

        // Verificando os dados das contas
        for(int i=0;i<contas.size();i++){
            System.out.println("Dono: "+contas.get(i).getDono());
            System.out.println("Saldo: "+contas.get(i).getSaldo());
        }


        /*
        // Adicionando itens no arrayList de Inteiros
        listaDeInteiros.add(10);
        listaDeInteiros.add(5);
        listaDeInteiros.add(15);
        listaDeInteiros.add(20);

        // Imprimindo os dados
        // Mostrando item a item

        System.out.println("Antes da ordenação");
        for(int i=0;i<listaDeInteiros.size();i++){
            System.out.print(listaDeInteiros.get(i)+" ");
        }

        Collections.sort(listaDeInteiros); // Ordenando em ordem crescente
        Collections.reverse(listaDeInteiros); // Invertendo a ordem de ordenação

        System.out.println("\nDepois da ordenação");
        for(int i=0;i<listaDeInteiros.size();i++){
            System.out.print(listaDeInteiros.get(i)+" ");
        }


        // Criando uma conta
        Conta c1=new Conta("Gabriel",90);

        // Adicionando itens ao array list
        listaDeItens.add(1); // Adicionando um inteiro
        listaDeItens.add("Gabriel");// Adicionando uma string
        listaDeItens.add(c1); // Adicionando uma conta
        listaDeItens.add(false);
        System.out.println(listaDeObjetos);

        // Removendo itens
        listaDeItens.remove(c1); // Removendo o item de Conta
        listaDeItens.remove(0);// Removendo pela posição

        // Mostrando item a item
        for(int i=0;i<listaDeItens.size();i++){
            System.out.println(listaDeItens.get(i));
        }
        */



    }
}
