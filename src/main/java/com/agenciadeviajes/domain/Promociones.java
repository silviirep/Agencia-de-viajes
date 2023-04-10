
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
@Table(name = "promociones")
public class Promociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromocion; // Transforma en id_reserva
    String titulo; //
    double precio;//
    String tipo;
    String imagen;//
    String descripcion;//
    String detalle;//
    double total;
    int estado;

    public Promociones() {
    }

    public Promociones(Long idPromocion, String titulo, int precio,String tipo, String imagen, String descripcion, String detalle, double total, int estado) {
        this.idPromocion = idPromocion;
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.total = total;
        this.estado = estado;
        
    }    
}

