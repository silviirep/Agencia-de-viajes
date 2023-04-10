/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.agenciadeviajes.dao;

import com.agenciadeviajes.domain.Promociones;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Silvinha
 */
public interface PromocionesDao extends CrudRepository<Promociones, Long> {
    
}
