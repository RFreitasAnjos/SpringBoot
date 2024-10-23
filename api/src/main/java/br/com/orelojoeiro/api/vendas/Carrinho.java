package br.com.orelojoeiro.api.vendas;

import java.util.List;

import br.com.orelojoeiro.api.produto.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Carrinho")
@Setter
@Getter
public class Carrinho {
    private double total;
    private List<Produto> produtos;
    private int quantidadeProduto;

    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }
    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public double getCarrinho(){
        return total;
    }
}
