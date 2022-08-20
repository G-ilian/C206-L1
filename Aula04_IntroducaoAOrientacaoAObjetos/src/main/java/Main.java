public class Main {

    public static void main(String[] args) {
        // Instanciando Objetos
        Funcionario f1=new Funcionario("Carlos",90,28,1000); // Referência para Funcionário
        Funcionario f2=new Funcionario("Carlos",90,28,1000);

        // Invocando os metódos
        //f1.tirarFerias("Dezembro",20);
        //f1.mostraInfos();
        float calculoSalAnual; // Armazena o salário anual
        calculoSalAnual=f1.calculaSalarioAnual();
        //System.out.println("Salário Anual: "+calculoSalAnual);
        //System.out.println("Salário anual + Decimo Terceiro "
                //+f1.calculaSalarioAnual(1300f));
        /*
        f1=f2;
        if(f1==f2){
            System.out.println("São o mesmo objeto!!!");
        }else{
            System.out.println("São  objetos diferentes!!!");
        }
        System.out.println("Objeto 1: "+f1);
        System.out.println("Objeto 2: "+f2);

         */
        Moto moto=new Moto();
        moto.marca="Honda";
        moto.modelo="Bros";
        moto.cor="Preta";

        Piloto p=new Piloto();
        p.nome="Carlos Henrique";
        p.idade=20;

        //motor.cilindradas=160;


        moto.adicionarPiloto(p);
        moto.m.cilindradas=180; // Acessando as informações através da composição de forma direta


        moto.mostraInfos();
    }
}
