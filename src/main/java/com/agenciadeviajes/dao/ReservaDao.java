
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Reserva;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Silvinha
 */
public interface ReservaDao extends CrudRepository<Reserva, Long> {
    
}
