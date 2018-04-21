package com.naat.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.naat.dto.Sucursal;


@Transactional
public interface SucursalDao extends CrudRepository<Sucursal, Long> {
	
	@Query(value="SELECT * FROM sucursal WHERE id=:id", nativeQuery=true)
	public Sucursal buscarSucursalPorId(@Param("id") String id);
	
	@Query(value="SELECT * FROM sucursal", nativeQuery=true)
	public List<Sucursal> verSucursales();
	
	@Query(value="SELECT * FROM sucursal ORDER BY RAND() LIMIT 1", nativeQuery=true)
	public Sucursal getAleatorio();

}
