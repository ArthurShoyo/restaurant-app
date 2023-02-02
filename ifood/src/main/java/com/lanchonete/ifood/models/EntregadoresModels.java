package com.lanchonete.ifood.models;

import jakarta.persistence.*;

@Entity
@Table(name = "entregadores")
public class EntregadoresModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome",nullable = false, unique = true, length = 20)
    private String nome;

    @Column(name = "email",nullable = false, unique = true, length = 30)
    private String email;

    @Column(name = "senha",nullable = false, length = 30)
    private String senha;

    @Column(name = "veiculo", nullable = false,  length = 30)
    private String veiculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
}
