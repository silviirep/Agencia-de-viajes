
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
@Table(name = "vuelo")
public class Vuelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVuelo; // Transforma en id_reserva
    String titulo; //
    String imagen;//
    String descripcion;//
    boolean activo;//
    int precio;//
    int existencias;//
    String fechaSalida;//
    String fechaExpiracion;//

    public Vuelo() {
    }

    public Vuelo(Long idVuelo, String titulo, String imagen,String descripcion, boolean activo, int precio, int existencias, String fechaSalida, String fechaExpiracion) {
        this.idVuelo = idVuelo;
        this.titulo = titulo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.descripcion = descripcion;
        this.activo = activo;
        this.precio = precio;
        this.existencias = existencias;
        this.fechaSalida = fechaSalida;
        this.fechaExpiracion = fechaExpiracion;
    }    
}

