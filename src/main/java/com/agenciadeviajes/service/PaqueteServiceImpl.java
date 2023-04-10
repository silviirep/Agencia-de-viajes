
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.PaqueteDao;
import com.agenciadeviajes.domain.Paquete;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service
public class PaqueteServiceImpl implements PaqueteService{
    @Autowired
    PaqueteDao paqueteDao;

    @Override
    public List<Paquete> getPaquetes() {
        return (List<Paquete>) paqueteDao.findAll();
    }

    @Override
    public Paquete getPaquete(Paquete paquete) {
        return paqueteDao.findById(paquete.getIdPaquete()).orElse(null);
    }

    @Override
    public void save(Paquete paquete) {
        paqueteDao.save(paquete);
    }

    @Override
    public void delete(Paquete paquete) {
        paqueteDao.deleteById(paquete.getIdPaquete());
    }
    
}
