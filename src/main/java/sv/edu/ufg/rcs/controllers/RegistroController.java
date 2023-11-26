package sv.edu.ufg.rcs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sv.edu.ufg.rcs.models.entity.Registrocliente;
import sv.edu.ufg.rcs.models.entity.Vehiculo;
import sv.edu.ufg.rcs.models.service.IRegistroService;
import sv.edu.ufg.rcs.models.service.IVehiculoService;

@Controller
@RequestMapping("/views/vehiculos")
public class RegistroController {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IRegistroService registroService;
	
	@GetMapping("/")
	public String showVehiculo(Model model) {
		
		List<Vehiculo> vehiculoList = vehiculoService.listAll();
		
		model.addAttribute("Titulo", "Vehiculo Disponible");
		model.addAttribute("vehiculo", vehiculoList);
		
		return "views/vehiculoslist";
	}
	
	@GetMapping("/create/{codigo}")
	public String crearReserva(@PathVariable("codigo") Integer codigo,Model model) {
		
		Vehiculo vehiculo =vehiculoService.searchBycodigo(codigo);
		Registrocliente reservaInicial = new Registrocliente();
		
		reservaInicial.setCodigovehiculo(codigo);
		model.addAttribute("Titulo", "Reservacion");
		model.addAttribute("vehiculo", vehiculo);
		model.addAttribute("reservacion", reservaInicial);
		
		return "views/frmreserva";
	}
	
	@PostMapping("/reservar")
	public String saveRegistro(@ModelAttribute Registrocliente registro, 
			@RequestParam("codigoVehiculo") Integer codigoVehiculo) {
		
		registro.setCodigovehiculo(codigoVehiculo);
		registroService.save(registro);
		
		System.out.println("Registro completado");
		
		return "redirect:/views/vehiculos/";
	}
	
	
}
