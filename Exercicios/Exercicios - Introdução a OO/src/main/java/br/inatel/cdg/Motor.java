package br.inatel.cdg;

public class Motor {
    public int potencia;
    public String tipo;


    public void mostraInfo(){
        System.out.println("--- MOTOR ---");
        System.out.println("POTÊNCIA: "+potencia+" CV");
        System.out.println("Tipo: "+tipo);
    }
}
