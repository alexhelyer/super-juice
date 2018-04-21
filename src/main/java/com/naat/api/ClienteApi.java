package com.naat.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naat.dto.Cliente;
import com.naat.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteApi {
	
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value="/crear")
	@ResponseBody
	public Cliente crearCliente(@RequestParam String nombre, @RequestParam String direccion) {
		return clienteService.crearCliente(nombre, direccion);
	}
	
	@RequestMapping(value="/actualizar")
	@ResponseBody
	public Cliente actualizarCliente(@RequestParam Long id, @RequestParam String nombre, @RequestParam String direccion) {
		return clienteService.actualizarCliente(id, nombre, direccion);
	}
	
	@RequestMapping(value="/borrar")
	@ResponseBody
	public boolean borrarCliente(@RequestParam Long id) {
		return clienteService.borrarCliente(id);
	}
	
	@RequestMapping(value="/ver")
	@ResponseBody
	public Cliente verCliente(@RequestParam String id) {
		return clienteService.verCliente(id);
	}
	
	@RequestMapping(value="/clientes")
	@ResponseBody
	public List<Cliente> verClientes() {
		return clienteService.verClientes();
	}

}
