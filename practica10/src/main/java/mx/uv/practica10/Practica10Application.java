package mx.uv.practica10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;	

@RestController
@SpringBootApplication
//EL arroba (@) es una anotación la cual me ayuda a llamar clases para que este  pueda hacer muchas más cosas.
public class Practica10Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica10Application.class, args);
	}

	@RequestMapping("/")
	String altas(){
		return "producto dado de alta";
	}
	
	@RequestMapping("/")
	String bajas(){
		return "producto dado de baja";
	}

	@RequestMapping("/")
	String cambios(){
		return "producto modificado";
	}

	@RequestMapping("/")
	String consultas(){
		return "producto consultado";
	}

}
