package br.inatel.cdg.classesAbstratasEInterfaces;

// Classe mãe
public abstract class Funcionario {
    // Atributos do funcionário
    private String nome;
    private int idade;
    private double salario;

    // Método do funcionário

    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salário: "+this.salario);
    }

    public abstract void executaAcao();

    // Getters and setters
    public double salarioBonus(){
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}