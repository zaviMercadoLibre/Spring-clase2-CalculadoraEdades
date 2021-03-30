package Springclase2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controllers"})
public class CalculadoraEdadApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraEdadApplication.class, args);
	}

}
