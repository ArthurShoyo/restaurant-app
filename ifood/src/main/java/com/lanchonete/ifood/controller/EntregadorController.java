package com.lanchonete.ifood.controller;

import com.lanchonete.ifood.dtos.EntregadorDtos;
import com.lanchonete.ifood.models.EntregadoresModels;
import com.lanchonete.ifood.services.EntregadorServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class EntregadorController {
    final
    EntregadorServices entregadorServices;

    public EntregadorController(EntregadorServices entregadorServices) {
        this.entregadorServices = entregadorServices;
    }

    @GetMapping
    public ResponseEntity<Object> getAllEntregadores () {
        return ResponseEntity.status(HttpStatus.OK).body(entregadorServices.findAll());
    }

    @PostMapping
    public ResponseEntity<Object> saveEntregador (@RequestBody @Valid EntregadorDtos entregadorDtos) {
        var entregadoresModels = new EntregadoresModels();
        BeanUtils.copyProperties(entregadorDtos, entregadoresModels);
        return ResponseEntity.status(HttpStatus.CREATED).body(entregadorServices.save(entregadoresModels));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneEntregador (@PathVariable(value = "id") Long id) {
        Optional<EntregadoresModels> entregadoresModelsOptional = entregadorServices.findById(id);
        if (!entregadoresModelsOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(entregadoresModelsOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEntregador (@PathVariable(value = "id") Long id) {
        Optional<EntregadoresModels> entregadoresModelsOptional = entregadorServices.findById(id);
        if (!entregadoresModelsOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado");
        }
        entregadorServices.delete(entregadoresModelsOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Entregador Deletado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateEntregador (@PathVariable(name = "id") Long id, @RequestBody @Valid EntregadorDtos entregadorDtos) {
        Optional<EntregadoresModels> entregadorModelsOptional = entregadorServices.findById(id);
        if (!entregadorModelsOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado");
        }
        var entregadoresModels = new EntregadoresModels();
        BeanUtils.copyProperties(entregadorDtos, entregadoresModels);
        entregadoresModels.setId(entregadorModelsOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(entregadorServices.save(entregadoresModels));
    }
}
