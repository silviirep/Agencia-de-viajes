
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.VueloDao;
import com.agenciadeviajes.domain.Vuelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service
public class VueloServiceImpl implements VueloService{
    @Autowired
    VueloDao vueloDao;

    @Override
    public List<Vuelo> getVuelos() {
        return (List<Vuelo>) vueloDao.findAll();
    }

    @Override
    public Vuelo getVuelo(Vuelo vuelo) {
        return vueloDao.findById(vuelo.getIdVuelo()).orElse(null);
    }

    @Override
    public void save(Vuelo vuelo) {
        vueloDao.save(vuelo);
    }

    @Override
    public void delete(Vuelo vuelo) {
        vueloDao.deleteById(vuelo.getIdVuelo());
    }
    
}
