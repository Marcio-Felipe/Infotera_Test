package com.teste.infotera.DTO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CordinatesDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Double latitude;

	private Double longitude;

}
