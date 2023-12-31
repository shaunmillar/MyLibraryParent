package my.pkg.name.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import my.pkg.name.HelloWorld;

@RestController
public class GreeterController {
	
	HelloWorld hello = new HelloWorld();
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot. Using " + hello.GetVersion();
	}

}
