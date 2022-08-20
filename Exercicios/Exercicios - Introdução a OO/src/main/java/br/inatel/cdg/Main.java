package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Carro car=new Carro("Amarelo","886","Ferrarei",80,300);
        Motor m=new Motor();
        m.potencia=350;
        m.tipo="3.0";
        car.motor=m;

        car.ligar();
        car.acelerar();
        car.mostraInfo();
    }


}
