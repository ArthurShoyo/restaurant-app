package com.lanchonete.ifood.repository;

import com.lanchonete.ifood.models.PedidoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository <PedidoModels, Long> {

}
