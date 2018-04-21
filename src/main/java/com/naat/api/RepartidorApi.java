package com.naat.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naat.dto.Repartidor;
import com.naat.services.RepartidorService;

@RestController
@RequestMapping("/repartidor")
public class RepartidorApi {
	
	@Autowired
	RepartidorService repartidorService;
	
	@RequestMapping(value="/crear")
	@ResponseBody
	public Repartidor crearRepartidor(@RequestParam String nombre, @RequestParam String placas,@RequestParam String direccion) {
		return repartidorService.crearRepartidor(nombre, placas, direccion);
	}
	
	@RequestMapping(value="/ver")
	@ResponseBody
	public Repartidor verRepartidor(@RequestParam String id) {
		return repartidorService.verRepartidor(id);
	}
	
	@RequestMapping(value="/repartidores")
	@ResponseBody
	public List<Repartidor> verRepartidores() {
		return repartidorService.verRepartidores();
	}

}
