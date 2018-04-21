package com.naat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naat.dao.RepartidorDao;
import com.naat.dto.Repartidor;

@Service
public class RepartidorService {
	
	@Autowired
	RepartidorDao repartidorDao;
	
	public Repartidor crearRepartidor(String nombre, String placas, String direccion) {
		Repartidor repartidor = new Repartidor();
		
		repartidor.setNombre(nombre);
		repartidor.setPlacas(placas);
		repartidor.setDireccion(direccion);
		
		repartidorDao.save(repartidor);
		
		return repartidor;
	}
	
	public Repartidor verRepartidor(String id) {
		return repartidorDao.buscarRepartidorPorId(id);
	}
	
	public List<Repartidor> verRepartidores() {
		return repartidorDao.verRepartidores();
	}

}
