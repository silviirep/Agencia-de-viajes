
package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Vuelo;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface VueloService {
    public List<Vuelo> getVuelos(); 
    
    public Vuelo getVuelo(Vuelo vuelo);
    
    public void save(Vuelo vuelo); // Sirve para insertar y modificar un registro
    
    public void delete (Vuelo vuelo);
    
}
