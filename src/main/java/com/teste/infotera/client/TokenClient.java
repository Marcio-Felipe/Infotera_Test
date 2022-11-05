package com.teste.infotera.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.teste.infotera.DTO.TokenDTO;
import com.teste.infotera.input.InputToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class TokenClient {
	public static final String RESOURCE_PATH = "/authenticate";
	@Autowired
	InputToken inputToken;
	@Autowired
	UriClient uri;

	public TokenDTO getAcessToken() {
		URI resourceUri = URI.create(UriClient.getUri() + RESOURCE_PATH);
		RestTemplate restTemplate = new RestTemplate();
		TokenDTO token = restTemplate.postForObject(resourceUri, inputToken, TokenDTO.class);
		return token;

	}
}