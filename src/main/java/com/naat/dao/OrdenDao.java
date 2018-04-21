package com.naat.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.naat.dto.Orden;

@Transactional
public interface OrdenDao extends CrudRepository<Orden, Long> {
}
