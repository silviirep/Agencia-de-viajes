/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.TuristicoDao;
import com.agenciadeviajes.domain.Turistico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class TuristicoServiceImpl implements TuristicoService{
    @Autowired
    TuristicoDao turisticoDao;

    @Override
    public List<Turistico> getTuristicos() {
        return (List<Turistico>) turisticoDao.findAll();
    }

    @Override
    public Turistico getTuristico(Turistico turistico) {
        return turisticoDao.findById(turistico.getIdTuristico()).orElse(null);
    }

    @Override
    public void save(Turistico turistico) {
        turisticoDao.save(turistico);
    }

    @Override
    public void delete(Turistico turistico) {
        turisticoDao.deleteById(turistico.getIdTuristico());
    }
}
