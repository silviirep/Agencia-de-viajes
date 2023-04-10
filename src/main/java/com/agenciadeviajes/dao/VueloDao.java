
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Vuelo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Silvinha
 */
public interface VueloDao extends CrudRepository<Vuelo, Long> {
    
}

