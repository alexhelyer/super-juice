package com.naat.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.naat.dto.Estatus;

@Transactional
public interface EstatusDao extends CrudRepository<Estatus, Long> {

}
