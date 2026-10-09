package com.example.model;

import java.time.LocalDateTime;

public class DetalleVenta {
    private Long id; // para que sea autogenerado por la BD
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaCreacion;
    private int cantidad;
    private double subtotal;
    private Long medicamentoId; // llave foranea hacia medicamento
    private Long ventaId; // llave foranea hacia venta
    private boolean estadoActivo; // true = activo, false = eliminado


    // Constructor completo

    public DetalleVenta(Long id, LocalDateTime fechaActualizacion, LocalDateTime fechaCreacion,
            int cantidad, double subtotal, Long medicamentoId, Long ventaId, boolean estadoActivo) {
        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.medicamentoId = medicamentoId;
        this.ventaId = ventaId;
        this.estadoActivo = estadoActivo;
    }


    // Constructor sin ID
    // (para insertar nuevos detalles sin ID)

    public DetalleVenta(LocalDateTime fechaActualizacion, LocalDateTime fechaCreacion,
            int cantidad, double subtotal, Long medicamentoId, Long ventaId, boolean estadoActivo) {
        this(null, fechaActualizacion, fechaCreacion, cantidad, subtotal, medicamentoId, ventaId, estadoActivo);
    }


    // Constructor vacio

    public DetalleVenta() {
        this.fechaActualizacion = LocalDateTime.now();
        this.fechaCreacion = LocalDateTime.now();
        this.estadoActivo = true;
    }


    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Long getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Long medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public Long getVentaId() {
        return ventaId;
    }

    public void setVentaId(Long ventaId) {
        this.ventaId = ventaId;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "DetalleVenta [id=" + id + ", ventaId=" + ventaId + ", medicamentoId=" + medicamentoId
                + ", cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
    }
}