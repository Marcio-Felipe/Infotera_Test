package com.teste.infotera.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LowestFareDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	private RoomTypeDTO roomType;
	@JsonIgnore
	private List<FaresDTO> fares;
	@JsonIgnore
	private List<BoardTypesDTO> boardTypes;
	@JsonIgnore
	private CancellationPoliciesDTO cancellationPolicies;
	private LocalDate checkIn;
	private LocalDate checkOut;
}
