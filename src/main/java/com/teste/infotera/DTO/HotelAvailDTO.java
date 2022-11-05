package com.teste.infotera.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelAvailDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HotelSearchDTO hotel;
	@JsonIgnore
	private String provider;
	private LowestFareDTO lowestFare;

}
