package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class ConsumeMyRestService {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		Movie mov = rt.getForObject("http://localhost:8090/getdataobjectofmovie/3425", Movie.class);
		System.out.println(mov.getPrimaryTitle());

	}

}
