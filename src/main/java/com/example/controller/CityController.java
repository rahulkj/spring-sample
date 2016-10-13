package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.City;
import com.example.repository.CityRepository;

import jersey.repackaged.com.google.common.collect.Lists;

@RestController("/city")
public class CityController {

	@Autowired
	CityRepository cityRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<City> getCities() {
		
		List<City> cities = new ArrayList<>();
		cities = Lists.newArrayList(cityRepository.findAll());
		return cities;
	}

}
