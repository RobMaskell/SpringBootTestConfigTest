package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private SomeService someService;
	
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return someService.getResponse();
	}
}
