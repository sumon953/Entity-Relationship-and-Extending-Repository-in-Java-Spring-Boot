package com.example.SimpleLogin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloShow()
	{
		
		return "Sumon Sarder";
		
	}

}
