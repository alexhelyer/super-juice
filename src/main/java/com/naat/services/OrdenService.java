package com.naat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naat.dao.JugoDao;
import com.naat.dao.OrdenDao;
import com.naat.dto.Jugo;
import com.naat.dto.Orden;

@Service
public class OrdenService {
	
	@Autowired
	OrdenDao ordenDao;
	
	@Autowired
	JugoDao jugoDao;
	
	public Orden verOrden(Long id) {
		Optional<Orden> ordenOpt = ordenDao.findById(id);
		
		if(ordenOpt.isPresent()) {
			Orden orden = ordenOpt.get();
			return orden;
		}
		return null;
	}
	
	public Orden insertarJugo(Long id, Long idJugo) {
		Optional<Orden> ordenOpt = ordenDao.findById(id);
		Optional<Jugo> jugoOpt = jugoDao.findById(idJugo);
		
		List<Jugo> jugos = new ArrayList<>();
		
		if(ordenOpt.isPresent()) {
			Orden orden = ordenOpt.get();
			
			if(jugoOpt.isPresent()) {
				Jugo jugo = jugoOpt.get();
				jugos.add(jugo);
				
				orden.setJugos(jugos);
			}
			
			return orden;
		}
		
		return null;
	}

}
