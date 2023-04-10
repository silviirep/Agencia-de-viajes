package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Promociones;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface PromocionesService {
    public List<Promociones> getPromociones(); 
    
    public Promociones getPromociones(Promociones promociones);
    
    public void save(Promociones promociones); // Sirve para insertar y modificar un registro
    
    public void delete (Promociones promociones);
    
}
