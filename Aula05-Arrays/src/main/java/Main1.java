public class Main1 {

    public static void main(String[] args) {
        int []arrayInteiros={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i=0;i<arrayInteiros.length;i++){
            System.out.println(arrayInteiros[i]);
        }

        Conta []arrayContas=new Conta[10]; // Array de contas

        arrayContas[0]=new Conta("Gabriel Ilian",100); // Maneira 1 atribuir conta as posições

        Conta c1=new Conta("Moises",800); // Maneira 2
        arrayContas[1]=c1; // Atribuindo conta a posição


        System.out.println("Nome do titular na posição 0: ");
        System.out.println(arrayContas[0].nomeTitular);

        System.out.println("Nome do titular na posição 1: ");
        System.out.println(arrayContas[1].nomeTitular);

        for (int i=0;i<arrayContas.length;i++){
            if(arrayContas[i]!=null){
                System.out.println("Nome do titular: "+arrayContas[i].nomeTitular);
                System.out.println("Saldo: "+arrayContas[i].saldo);
            }
        }
        /*
        for(int i=0;i< arrayContas.length;i++){
            arrayContas[i]=new Conta();
        }
        */

    }

}
