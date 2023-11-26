package sv.edu.ufg.rcs.models.service;

import java.util.List;

import sv.edu.ufg.rcs.models.entity.Pagos;

public interface iPagosService {
	
	public List<Pagos> listAll();
	public void save(Pagos expediente);
	public Pagos searchById(String dui);
	public void delete(String dui);

}
