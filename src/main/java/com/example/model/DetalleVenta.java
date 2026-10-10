package com.example.model;

import java.time.LocalDateTime;

public class DetalleVenta {

    private Integer id;
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaCreacion;
    private Integer cantidad;
    private Integer subtotal;
    private Integer medicamentoId;
    private Integer ventaId;
    private Boolean estadoActivo;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id, LocalDateTime fechaActualizacion,
            LocalDateTime fechaCreacion, Integer cantidad,
            Integer subtotal, Integer medicamentoId, Integer ventaId,
            Boolean estadoActivo) {

        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.medicamentoId = medicamentoId;
        this.ventaId = ventaId;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Integer medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public Integer getVentaId() {
        return ventaId;
    }

    public void setVentaId(Integer ventaId) {
        this.ventaId = ventaId;
    }

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "id=" + id +
                ", fechaActualizacion=" + fechaActualizacion +
                ", fechaCreacion=" + fechaCreacion +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", medicamentoId=" + medicamentoId +
                ", ventaId=" + ventaId +
                ", estadoActivo=" + estadoActivo +
                '}';
    }
}