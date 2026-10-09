package com.example.model;

import java.time.LocalDateTime;

public class Formula {
    private Long id; 
    private String nombre;
    private Boolean estadoActivo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

   
    public Formula(Long id, String nombre, Boolean estadoActivo, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.estadoActivo = estadoActivo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Formula(String nombre, Boolean estadoActivo, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this(null, nombre, estadoActivo, fechaCreacion, fechaActualizacion);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}

