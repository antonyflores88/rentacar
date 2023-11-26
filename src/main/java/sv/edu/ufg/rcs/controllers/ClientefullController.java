package sv.edu.ufg.rcs.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sv.edu.ufg.rcs.models.entity.Clientefull;
import sv.edu.ufg.rcs.models.entity.Pagos;
import sv.edu.ufg.rcs.models.service.iClientefullService;
import sv.edu.ufg.rcs.models.service.iPagosService;

@Controller
@RequestMapping("/clientes")
public class ClientefullController {
	
	 private final iClientefullService clienteService;
	 private final iPagosService pagoService;

	    public ClientefullController(iClientefullService clienteService, iPagosService pagoService) {
	        this.clienteService = clienteService;
	        this.pagoService = pagoService;
	    }
	    
	    @GetMapping("/adminpage")
	    public String showAdminPage() {
	        return "views/adminpage"; // This assumes "adminpage" is the logical view name
	    }
	    
	    @GetMapping("/{numeroDoc}")
	    public String findClientByNumeroDoc(@PathVariable String numeroDoc, Model model) {
	        Clientefull cliente = clienteService.findClientByNumeroDoc(numeroDoc);
	        model.addAttribute("cliente", cliente);
	        return "views/update-client-form";  // Puedes tener una plantilla Thymeleaf para mostrar los detalles del cliente.
	    }
	    
	    @GetMapping("/list")
	    public String listAllClients(Model model) {
	        List<Clientefull> listaClientes = clienteService.listAll();
	        model.addAttribute("clientes", listaClientes);
	        return "views/confirmation";  // Puedes tener una plantilla Thymeleaf para mostrar la lista de clientes.
	    }
	    
	    @PostMapping("/save")
	    public String saveOrUpdateCliente(@ModelAttribute Clientefull clientefull) {
	    	clienteService.save(clientefull);
	        return "redirect:/clientes/list";  // Redirige a la lista de clientes después de guardar uno nuevo.
	    }
	    
	    @GetMapping("/buscarcliente")
	    public String mostrarVistaBusqueda() {
	        return "views/buscarcliente";
	    }
	    
	    @PostMapping("/buscarcliente")
	    public String buscarPagosPorId(@RequestParam("dui") String dui, Model model) {
	    	
	    	if (!dui.isEmpty()) {
    	        // Search by ID
    	        Pagos moroso = pagoService.searchById(dui);
    	        model.addAttribute("moroso", moroso);
    	    }
	    	
	    	return "views/buscarcliente";
	    }
	    
	    @GetMapping("/deudas/{dui}")
	    public String findClientByDUI(@PathVariable String dui, Model model) {
	    	Clientefull cliente = clienteService.findClientByNumeroDoc(dui);
	    	Pagos clientemoroso = pagoService.searchById(dui);
	    	model.addAttribute("cliente", cliente);
	        model.addAttribute("clientem", clientemoroso);
	        return "views/frmcancelacion";  // Puedes tener una plantilla Thymeleaf para mostrar los detalles del cliente.
	    }
	    
	    @PostMapping("/cancelacion")
	    public String completarCancelacion(@ModelAttribute Pagos pagos) {
	    	pagoService.save(pagos);
	        return "redirect:/clientes/adminpage";  // Redirige a la lista de clientes después de guardar uno nuevo.
	    }

}
