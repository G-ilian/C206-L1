package br.inatel.cdg;

public class Carro {

    // Atributos de classe
    String cor; // Cor do carro
    String modelo; // Modelo do carro
    String marca; // Marca do carro
    double velocidadeMax; // Velocidade máxima atingida pelo carro
    double velocidadeAtual; // Velocidade atual do carro

    // Composição
    Motor motor=new Motor();

    // Construtor - É inicializado toda a vez que instanciamos um novo objeto do tipo Carro
    public Carro(String cor,String m,String ma, double velAtual,double velMax){
       cor=cor;
       modelo=m;
       marca=ma;
       velocidadeAtual=velAtual;
       velocidadeMax=velMax;
    }

    // Metódos da classe
    void ligar(){
        System.out.println("O "+modelo+" da "+marca+" está ligado");
    }

    void acelerar(){
        if(velocidadeAtual<=velocidadeMax){
            System.out.println("O carro está acelerando");
        }else{
            System.out.println("O carro está com a velocidade limitada, tirá um pouco o pé !!");
        }

    }

    public void mostraInfo(){
        System.out.println("---- DADOS ACERCA DO VEÍCULO ---");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidade Máxima: "+velocidadeMax);
        motor.mostraInfo();
    }


}
