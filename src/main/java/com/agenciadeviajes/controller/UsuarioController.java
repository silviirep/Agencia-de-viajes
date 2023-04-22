package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Usuario;
import com.agenciadeviajes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

@Autowired
UsuarioService usuarioService;

    @GetMapping("/login/crearUsuario")
    public String nuevoCliente(Usuario usuario) {
        return "/";  // retorna nombre del  html
    }



    
}
