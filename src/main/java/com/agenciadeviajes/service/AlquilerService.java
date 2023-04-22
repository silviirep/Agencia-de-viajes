/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.agenciadeviajes.service;

import com.agenciadeviajes.domain.Alquiler;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface AlquilerService {
     public List<Alquiler> getAlquilers(); 
    
    public Alquiler getAlquiler(Alquiler alquiler);
    
    public void save(Alquiler alquiler); // Sirve para insertar y modificar un registro
    
    public void delete (Alquiler alquiler);
}
