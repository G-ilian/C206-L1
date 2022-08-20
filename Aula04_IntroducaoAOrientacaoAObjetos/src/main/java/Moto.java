public class Moto {
    // Atributos - O que a minha moto tem
    String cor;
    String marca;
    String modelo;

    // Atributos Implicitos
    Piloto p; // Isso é uma agregação
    Motor m=new Motor(); // Isso é uma composição

    // Metódos - O que a minha moto faz

    public void adicionarPiloto(Piloto pilotoMoto){
        this.p=pilotoMoto;
    }
    public void ligar(){
        System.out.println("A moto está ligada !!");
    }
    public void acelerar(){
        System.out.println("A moto está acelerando !!");
    }

    public void mostraInfos(){
        System.out.println("--- Infos da moto ---");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        this.m.mostraInfos();
        this.p.mostraInfos();


    }
}
