package com.naat.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.naat.dto.Cliente;

@Transactional
public interface ClienteDao extends CrudRepository<Cliente, Long> {
	
	@Query(value="SELECT * FROM cliente WHERE id=:id", nativeQuery=true)
	public Cliente buscarClientePorId(@Param("id") String id);
	
	@Query(value="SELECT * FROM cliente", nativeQuery=true)
	public List<Cliente> verClientes();
	
}
