package sv.edu.ufg.rcs.models.service;

import java.util.List;

import sv.edu.ufg.rcs.models.entity.Vehiculo;

public interface IVehiculoService {
	
	public List<Vehiculo> listAll();
	public void save(Vehiculo vehiculo);
	public Vehiculo searchBycodigo(Integer codigo);
	public void delete(Integer codigo);

}
