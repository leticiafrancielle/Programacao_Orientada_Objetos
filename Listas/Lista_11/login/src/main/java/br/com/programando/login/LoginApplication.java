package br.com.programando.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("")
public class LoginApplication {

	@GetMapping("/login/{user}")
	
	public boolean vericaLogin(@PathVariable String user){
		return user.equals("admin");
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
