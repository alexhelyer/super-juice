package com.naat.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naat.dto.Jugo;
import com.naat.services.JugoService;

@RestController
@RequestMapping("/jugo")
public class JugoApi {
	
	@Autowired
	JugoService jugoService;
	
	@RequestMapping(value="/jugos")
	@ResponseBody
	public List<Jugo> verJugos() {
		return jugoService.verJugos();
	}

}
