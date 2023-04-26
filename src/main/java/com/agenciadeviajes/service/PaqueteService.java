package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Paquete;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface PaqueteService {
    public List<Paquete> getPaquetes(); 
    
    public Paquete getPaquete(Paquete paquete);
    
//    public List<Paquete> getPaquete(boolean activos);
    
    public void save(Paquete paquete); // Sirve para insertar y modificar un registro
    
    public void delete (Paquete paquete);
    
}
