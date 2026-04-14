package com.example.Estacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Estacionamento.model.EstacionamentoModel;
import com.example.Estacionamento.repository.EstacionamentoRepository;

@Service
public class EstacionamentoService {
    @Autowired
    private EstacionamentoRepository repository;

    public List<EstacionamentoModel> listartudo(){
        return repository.findAll();
    }
    
}
