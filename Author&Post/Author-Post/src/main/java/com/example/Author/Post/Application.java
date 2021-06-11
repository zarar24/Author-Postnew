package com.example.Author.Post;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootApplication
public class Application {
	


	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(Application.class, args);
		
	}
}
