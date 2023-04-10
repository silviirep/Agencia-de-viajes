
package com.agenciadeviajes.service;
import com.agenciadeviajes.domain.Usuario;
import java.util.List;

/**
 *
 * @author Silvinha
 */
public interface UsuarioService {
    public List<Usuario> getUsuarios(); 
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario); // Sirve para insertar y modificar un registro
    
    public void delete (Usuario usuario);
    
}
