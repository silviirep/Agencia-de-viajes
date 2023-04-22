/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Alquiler;
import com.agenciadeviajes.service.AlquilerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Fernando
 */
@Controller
@Slf4j
public class AlquilerController {
    @Autowired
    AlquilerService alquilerService;

    @GetMapping("/alquiler/alquilers")
    public String inicio(Model model) {
        var alquilers = alquilerService.getAlquilers();
        model.addAttribute("alquilers", alquilers);
        return "/alquiler/alquilers";
    }

    @GetMapping("/alquilers/nuevoAlquiler")
    public String nuevoAlquiler(Alquiler alquiler) {
        return "/alquiler/modificar";  // retorna nombre del  html
    }

    @PostMapping("/alquilers/guardar")
    public String guardarAlquiler(Alquiler alquiler) {
        alquilerService.save(alquiler);
        return "redirect:/alquiler/alquilers";
    }

    @GetMapping("/alquiler/modificar/{idAlquiler}")
    public String modificarAlquiler(Alquiler alquiler, Model model) {
        alquiler = alquilerService.getAlquiler(alquiler);
        model.addAttribute("alquiler", alquiler);
        return "/alquiler/modificar";
    }

    @GetMapping("/alquilers/eliminar/{idAlquiler}")
    public String eliminarAlquiler(Alquiler alquiler) {
        alquilerService.delete(alquiler);
        return "redirect:/alquiler/alquilers";
    }
}
