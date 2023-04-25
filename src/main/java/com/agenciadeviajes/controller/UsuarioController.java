package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Usuario;
import com.agenciadeviajes.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class UsuarioController {

@Autowired
UsuarioService usuarioService;

    @GetMapping("/login/crearUsuario")
    public String nuevoCliente(Usuario usuario) {
        return "/login/crearUsuario";  // retorna nombre del  html
    }
    
   @GetMapping("/login/inicioSesion")
    public String inicio(Model model) {
        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "login/inicioSesion";
    }



    
}
