package io.github.lucianodacunha.padroes.de.projetos.com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetosComSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetosComSpringApplication.class, args);
	}

}
