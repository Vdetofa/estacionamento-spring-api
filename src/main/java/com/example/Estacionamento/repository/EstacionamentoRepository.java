package com.example.Estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.Estacionamento.model.EstacionamentoModel;


@Repository
public interface EstacionamentoRepository extends JpaRepository<EstacionamentoModel, Integer> {
    Optional<EstacionamentoModel> findByPlacaAndDataHoraSaidaIsNull(String placa);
    
}
