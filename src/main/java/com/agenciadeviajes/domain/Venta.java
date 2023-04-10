
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
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta; 
    private Long idPaquete; 
    private Long idVuelo; 
    private Long idPromocion; 
    
    double monto;
    int cantidad;

    public Venta() {
    }

    public Venta(Long idVenta, double monto, int cantidad) {
        this.idVenta = idVenta;
        this.monto = monto;
        this.cantidad = cantidad;
    }
}
