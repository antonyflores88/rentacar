package sv.edu.ufg.rcs.models.service;

import java.util.List;
import sv.edu.ufg.rcs.models.entity.Clientefull;


public interface iClientefullService {
	
	Clientefull findClientByNumeroDoc(String numdoc);
	
	public List<Clientefull> listAll();
	
	public void save(Clientefull clientefull);
	
}
