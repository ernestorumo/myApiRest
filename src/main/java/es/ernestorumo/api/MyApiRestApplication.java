package es.ernestorumo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "es.ernestorumo.api")
@SpringBootApplication
public class MyApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiRestApplication.class, args);
	}

}
