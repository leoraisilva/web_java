package com.web.web_vcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebVcardApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebVcardApplication.class, args);
	}

	@GetMapping("/")
	public String okay(){
		return "Funcionado";
	}

}
