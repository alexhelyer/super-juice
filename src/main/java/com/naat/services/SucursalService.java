package com.naat.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naat.dao.ClienteDao;
import com.naat.dao.EstatusDao;
import com.naat.dao.OrdenDao;
import com.naat.dao.SucursalDao;
import com.naat.dto.Cliente;
import com.naat.dto.Estatus;
import com.naat.dto.Orden;
import com.naat.dto.Sucursal;

@Service
public class SucursalService {
	
	@Autowired
	SucursalDao sucursalDao;
	
	@Autowired
	OrdenDao ordenDao;
	
	@Autowired
	ClienteDao clienteDao;
	
	@Autowired
	EstatusDao estatusDao;
	
	public Sucursal crearSucursal(String nombre, String direccion) {
		Sucursal sucursal = new Sucursal();
		sucursal.setNombre(nombre);
		sucursal.setDireccion(direccion);
		
		sucursalDao.save(sucursal);
		
		return sucursal;
	}
	
	public Sucursal verSucursal(String id) {
		return sucursalDao.buscarSucursalPorId(id);
	}
	
	public List<Sucursal> verSucursales() {
		return sucursalDao.verSucursales();
	}
	
	public Orden pedir(Long idCliente) {
		Orden orden = new Orden();
		Cliente cliente = new Cliente();
		Sucursal sucursal = sucursalDao.getAleatorio();
		Estatus estatus = new Estatus();
		
		Optional<Cliente> clienteOpt = clienteDao.findById(idCliente);
		if(clienteOpt.isPresent())
			cliente = clienteOpt.get();
		
		Optional<Estatus> estatusOpt = estatusDao.findById(1l);
		if(estatusOpt.isPresent())
			estatus = estatusOpt.get();
		
		orden.setCliente(cliente);
		orden.setSucursal(sucursal);
		orden.setEstatus(estatus);
		
		ordenDao.save(orden);
		
		return orden;
	}

}
