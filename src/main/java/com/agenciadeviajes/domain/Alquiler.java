/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciadeviajes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Fernando
 */
@Data
@Entity
@Table(name = "alquiler")
public class Alquiler implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlquiler; 
    String titulo;
    String tipo;//vehiculo
    String imagen;
    String descripcion;
    String detalle;//botn

    public Alquiler() {
    }

    public Alquiler(Long idAlquiler, String titulo, String tipo, String imagen, String descripcion, String detalle) {
        this.idAlquiler = idAlquiler;
        this.titulo = titulo;
        this.tipo = tipo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.detalle = detalle;
    }
    
}
