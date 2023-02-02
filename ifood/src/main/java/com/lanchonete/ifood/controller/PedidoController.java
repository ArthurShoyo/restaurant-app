package com.lanchonete.ifood.controller;

import com.lanchonete.ifood.dtos.EntregadorDtos;
import com.lanchonete.ifood.dtos.PedidoDtos;
import com.lanchonete.ifood.models.PedidoModels;
import com.lanchonete.ifood.repository.PedidoRepository;
import com.lanchonete.ifood.services.PedidoServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.beans.Beans;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pedido")
public class PedidoController {

    final
    PedidoServices pedidoServices;

    public PedidoController (PedidoServices pedidoServices) {
        this.pedidoServices = pedidoServices;
    }

    @GetMapping
    public ResponseEntity<Object> getAllPedidos() {
        return ResponseEntity.status(HttpStatus.OK).body(pedidoServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> savePedidos (@RequestBody @Valid PedidoDtos pedidoDtos) {
        var pedidoModels = new PedidoModels();
        BeanUtils.copyProperties(pedidoDtos, pedidoModels);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoServices.save(pedidoModels));
    }

}
