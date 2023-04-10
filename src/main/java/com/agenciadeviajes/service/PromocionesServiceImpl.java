
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.PromocionesDao;
import com.agenciadeviajes.domain.Promociones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service
public class PromocionesServiceImpl implements PromocionesService{
    @Autowired
    PromocionesDao promocionesDao;

    @Override
    public List<Promociones> getPromociones() {
        return (List<Promociones>)promocionesDao.findAll();
    }

    @Override
    public Promociones getPromociones(Promociones promociones) {
        return promocionesDao.findById(promociones.getIdPromocion()).orElse(null);
    }

    @Override
    public void save(Promociones promociones) {
        promocionesDao.save(promociones);
    }

    @Override
    public void delete(Promociones promociones) {
        promocionesDao.deleteById(promociones.getIdPromocion());
    }
    
}

