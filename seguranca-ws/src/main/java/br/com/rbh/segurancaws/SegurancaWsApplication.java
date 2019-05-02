package br.com.rbh.segurancaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SegurancaWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurancaWsApplication.class, args);
	}

}
