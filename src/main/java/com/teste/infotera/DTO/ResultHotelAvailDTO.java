package com.teste.infotera.DTO;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultHotelAvailDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<HotelAvailDTO> hotelAvail;
}
