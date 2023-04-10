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
 * @author Silvinha
 */
@Data
@Entity
@Table(name = "paquete")
public class Paquete implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaquete; // Transforma en id_reserva
    String titulo;
    String tipo;
    String imagen;
    String descripcion;
    String detalle;
    boolean activo;
    int precio;

    public Paquete() {
    }

    public Paquete(Long idPaquete, String titulo, String tipo, String imagen, String descripcion, String detalle, boolean activo, int precio) {
        this.idPaquete = idPaquete;
        this.titulo = titulo;
        this.tipo = tipo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.activo = activo;
        this.precio = precio;
    }
}
