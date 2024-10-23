package br.com.orelojoeiro.api.users;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
//@FunctionalInterface
public interface Users extends Comparable<Users>{
    Date getDate();
    boolean iseAdm(); // Data de criaçao da conta
    default boolean VerificaDireitos(boolean iseAdm){
        return false;
    }
}
