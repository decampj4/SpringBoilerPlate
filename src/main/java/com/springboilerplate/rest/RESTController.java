package com.springboilerplate.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboilerplate.constants.Constants;

@RestController
public class RESTController {
	
	@RequestMapping(Constants.REST_HELLO_WORLD)
	public String helloWorld(){
		return "Hello World!";
	}
	
	@RequestMapping(value=Constants.REST_HELLO_WORLD_WITH_NAME, method=RequestMethod.POST)
	public String helloWorldWithName(@RequestParam(value="name", defaultValue="World", required=true) String name){
		return "Hello " + name + "!";
	}
}
