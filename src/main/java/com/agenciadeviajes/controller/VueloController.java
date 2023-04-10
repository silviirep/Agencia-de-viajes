
package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Vuelo;
import com.agenciadeviajes.service.VueloService;
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
public class VueloController {
    
     @Autowired
    VueloService vueloService;

    @GetMapping("/vuelo/vuelos")
    public String inicio(Model model) {
        var vuelos = vueloService.getVuelos();
        model.addAttribute("vuelos", vuelos);
        return "/vuelo/vuelos";
    }

    @GetMapping("/vuelo/nueva")
    public String nuevoVuelo(Vuelo vuelo) {
        return "/vuelo/modificar";  // retorna nombre del  html
    }

    @PostMapping("/vuelo/guardar")
    public String guardarVuelo(Vuelo vuelo) {
        vueloService.save(vuelo);
        return "redirect:/vuelo/vuelos";
    }

    @GetMapping("/vuelo/modificar/{idVuelo}")
    public String modificarVuelo(Vuelo vuelo, Model model) {
        vuelo = vueloService.getVuelo(vuelo);
        model.addAttribute("vuelo", vuelo);
        return "/vuelo/modificar";
    }

    @GetMapping("/vuelo/eliminar/{idVuelo}")
    public String eliminarVuelo(Vuelo vuelo) {
        vueloService.delete(vuelo);
        return "redirect:/vuelo/vuelos";
    }
    
}
