package com.naat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naat.dao.ClienteDao;
import com.naat.dto.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDao clienteDao;
	
	public Cliente crearCliente(String nombre, String direccion) {
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setDireccion(direccion);
		
		clienteDao.save(cliente);
		
		return cliente;
	}
	
	public Cliente actualizarCliente(Long id, String nombre, String direccion) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNombre(nombre);
		cliente.setDireccion(direccion);
		
		clienteDao.save(cliente);
		
		return cliente;
	}
	
	public boolean borrarCliente(Long id) {
		
		boolean state = clienteDao.existsById(id);
		
		if(state)
			clienteDao.deleteById(id);
		
		return state;
	}
	
	public Cliente verCliente(String idCliente) {
		return clienteDao.buscarClientePorId(idCliente);
	}
	
	public List<Cliente> verClientes() {
		return clienteDao.verClientes();
	}
	
}
