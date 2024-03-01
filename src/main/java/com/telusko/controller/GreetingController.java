package com.telusko.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.service.IGreetingService;

@Controller
@RequestMapping("/greeting")
public class GreetingController 
{
	@Autowired
	private IGreetingService service;
	
	@GetMapping("/getwish")
	public void showResponse(Map<String,Object>model)
	{
		model.put("greet", service.generateGreetings());
		return ;
	}
}
