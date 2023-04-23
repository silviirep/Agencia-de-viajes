package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Reserva;
import com.agenciadeviajes.service.ReservaService;
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
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ReservaService reservaService;

    @GetMapping("/")
    public String inicio (Model model) {
        log.info("Ahora utilizando MVC");
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        return "index";
    }

    @GetMapping("/reserva/nuevaReserva")
    public String nuevoEstado(Reserva reserva) {
        return "modificarReserva";  // retorna nombre del  html
    }

    @PostMapping("/reserva/guardarEstado")
    public String guardarEstado(Reserva reserva) {
        reservaService.save(reserva);
        return "redirect:/";
    }

    @GetMapping("/reserva/modificarReserva/{idReserva}")
    public String modificarReserva(Reserva reserva, Model model) {
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "modificarReserva";
    }

    @GetMapping("/reserva/eliminarReserva/{idReserva}")
    public String eliminarReserva(Reserva reserva) {
        reservaService.delete(reserva);
        return "redirect:/";
    }
    
}
