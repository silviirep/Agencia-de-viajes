package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Reserva;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface ReservaService {
    public List<Reserva> getReservas(); 
    
    public Reserva getReserva(Reserva reserva);
    
    public void save(Reserva reserva); // Sirve para insertar y modificar un registro
    
    public void delete (Reserva reserva);
    
}
