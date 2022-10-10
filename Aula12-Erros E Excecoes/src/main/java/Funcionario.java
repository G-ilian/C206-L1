public class Funcionario {
    // Atributos do meu funcionário
    private String nome;
    private String cargo;
    private int idade;

    public Funcionario(String nomeFunc,String cargoFunc,int idadeFunc){
        this.nome=nomeFunc;
        this.cargo=cargoFunc;
        this.idade=idadeFunc;
    }

    // Getters and setters

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }
}
