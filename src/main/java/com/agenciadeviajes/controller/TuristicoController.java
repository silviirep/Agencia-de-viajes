/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciadeviajes.controller;

import com.agenciadeviajes.domain.Turistico;
import com.agenciadeviajes.service.TuristicoService;
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
public class TuristicoController {
    @Autowired
    TuristicoService turisticoService;

    @GetMapping("/turistico/turisticos")
    public String inicio(Model model) {
        var turisticos = turisticoService.getTuristicos();
        model.addAttribute("turisticos", turisticos);
        return "/turistico/turisticos";
    }

    @GetMapping("/turisticos/nuevoTuristico")
    public String nuevoTuristico(Turistico turistico) {
        return "/turistico/modificar";  // retorna nombre del  html
    }

    @PostMapping("/turisticos/guardar")
    public String guardarTuristico(Turistico turistico) {
        turisticoService.save(turistico);
        return "redirect:/turistico/turisticos";
    }

    @GetMapping("/turistico/modificar/{idTuristico}")
    public String modificarTuristico(Turistico turistico, Model model) {
        turistico = turisticoService.getTuristico(turistico);
        model.addAttribute("turistico", turistico);
        return "/turistico/modificar";
    }

    @GetMapping("/turisticos/eliminar/{idTuristico}")
    public String eliminarTuristico(Turistico turistico) {
        turisticoService.delete(turistico);
        return "redirect:/turistico/turisticos";
    }
}
