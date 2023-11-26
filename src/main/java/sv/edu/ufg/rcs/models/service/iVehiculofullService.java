package sv.edu.ufg.rcs.models.service;

import java.util.List;

import sv.edu.ufg.rcs.models.entity.Vehiculofull;

public interface iVehiculofullService {
	
	public List<Vehiculofull> listAll();
	public void save(Vehiculofull expediente);
	public Vehiculofull searchById(Integer placa);
	public void delete(Integer placa);

}
