package com.projectcli.dsclient.dto;

import java.io.Serializable;
import java.time.Instant;

import com.projectcli.dsclient.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
 	private String name;
 	private String cpf;
 	private String email;
 	private Instant birthDate;
 	
	public ClientDTO() {
	}


	public ClientDTO(Long id, String name, String cpf, String email, Instant birthDate) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.birthDate = birthDate;
	}


	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.email = entity.getEmail();
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
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Instant getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
}
