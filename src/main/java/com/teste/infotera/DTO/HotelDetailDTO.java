package com.teste.infotera.DTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDetailDTO implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private AddressDTO address;

	private List<ImagesDTO> images;
	@JsonIgnore
	private List<AttributesDTO> attributes;
	

}
