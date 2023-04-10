
package com.agenciadeviajes.service;
import com.agenciadeviajes.domain.Venta;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface VentaService {
    public List<Venta> getVentas(); 
    
    public Venta getVenta(Venta venta);
    
    public void save(Venta venta); // Sirve para insertar y modificar un registro
    
    public void delete (Venta venta);
    
}
