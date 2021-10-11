package com.example.erropersonalizado.service;

import org.springframework.stereotype.Service;

import com.example.erropersonalizado.service.exception.ErroPersonalizado;

@Service
public class ErroPersonalizadoService {
	
	public void verifica(Integer num) {
		if (num == 0) {
			throw new ErroPersonalizado("O numero deve ser diferente de zero");
		}
	}

}
