package mx.uv.practica11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Practica11Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica11Application.class, args);
	}


	//Api relativo a los colores

	@RequestMapping (method = RequestMethod.PUT, value = "/color")
	String cambiarColor(){
		return"Color cambiado";
	}
	@RequestMapping (method = RequestMethod.DELETE, value = "/color")
	String eliminarColor(){
		return"Color eliminado";
	}
	@RequestMapping (method = RequestMethod.GET, value = "/color")
	String listarColores(){
		 return"Color listado";
	}
	@RequestMapping (method = RequestMethod.POST, value = "/color")
	String crearColor(){
		return"Color Creado";
	}
}
