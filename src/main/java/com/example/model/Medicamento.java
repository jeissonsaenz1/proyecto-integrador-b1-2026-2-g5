package com.example.model;

import java.time.LocalDateTime;

public class Medicamento {

    private Integer id;
    private LocalDateTime fechaActualizacion;
    private LocalDateTime fechaCreacion;
    private String nombre;
    private Integer laboratorioId;
    private Boolean estadoActivo;

    public Medicamento() {
    }

    public Medicamento(Integer id,
                       LocalDateTime fechaActualizacion,
                       LocalDateTime fechaCreacion,
                       String nombre,
                       Integer laboratorioId,
                       Boolean estadoActivo) {
        this.id = id;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.laboratorioId = laboratorioId;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLaboratorioId() {
        return laboratorioId;
    }

    public void setLaboratorioId(Integer laboratorioId) {
        this.laboratorioId = laboratorioId;
    }

    public Boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(Boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", fechaActualizacion=" + fechaActualizacion +
                ", fechaCreacion=" + fechaCreacion +
                ", nombre='" + nombre + '\'' +
                ", laboratorioId=" + laboratorioId +
                ", estadoActivo=" + estadoActivo +
                '}';
    }
}