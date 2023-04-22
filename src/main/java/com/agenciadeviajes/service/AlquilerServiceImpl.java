/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.AlquilerDao;
import com.agenciadeviajes.domain.Alquiler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class AlquilerServiceImpl implements AlquilerService{
    @Autowired
    AlquilerDao alquilerDao;

    @Override
    public List<Alquiler> getAlquilers() {
        return (List<Alquiler>) alquilerDao.findAll();
    }

    @Override
    public Alquiler getAlquiler(Alquiler alquiler) {
        return alquilerDao.findById(alquiler.getIdAlquiler()).orElse(null);
    }

    @Override
    public void save(Alquiler alquiler) {
        alquilerDao.save(alquiler);
    }

    @Override
    public void delete(Alquiler alquiler) {
        alquilerDao.deleteById(alquiler.getIdAlquiler());
    }
}
