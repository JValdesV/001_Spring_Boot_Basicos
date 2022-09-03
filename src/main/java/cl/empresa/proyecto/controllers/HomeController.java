package cl.empresa.proyecto.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/test")
	public String listas() {
		
		return "test";
	}
	
	@RequestMapping("/frutas")
	public String listas(Model model) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("Naranja");
		elementos.add("Pera");
		elementos.add("Kiwi");
		
		model.addAttribute("elementos",elementos);
		
		return "listaDeCompras";
	}
	
	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public String formulario() {
		return "formulario";
	}
	
	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public String procesaDatos(@RequestParam("nombre") String nombre, @RequestParam("edad") String edad, Model model) {
		
		model.addAttribute("nombre",nombre);
		model.addAttribute("edad",edad);
		
		return "recibedatos";
		
		
	}
	
	
	
	
	
}
