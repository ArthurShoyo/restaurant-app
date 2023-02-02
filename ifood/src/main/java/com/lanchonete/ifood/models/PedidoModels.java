package com.lanchonete.ifood.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class PedidoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cliente", nullable = false, length = 40)
    private String cliente;

    @Column(name = "endereco", nullable = false, length = 50)
    private String endereco;

    @Column(name = "produto", nullable = false, length = 30)
    private String produto;

    @Column(name = "data", nullable = false, length = 30)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @Column(name = "hora_pedido", nullable = false)
    private Time time;

    @Column(name = "hora_entrega")
    private Time timeentrega;

    @Column(name = "hora_fim")
    private Time timefim;

    @Column(name = "id_entregador")
    private Long id_entregador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setId_entre(Long id_entregador) {
        this.id_entregador = id_entregador;
    }
}
