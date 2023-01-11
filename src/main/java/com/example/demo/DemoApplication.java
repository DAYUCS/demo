package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/api/nginx")
	public ResponseEntity<String> testNginx() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://10.39.107.102:32399/";
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		if (response.getStatusCode().is2xxSuccessful()) {
			return ResponseEntity.status(HttpStatus.OK).body("HTTP Status is 200\n");
		} else {
			return ResponseEntity.status(response.getStatusCode()).body("HTTP Status is not 200\n");
			//return ResponseEntity.status(HttpStatus.OK).body("HTTP Status is not 200\n");
		}

	}
}
