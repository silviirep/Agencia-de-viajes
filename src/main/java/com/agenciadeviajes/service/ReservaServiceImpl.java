
package com.agenciadeviajes.service;

import com.agenciadeviajes.dao.ReservaDao;
import com.agenciadeviajes.domain.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service
public class ReservaServiceImpl implements ReservaService{
    @Autowired
    ReservaDao reservaDao;

    @Override
    public List<Reserva> getReservas() {
        return (List<Reserva>) reservaDao.findAll();
    }

    @Override
    public Reserva getReserva(Reserva reserva) {
        return reservaDao.findById(reserva.getIdReserva()).orElse(null);
    }

    @Override
    public void save(Reserva reserva) {
        reservaDao.save(reserva);
    }

    @Override
    public void delete(Reserva reserva) {
        reservaDao.deleteById(reserva.getIdReserva());
    }
    
}
