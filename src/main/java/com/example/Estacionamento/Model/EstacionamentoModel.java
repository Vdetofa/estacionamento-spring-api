package com.example.Estacionamento.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EstacionamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String placa;
    private String modelo;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Double valorPago;

    public EstacionamentoModel(){}

    public EstacionamentoModel(String placa, String modelo, LocalDateTime dataHoraEntrada,LocalDateTime dataHoraSaida, Double valorPago){
        this.placa=placa;
        this.modelo=modelo;
        this.dataHoraEntrada=dataHoraEntrada;
        this.dataHoraSaida=dataHoraSaida;
        this.valorPago=valorPago;
    }   
    
    public Long getId(){return id;}
    public String getPlaca(){return placa;}
    public String getModelo(){return modelo;}
    public LocalDateTime getDataHoraEntrada(){return dataHoraEntrada;}
    public LocalDateTime getDataHoraSaida(){return dataHoraSaida;}
    public Double getValorPago(){return valorPago;}

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada){
        this.dataHoraEntrada=dataHoraEntrada;
    }

      public void setDataHoraSaida(LocalDateTime dataHoraSaida){
        this.dataHoraSaida=dataHoraSaida;
    }

    public void setValorPago(double valorPago){
        this.valorPago=valorPago;
    }

    
}
