package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String greeting()
	{
		return "yes,New rest API is working";
	}
	
	 @GetMapping("/consume")
	    public String consumeRest() {
	        String url="https://gorest.co.in/public/v2/users";
	        HttpHeaders httpHeaders=new HttpHeaders();
	        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        HttpEntity<String> entity=new HttpEntity<String>(httpHeaders);
	        //https://gorest.co.in/public/v2/users
	        return restTemplate.getForEntity(url, String.class).getBody();
	    }
}
