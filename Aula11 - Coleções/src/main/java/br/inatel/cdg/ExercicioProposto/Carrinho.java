package br.inatel.cdg.ExercicioProposto;
import java.util.ArrayList;
import java.util.Collections;

public class Carrinho {
    private ArrayList<Produto> produtos=new ArrayList<>(); // Array List de produtos

    public void addProduto(Produto produto){
        produtos.add(produto); // Adicionando produtos ao arrayList
    }

    public void listarProdutos(){
        Collections.sort(produtos);
        Collections.reverse(produtos);


        for(int i=0;i<produtos.size();i++){
            System.out.println("Nome: "+this.produtos.get(i).getNome());
            System.out.println("Valor: "+this.produtos.get(i).getPreco());
        }
    }
}
