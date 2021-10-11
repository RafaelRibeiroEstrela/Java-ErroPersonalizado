package com.example.erropersonalizado.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.erropersonalizado.service.ErroPersonalizadoService;

@RestController
@RequestMapping(value = "/erros")
public class ErroPersonalizadoResource {
	
	@Autowired
	private ErroPersonalizadoService service;
	
	@GetMapping
	public ResponseEntity<Void> verifica(@RequestParam Integer num){
		service.verifica(num);
		return ResponseEntity.noContent().build();
	}

}
