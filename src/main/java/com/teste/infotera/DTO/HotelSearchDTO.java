package com.teste.infotera.DTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelSearchDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String keyDetail;
	private String name;
	@JsonIgnore
	private AddressForAvailHotelDTO address;
	@JsonIgnore
	private Double stars;
	@JsonIgnore
	private List<ImagesDTO> images;

}
