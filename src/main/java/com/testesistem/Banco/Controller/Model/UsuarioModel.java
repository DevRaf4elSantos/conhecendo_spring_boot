package com.testesistem.Banco.Controller.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

//Transforma uma classe em uma Entity do banco de dados
@Entity
@Table(name = "tb_cadastro_usuarios")

public class UsuarioModel {
    //Gera um valor sequencial 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private Byte idade;
    private char sexo;
    public UsuarioModel(){

    }

    public UsuarioModel(String nome, String sobrenome, Byte idade, char sexo){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.idade = idade;
            this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
