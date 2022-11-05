package com.teste.infotera.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.infotera.DTO.ResultHotelAvailDTO;
import com.teste.infotera.client.HotelClient;

@RestController
@RequestMapping("/search")
public class HotelController {

	@Autowired
	HotelClient hotelClient;

	@GetMapping("/{destination}/{start}/{end}/{occupancy}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResultHotelAvailDTO hotelList(@PathVariable("destination") Long destination, @PathVariable("start") String start,
			@PathVariable("end") String end, @PathVariable("occupancy") Long occupancy) {
		return hotelClient.getHotels(destination, start, end, occupancy);

	}

}
