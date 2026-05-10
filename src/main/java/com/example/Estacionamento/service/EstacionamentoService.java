package com.example.Estacionamento.service;

import java.util.List;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Estacionamento.model.EstacionamentoModel;
import com.example.Estacionamento.repository.EstacionamentoRepository;

@Service
public class EstacionamentoService {
    @Autowired
    private EstacionamentoRepository repository;

    public void registro(EstacionamentoModel novoVeiculo){
        if(novoVeiculo.getDataHoraEntrada()== null){
            novoVeiculo.setDataHoraEntrada(LocalDateTime.now());

        }
        repository.save(novoVeiculo);
        return;
    }

    public void saida(String placa, double valorPago){
        var caixa= repository.findByPlacaAndDataHoraSaidaIsNull(placa);
        if(caixa.isPresent()){
            EstacionamentoModel veiculo = caixa.get();
            veiculo.setDataHoraSaida(LocalDateTime.now());
            veiculo.setValorPago(valorPago);

            repository.save(veiculo);
        }else{
            throw new RuntimeException("Veículo não encontrado ou já saiu!");
        }
        
    }

    public List<EstacionamentoModel> listartudo(){
        return repository.findAll();
    }
    
}
