package com.in28minutes.springboot.loginWebApp.login;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@EnableAutoConfiguration
@Controller
@SessionAttributes("name")
public class loginController {

private AuthenticationService authenticationService;
	
	
	
	
	public loginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	///login => com.in28minutes.springboot.myfirstwebapp.login.LoginController => login
	
	//private Logger logger= LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="login",method=RequestMethod.GET) // to map the url say-hello-jsp
	
	public String gotoLoginPage() {
		//model.put("name", name);
		
		//logger.debug("Request param is{}", name);
		//logger.info("to be printed in info level", name);
		//logger.warn("to be printed in warn level", name);
		//System.out.println("Request param is" +name);//NOT RECOMMENDED FOR PRODUCTION CODE
		return "login"; // returns view name login
	}	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
		model.put("name", name);
		
//		model.put("password", password);
		
//		Authentication process:
//			name-in28minutes
//			pass-dummy
		
		return "welcome"; // returns view name login
	}
	model.put("Errormssg", "Invalid credentials");
	return "login";
	
	}
}
