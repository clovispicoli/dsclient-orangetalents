package com.projectcli.dsclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectcli.dsclient.entities.Client;
import com.projectcli.dsclient.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	@GetMapping
	private ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
