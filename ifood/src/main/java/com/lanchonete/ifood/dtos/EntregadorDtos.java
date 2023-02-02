package com.lanchonete.ifood.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class EntregadorDtos {

    @NotBlank
    @Size(max = 20)
    private String nome;

    @NotBlank
    @Size(max = 30)
    private String email;

    @NotBlank
    @Size(max = 30)
    private String senha;

    @NotBlank
    @Size(max = 30)
    private String veiculo;

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
