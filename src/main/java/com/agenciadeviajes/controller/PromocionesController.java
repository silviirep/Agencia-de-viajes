package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Promociones;
import com.agenciadeviajes.service.PromocionesService;
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
public class PromocionesController {

    @Autowired
    PromocionesService promocionesService;

    @GetMapping("/promociones/promocion")
    public String inicio(Model model) {
        var promociones = promocionesService.getPromociones();
        model.addAttribute("promociones", promociones);
        return "/promociones/promocion";
    }

    @GetMapping("/promociones/nueva")
    public String nuevoPromociones(Promociones promociones) {
        return "/promociones/modificar";  // retorna nombre del  html
    }

    @PostMapping("/promociones/guardar")
    public String guardarPromociones(Promociones promociones) {
        promocionesService.save(promociones);
        return "redirect:/promociones/promocion";
    }

    @GetMapping("/promociones/modificar/{idPromocion}")
    public String modificarPromociones(Promociones promociones, Model model) {
        promociones = promocionesService.getPromociones(promociones);
        model.addAttribute("promociones", promociones);
        return "/promociones/modificar";
    }

    @GetMapping("/promociones/eliminar/{idPromociones}")
    public String eliminarPromociones(Promociones promociones) {
        promocionesService.delete(promociones);
        return "redirect:/promociones/promocion";
    }

}
