package com.naat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naat.dao.JugoDao;
import com.naat.dto.Jugo;

@Service
public class JugoService {
	
	@Autowired
	JugoDao jugoDao;
	
	public List<Jugo> verJugos() {
		return jugoDao.verJugos();
	}

}
