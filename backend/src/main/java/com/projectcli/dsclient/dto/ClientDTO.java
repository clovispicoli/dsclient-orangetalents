package com.projectcli.dsclient.dto;

import java.io.Serializable;
import java.time.Instant;

import com.projectcli.dsclient.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
 	private String name;
 	private String cpf;
 	private Instant birthDate;
 	
	public ClientDTO() {
	}


	public ClientDTO(Long id, String name, String cpf, Instant birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
	}


	public ClientDTO(Client entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.birthDate = entity.getBirthdate();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Instant getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
}
