
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Silvinha
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}

