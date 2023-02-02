package com.lanchonete.ifood.services;

import com.lanchonete.ifood.models.PedidoModels;
import com.lanchonete.ifood.repository.EntregadorRepository;
import com.lanchonete.ifood.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PedidoServices {

    final
    PedidoRepository pedidoRepository;

    public PedidoServices (PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoModels>  findAll() {
        return pedidoRepository.findAll();
    }

    public PedidoModels save(PedidoModels pedidoModels) {
        return pedidoRepository.save(pedidoModels);
    }
}
