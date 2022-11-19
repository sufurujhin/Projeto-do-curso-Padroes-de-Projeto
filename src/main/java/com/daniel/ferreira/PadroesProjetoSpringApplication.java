package com.daniel.ferreira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * projeto springboot 
 * Spring Data JPa
 * Spring web
 * H2 database
 * Openfeign
 * @Autor daniel
 * */
@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
