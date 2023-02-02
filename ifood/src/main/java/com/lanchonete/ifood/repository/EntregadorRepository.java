package com.lanchonete.ifood.repository;


import com.lanchonete.ifood.models.EntregadoresModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadoresModels, Long>  {
}
