package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Paquete;
import com.agenciadeviajes.service.PaqueteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Silvinha
 */
@Controller
@Slf4j
public class PaqueteController {

    @Autowired
    PaqueteService paqueteService;

    @GetMapping("/paquete/paquetes")
    public String inicio(Model model) {
        var paquetes = paqueteService.getPaquetes();
        model.addAttribute("paquetes", paquetes);
        return "/paquete/paquetes";
    }

    @GetMapping("/paquetes/nuevoPaquete")
    public String nuevoPaquete(Paquete paquete) {
        return "/paquete/modificar";  // retorna nombre del  html
    }

    @PostMapping("/paquetes/guardar")
    public String guardarPaquete(Paquete paquete) {
        paqueteService.save(paquete);
        return "redirect:/paquete/paquetes";
    }

    @GetMapping("/paquete/modificar/{idPaquete}")
    public String modificarPaquete(Paquete paquete, Model model) {
        paquete = paqueteService.getPaquete(paquete);
        model.addAttribute("paquete", paquete);
        return "/paquete/modificar";
    }

    @GetMapping("/paquetes/eliminar/{idPaquete}")
    public String eliminarPaquete(Paquete paquete) {
        paqueteService.delete(paquete);
        return "redirect:/paquete/paquetes";
    }

}
