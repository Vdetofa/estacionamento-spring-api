package com.example.Estacionamento.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Estacionamento.service.EstacionamentoService;
import com.example.Estacionamento.model.EstacionamentoModel;

@RestController
@RequestMapping("/estacionamento")
public class EstacionamentoControler {
    @Autowired
    private EstacionamentoService service;

    @GetMapping
    public List<EstacionamentoModel>listar(){
        return service.listartudo();
    }

    @PostMapping
    public void registro(@RequestBody EstacionamentoModel novoVeiculo){
        service.registro(novoVeiculo);
    }
    
    @PutMapping("/saida")
    public void saida(@RequestParam String placa, @RequestParam double valorPago) {
        service.saida(placa, valorPago);
    }
    
}
