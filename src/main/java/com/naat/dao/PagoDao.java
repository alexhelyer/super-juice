package com.naat.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.naat.dto.Pago;

@Transactional
public interface PagoDao extends CrudRepository<Pago, Long> {

}
