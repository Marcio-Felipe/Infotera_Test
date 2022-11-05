package com.teste.infotera.client;

import org.springframework.stereotype.Component;

@Component
public class UriClient {
	private static final String URI = "http://api.infotravel.com.br/api/v1";

	public static String getUri() {
		return URI;
	}
}
