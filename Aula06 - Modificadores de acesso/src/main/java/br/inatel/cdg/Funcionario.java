package br.inatel.cdg;

public class Funcionario {
    // Atributos de um funcionário
    private String nome; // Nome do funcionário
    private int id; // Id único do funcionário
    private static int cont=0; // Atributo da classe

    public Funcionario(){
        cont++; // Incrementando contador de funcionários
        this.id=cont;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("ID: "+this.id);
    }

    public static int getCont(){
        return cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }


}
