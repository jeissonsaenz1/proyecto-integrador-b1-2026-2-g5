package com.example.model;

import java.time.LocalDateTime;

public class Venta {
    private Long id; // para que sea autogenerado por la BD
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaCreacion;
    private String estado; // 'pendiente', 'pagada', 'anulada', etc.
    private double total;
    private boolean estadoActivo; // true = activa, false = eliminada

    
    // Constructor completo
    
    public Venta(Long id, LocalDateTime fechaActualizacion, LocalDateTime fechaCreacion,
            String estado, double total, boolean estadoActivo) {
        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.total = total;
        this.estadoActivo = estadoActivo;
    }

    
    // Constructor sin ID
    // (para insertar nuevas ventas sin ID)
    
    public Venta(LocalDateTime fechaActualizacion, LocalDateTime fechaCreacion,
            String estado, double total, boolean estadoActivo) {
        this(null, fechaActualizacion, fechaCreacion, estado, total, estadoActivo);
    }

    
    // Constructor vacio
    
    public Venta() {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", estado=" + estado + ", total=" + total + "]";
    }
}