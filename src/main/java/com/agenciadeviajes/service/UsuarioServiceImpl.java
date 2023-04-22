package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.UsuarioDao;
import com.agenciadeviajes.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Silvinha
 */
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);

    }

    @Override
    @Transactional(readOnly = true)
    public void save(Usuario usuario) {
//        Usuario usuario = usuario.;
//        credito = creditoDao.save(credito);
//        clienteDao.save(cliente);
//
//        cliente.setCredito(credito);
        usuarioDao.save(usuario);

    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.deleteById(usuario.getIdUsuario());
    }

}
