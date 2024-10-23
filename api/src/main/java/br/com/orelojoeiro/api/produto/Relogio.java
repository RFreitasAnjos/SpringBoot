package br.com.orelojoeiro.api.produto;

import java.util.UUID;

import br.com.orelojoeiro.api.promocao.Cupom;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Relogio")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Relogio implements Produto,Cupom{
    @Id
    @GeneratedValue
    private UUID id;

    private String marca;
    private String nome;
    private String descricao;
    private String imagemUrl;
    private double preco;
    private int estoque;
    
}
