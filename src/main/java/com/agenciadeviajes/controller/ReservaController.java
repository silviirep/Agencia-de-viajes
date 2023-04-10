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
@Controller
@Slf4j
public class ReservaController {

    @Autowired
    ReservaService reservaService;

    @GetMapping("/reserva/reservas")
    public String inicio(Model model) {
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        return "/reserva/reservas";
    }

    @GetMapping("/reserva/nuevaReserva")
    public String nuevoReserva(Reserva reserva) {
        return "/reserva/modificar";  // retorna nombre del  html
    }

    @PostMapping("/reserva/guardarReserva")
    public String guardarReserva(Reserva reserva) {
        reservaService.save(reserva);
        return "redirect:/reserva/reservas";
    }

    @GetMapping("/reserva/modificarReserva/{idReserva}")
    public String modificarReserva(Reserva reserva, Model model) {
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "/reserva/modificar";
    }

    @GetMapping("/reserva/eliminarReserva/{idReserva}")
    public String eliminarReserva(Reserva reserva) {
        reservaService.delete(reserva);
        return "redirect:/reserva/reservas";
    }

}
