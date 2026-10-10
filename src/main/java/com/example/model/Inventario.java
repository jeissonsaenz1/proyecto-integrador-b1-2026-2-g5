package com.example.model;

import java.time.LocalDateTime;

public class Inventario {

    private Integer id;
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaVencimiento;
    private String lote;
    private Integer stock;
    private Integer medicamentoId;
    private Boolean estadoActivo;

    public Inventario() {
    }

    public Inventario(Integer id,
                      LocalDateTime fechaActualizacion,
                      LocalDateTime fechaCreacion,
                      LocalDateTime fechaVencimiento,
                      String lote,
                      Integer stock,
                      Integer medicamentoId,
                      Boolean estadoActivo) {
        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
        this.stock = stock;
        this.medicamentoId = medicamentoId;
        this.estadoActivo = estadoActivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Integer medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", fechaActualizacion=" + fechaActualizacion +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaVencimiento=" + fechaVencimiento +
                ", lote='" + lote + '\'' +
                ", stock=" + stock +
                ", medicamentoId=" + medicamentoId +
                ", estadoActivo=" + estadoActivo +
                '}';
    }
}