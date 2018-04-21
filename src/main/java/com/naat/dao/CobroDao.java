package com.naat.dao;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.naat.dto.Cobro;


@Transactional
public interface CobroDao extends CrudRepository<Cobro, Long> {

}
