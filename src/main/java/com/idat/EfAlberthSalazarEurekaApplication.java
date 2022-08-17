package com.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfAlberthSalazarEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAlberthSalazarEurekaApplication.class, args);
	}

}
