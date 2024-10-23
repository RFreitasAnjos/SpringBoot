package br.com.orelojoeiro.api.users;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public abstract class UserCliente implements Users{
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    private String cpf;
    private String email;
    private String dataNascimento;
    private Boolean eAdm;
    private Date date; // Criaçao da conta
}
