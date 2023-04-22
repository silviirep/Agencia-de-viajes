/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Turistico;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface TuristicoService {
    public List<Turistico> getTuristicos(); 
    
    public Turistico getTuristico(Turistico turistico);
    
    public void save(Turistico turistico); // Sirve para insertar y modificar un registro
    
    public void delete (Turistico turistico);
}
