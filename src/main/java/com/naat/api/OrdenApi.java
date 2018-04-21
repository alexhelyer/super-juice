package com.naat.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naat.dto.Orden;
import com.naat.services.OrdenService;

@RestController
@RequestMapping("/orden")
public class OrdenApi {
	
	@Autowired
	OrdenService ordenService;
	
	
	@RequestMapping(value="/ver")
	@ResponseBody
	public Orden verOrdenes(@RequestParam Long id) {
		return ordenService.verOrden(id);
	}
	
	@RequestMapping(value="/{id}/jugo/{idJugo}")
	@ResponseBody
	public Orden insertarJugos(@PathVariable(name="id") Long id, @PathVariable(name="idJugo") Long idJugo) {
		return ordenService.insertarJugo(id, idJugo);
	}

}
