package com.naat.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.naat.dto.Repartidor;

@Transactional
public interface RepartidorDao extends CrudRepository<Repartidor, Long> {
	
	@Query(value="SELECT * FROM repartidor WHERE id=:id", nativeQuery=true)
	public Repartidor buscarRepartidorPorId(@Param("id") String id);
		
	@Query(value="SELECT * FROM repartidor", nativeQuery=true)
	public List<Repartidor> verRepartidores();

}
