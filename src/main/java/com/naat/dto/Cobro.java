package com.naat.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cobro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
    Integer total;
    
    String token_paypal;
    
    Boolean completado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getToken_paypal() {
		return token_paypal;
	}

	public void setToken_paypal(String token_paypal) {
		this.token_paypal = token_paypal;
	}

	public Boolean getCompletado() {
		return completado;
	}

	public void setCompletado(Boolean completado) {
		this.completado = completado;
	}

}
