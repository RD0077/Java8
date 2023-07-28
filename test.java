package com.example.creditCardEx.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.creditCardEx.entity.Data;
import com.example.creditCardEx.entity.Root;

@RestController
@RequestMapping("/api/v1")
public class CreditCardController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@PostMapping("/getcards")
	public List<Data> getCards(@RequestParam("expiration") String expiration ){
		Predicate<String> predicate= date->{
			Boolean flag=false;
			SimpleDateFormat sdf= new SimpleDateFormat("MM/yy");
			try {
				Date d1=sdf.parse(date);
				Date d2Date=sdf.parse(expiration);
				int result=d1.compareTo(d2Date);
				if(result>0)
					flag=true;
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return flag;
		};
		
		System.out.println("asdafkjf");
		   Root response = restTemplate.getForObject("https://fakerapi.it/api/v1/credit_cards?_quantity=30", Root.class);
		   ArrayList<Data> creditData=response.getData();
		   List<Data> data= creditData.stream().filter(a-> predicate.test(a.getExpiration())).collect(Collectors.toList());
		   return data;
		   

		
	}
	
	

}
