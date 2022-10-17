package br.inatel.cdg.ExercicioProposto;

public class Main2 {
    public static void main(String[] args) {
        // Criando um carrinho
        Carrinho car=new Carrinho();

        // Criando alguns produtos
        Produto p1=new Produto("Monitor",800);
        Produto p2=new Produto("Celular",1700);
        Produto p3=new Produto("Televisão",3000);

        // Adicionando os produtos ao carrinho
        car.addProduto(p1);
        car.addProduto(p2);
        car.addProduto(p3);

        // Testando
        car.listarProdutos();
    }
}
