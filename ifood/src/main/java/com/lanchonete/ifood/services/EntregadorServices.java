package com.lanchonete.ifood.services;


import com.lanchonete.ifood.models.EntregadoresModels;
import com.lanchonete.ifood.repository.EntregadorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EntregadorServices {

    final
    EntregadorRepository entregadorRepository;

    public EntregadorServices (EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    public List<EntregadoresModels> findAll() {

        return entregadorRepository.findAll();
    }

    public EntregadoresModels save(EntregadoresModels entregadoresModels){
        return entregadorRepository.save(entregadoresModels);
    }
    public Optional<EntregadoresModels> findById(Long id) {
        return entregadorRepository.findById(id);
    }

    @Transactional
    public void delete(EntregadoresModels entregadoresModels) {
        entregadorRepository.delete(entregadoresModels);
    }
}
