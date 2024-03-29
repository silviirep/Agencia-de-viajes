
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

    @GetMapping("/alquiler/alquileres")
    public String inicio(Model model) {
        var alquileres = alquilerService.getAlquileres();
        model.addAttribute("alquileres", alquileres);
        return "/alquiler/alquileres";
    }

    @GetMapping("/alquileres/nuevoAlquiler")
    public String nuevoAlquiler(Alquiler alquiler) {
        return "/alquiler/modificar";  // retorna nombre del  html
    }

    @PostMapping("/alquileres/guardar")
    public String guardarAlquiler(Alquiler alquiler) {
        alquilerService.save(alquiler);
        return "redirect:/alquiler/alquileres";
    }

    @GetMapping("/alquiler/modificar/{idAlquiler}")
    public String modificarAlquiler(Alquiler alquiler, Model model) {
        alquiler = alquilerService.getAlquiler(alquiler);
        model.addAttribute("alquiler", alquiler);
        return "/alquiler/modificar";
    }

    @GetMapping("/alquileres/eliminar/{idAlquiler}")
    public String eliminarAlquiler(Alquiler alquiler) {
        alquilerService.delete(alquiler);
        return "redirect:/alquiler/alquileres";
    }
}
