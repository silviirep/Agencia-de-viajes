
package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Alquiler;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface AlquilerService {
     public List<Alquiler> getAlquileres(); 
    
    public Alquiler getAlquiler(Alquiler alquiler);
    
    public void save(Alquiler alquiler); // Sirve para insertar y modificar un registro
    
    public void delete (Alquiler alquiler);
}
