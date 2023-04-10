
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
@Table(name = "pago")
public class Pago implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago; // Transforma en id_reserva
    double limite;

    public Pago() {
    }

    public Pago(Long idPago, double limite) {
        this.idPago = idPago;
        this.limite = limite;
    }   
    
}
