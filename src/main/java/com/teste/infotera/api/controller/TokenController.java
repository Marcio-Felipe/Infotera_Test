package com.teste.infotera.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.infotera.DTO.TokenDTO;
import com.teste.infotera.client.TokenClient;

@RestController
@RequestMapping("/token")
public class TokenController {

	@Autowired
	TokenClient tokenClient;

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public TokenDTO Token() {
		return tokenClient.getAcessToken();

	}

}
