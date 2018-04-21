package com.naat.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.naat.dto.Jugo;

@Transactional
public interface JugoDao extends CrudRepository<Jugo, Long> {
	
	
	@Query(value="SELECT * FROM jugo", nativeQuery=true)
	public List<Jugo> verJugos();

}
