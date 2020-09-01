package com.aipl.springbootcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aipl.springbootcrud.service.ParsingService;
@Service
public class JsonParsingServiceImpl implements ParsingService {

	@Override
	public Object parse(String url) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(url, Object.class);
	}

	@Autowired
	private RestTemplate restTemplate;

}
