package cl.empresa.proyecto.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaController {

	@RequestMapping("/buscar")
	public String buscar(@RequestParam(value="nombre") String searchQuery) {
		return "Usted a buscado: "+searchQuery;
	}
	
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String mostrarLeccion(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson) {
		return "Track: "+track+", Module: "+module+", Lesson:"+lesson;
	}
	
}
