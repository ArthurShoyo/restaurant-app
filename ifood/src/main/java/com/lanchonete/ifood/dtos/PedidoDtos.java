package com.lanchonete.ifood.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Time;
import java.time.LocalDate;

public class PedidoDtos {

    @NotBlank
    @Size(max = 40)
    private String cliente;

    @NotBlank
    @Size(max = 50)
    private String endereco;

    @NotBlank
    @Size(max = 30)
    private String produto;

    @NotBlank
    @Size(max = 30)
    private LocalDate data;

    @NotBlank
    private Time time;


    private Time timeentrega;


    private Time timefim;


    private Long id_entregador;


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTimeentrega() {
        return timeentrega;
    }

    public void setTimeentrega(Time timeentrega) {
        this.timeentrega = timeentrega;
    }

    public Time getTimefim() {
        return timefim;
    }

    public void setTimefim(Time timefim) {
        this.timefim = timefim;
    }

    public Long getId_entregador() {
        return id_entregador;
    }

    public void setId_entregador(Long id_entregador) {
        this.id_entregador = id_entregador;
    }
}
