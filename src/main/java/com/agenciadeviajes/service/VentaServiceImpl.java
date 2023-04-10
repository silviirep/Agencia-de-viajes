
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.VentaDao;
import com.agenciadeviajes.domain.Venta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service
public class VentaServiceImpl implements VentaService{
    @Autowired
    VentaDao ventaDao;

    @Override
    public List<Venta> getVentas() {
        return (List<Venta>)ventaDao.findAll();
    }

    @Override
    public Venta getVenta(Venta venta) {
        return ventaDao.findById(venta.getIdVenta()).orElse(null);
    }

    @Override
    public void save(Venta venta) {
        ventaDao.save(venta);
    }

    @Override
    public void delete(Venta venta) {
        ventaDao.deleteById(venta.getIdVenta());
    }
    
}
