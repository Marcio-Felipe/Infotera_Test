package com.teste.infotera.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste.infotera.DTO.ResultHotelDetailDTO;
import com.teste.infotera.client.HotelClient;

@RestController
@RequestMapping("/hotel")
public class HotelDetailController {
	@Autowired
	HotelClient hotelClient;

	@GetMapping("/{detail}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResultHotelDetailDTO detailHotel(@PathVariable("detail") String detail) {
		return hotelClient.getDetailHotel(detail);

	}
}
