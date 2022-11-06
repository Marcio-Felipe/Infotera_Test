package com.teste.infotera.client;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.teste.infotera.DTO.ResultHotelAvailDTO;
import com.teste.infotera.DTO.ResultHotelDetailDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class HotelClient {

	@Autowired
	TokenClient tokenCLient;
	


	public ResultHotelAvailDTO getHotels(Long destination, String start, String end, Long occupancy) {
		LocalDate str = LocalDate.parse(start);
		LocalDate en = LocalDate.parse(end);
		String resourcePath = "/avail/hotel?destination=" + destination + "" + "&start=" + str + "&end=" + en
				+ "&occupancy=" + occupancy + "";

		RestTemplate restTemplate = new RestTemplate();
		String url = UriClient.getUri() + resourcePath;
		ResponseEntity<ResultHotelAvailDTO> response = restTemplate.exchange(url, HttpMethod.GET, requestHeader(), ResultHotelAvailDTO.class);
		ResultHotelAvailDTO hoteilAvail = response.getBody();

		return hoteilAvail;

	}

	public ResultHotelDetailDTO getDetailHotel(String keyDetail) {
		String resourcePath = "/utility/hotelDetail/" + keyDetail + "";
		RestTemplate restTemplate = new RestTemplate();
		String url = UriClient.getUri()  + resourcePath;
		ResponseEntity<ResultHotelDetailDTO> response = restTemplate.exchange(url, HttpMethod.GET, requestHeader(),
				ResultHotelDetailDTO.class);
		ResultHotelDetailDTO hotel = response.getBody();
		System.out.println(hotel.getHotel().getName());
		return hotel;

	}

	public HttpEntity<String> requestHeader() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Authorization", "Bearer " + tokenCLient.getAcessToken().getAccessToken());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		return request;
	}

}
