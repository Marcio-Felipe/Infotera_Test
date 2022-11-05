package com.teste.infotera.input;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class InputToken {
	private final String USERNAME = "sandboxws";
	private final String PASSWORD = "!sdb2022#";
	private final String CLIENT = "SANDBOX";
	private final String AGENCY = "2";

}
