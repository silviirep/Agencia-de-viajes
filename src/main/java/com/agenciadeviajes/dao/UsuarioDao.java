
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}

