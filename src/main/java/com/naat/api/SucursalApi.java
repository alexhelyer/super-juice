package com.naat.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naat.dto.Orden;
import com.naat.dto.Sucursal;
import com.naat.services.SucursalService;

@RestController
@RequestMapping("/sucursal")
public class SucursalApi {
	
	@Autowired
	SucursalService sucursalService;
	
	
	@RequestMapping(value="/crear")
	@ResponseBody
	public Sucursal crearSucursal(@RequestParam String nombre, @RequestParam String direccion) {
		return sucursalService.crearSucursal(nombre, direccion);
	}
	
	@RequestMapping(value="/ver")
	@ResponseBody
	public Sucursal verSucursal(@RequestParam String id) {
		return sucursalService.verSucursal(id);
	}
	
	@RequestMapping(value="/sucursales")
	@ResponseBody
	public List<Sucursal> verSucursales() {
		return sucursalService.verSucursales();
	}
	
	@RequestMapping(value="/pedir")
	@ResponseBody
	public Orden pedir(@RequestParam Long idCliente) {
		return sucursalService.pedir(idCliente);
	}
	
}
