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


import sv.edu.ufg.rcs.models.entity.Vehiculofull;
import sv.edu.ufg.rcs.models.service.iVehiculofullService;

@Controller
@RequestMapping("/vehiculofull")
public class VehiculofullController {
	
	@Autowired
	private iVehiculofullService vehiculofullService;
	
	@GetMapping("/create")
	public String crearExpediente(Model model) {
		
		Vehiculofull nuevovehiculo = new Vehiculofull();
		  	
		model.addAttribute("title", "Registro de Vehiculo");
		model.addAttribute("vehiculofull", nuevovehiculo);

		return "views/vehiculo-full";
	}
	
	 @GetMapping("/{placa}")
	    public String findClientByNumeroDoc(@PathVariable Integer placa, Model model) {
	        Vehiculofull vehiculofull = vehiculofullService.searchById(placa);
	        model.addAttribute("vehiculofull", vehiculofull);
	        return "views/vehiculo-full";  // Puedes tener una plantilla Thymeleaf para mostrar los detalles del cliente.
	    }
	    
	    @GetMapping("/list")
	    public String listAllClients(Model model) {
	        List<Vehiculofull> listaVehiculos = vehiculofullService.listAll();
	        model.addAttribute("vehiculos", listaVehiculos);
	        return "views/vehiculo-full-list";  // Puedes tener una plantilla Thymeleaf para mostrar la lista de clientes.
	    }
	    
	    @PostMapping("/save")
	    public String saveOrUpdateCliente(@ModelAttribute Vehiculofull vehiculofull) {
	    	vehiculofullService.save(vehiculofull);
	        return "redirect:/vehiculofull/list";  // Redirige a la lista de clientes después de guardar uno nuevo.
	    }

}
