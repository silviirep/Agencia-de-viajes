
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Venta;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Silvinha
 */
public interface VentaDao extends CrudRepository<Venta, Long> {
    
}

