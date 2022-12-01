package com.in28minutes.springboot.loginWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

		
		//"say-hello" => "Hello! What are you learning today?"
		
		//say-hello
		// http://localhost:8080/say-hello
		@RequestMapping("say-hello")
		@ResponseBody
		public String sayHello() {
			return "Hello! What are you learning today?";
		}

		@RequestMapping("say-hello-jsp") // to map the url say-hello-jsp
		//@ResponseBody// to return the specific string as it is
		public String sayHelloJSP() {
			return "sayHello";
		}	
		
	}	
	

