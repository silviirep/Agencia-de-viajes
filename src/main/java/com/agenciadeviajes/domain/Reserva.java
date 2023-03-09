
package com.agenciadeviajes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Silvinha
 */
@Data
@Entity
@Table(name = "Reserva")
public class Reserva {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva; // Transforma en id_reserva
    String nombreCliente;
    String destino;
    String fecha;
    int precio;
    int cantidadPersonas; 

    public Reserva() {
    }

    public Reserva(Long idReserva, String nombreCliente, String destino, String fecha, int precio, int cantidadPersonas) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
    }   
    
}
