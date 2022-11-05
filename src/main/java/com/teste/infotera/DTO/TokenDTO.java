package com.teste.infotera.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDTO {
	private String accessToken;
	@JsonIgnore
	private String type;
	@JsonIgnore
	private Long expireSeconds;
}
