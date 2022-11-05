package com.teste.infotera.DTO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String address;

	private CityCountryCodeDTO city;
	private CordinatesDTO coordinates;

}
