package com.example.Estacionamento.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EstacionamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String placa;
    String modelo;
    LocalDateTime dataHoraEntrada;
    LocalDateTime dataHoraSaida;
    double valorPago;

    public EstacionamentoModel(){}

    public EstacionamentoModel(String placa, String modelo, LocalDateTime dataHoraEntrada,LocalDateTime dataHoraSaida, double valorPago){
        this.placa=placa;
        this.modelo=modelo;
        this.dataHoraEntrada=dataHoraEntrada;
        this.dataHoraSaida=dataHoraSaida;
        this.valorPago=valorPago;
    }
    
    public long getID(){return id;}
    public String getPlaca(){return placa;}
    public LocalDateTime getDataHoraEntrada(){return dataHoraEntrada;}
    public LocalDateTime getDataHoraSaida(){return dataHoraSaida;}
    public double getValorPago(){return valorPago;}

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada){
        this.dataHoraEntrada=dataHoraEntrada;
    }

      public void setDataHoraSaida(LocalDateTime dataHoraSaida){
        this.dataHoraSaida=dataHoraSaida;
    }

    
}
