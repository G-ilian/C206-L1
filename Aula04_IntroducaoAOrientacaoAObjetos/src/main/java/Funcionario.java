public class Funcionario {
    // Atributos - O que o funcionário tem
    String nome;
    float salario;
    int cpf;
    int idade;
    // Construtor da classe

    public Funcionario(String nome,int certidaoDePessoaFisica,int idade,float salario) {

        this.nome = nome;
        this.cpf=certidaoDePessoaFisica;
        this.idade=idade;
        this.salario=salario;
    }

    // Metódos - O que um funcionário faz
    public void tirarFerias(String mes,int qtdDias){
        System.out.println("O funcionário "+this.nome+
                " vai tirar férias em "+mes+" por "+qtdDias+" dias");
    }

    public float calculaSalarioAnual(){
        float salarioAnual;
        salarioAnual=this.salario*12;
        return salarioAnual;
    }

    public float calculaSalarioAnual(float decimoTerceiro){
        float salarioAnual;
        salarioAnual=(this.salario*12)+decimoTerceiro;
        return salarioAnual;
    }

    public void mostraInfos(){
        System.out.println("--- Informações do Funcionário ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario: "+this.salario);
    }
}
