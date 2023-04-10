package com.semihozer.retimy;

import com.semihozer.retimy.entities.User;
import com.semihozer.retimy.repsitories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RetimyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetimyApplication.class, args);
	}



}
