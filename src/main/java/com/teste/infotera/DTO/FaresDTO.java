package com.teste.infotera.DTO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FaresDTO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private PriceDTO price;
	private PriceNetDTO priceNet;
}
