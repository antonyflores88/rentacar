package sv.edu.ufg.rcs.models.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.edu.ufg.rcs.models.entity.Clientefull;
import sv.edu.ufg.rcs.models.repository.ClientefullRepo;


@Service
public class ClientefullImpl implements iClientefullService {

	  @Autowired
	    private ClientefullRepo clienteRepository;

	  @Override
	  public List<Clientefull> listAll() {
	      Iterable<Clientefull> clientesIterable = clienteRepository.findAll();
	      List<Clientefull> clientesList = new ArrayList<>();

	      clientesIterable.forEach(clientesList::add);

	      return clientesList;
	  }

	  @Override 
	  public void save(Clientefull clientefull) {
	        clienteRepository.save(clientefull);
	    }

	  @Override
	    public Clientefull findClientByNumeroDoc(String numeroDoc) {
	        return clienteRepository.findByNumeroDoc(numeroDoc);
	    }

}
