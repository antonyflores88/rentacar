package sv.edu.ufg.rcs.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.edu.ufg.rcs.models.entity.Vehiculo;
import sv.edu.ufg.rcs.models.repository.VehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private VehiculoRepository vehiculorepo;
	
	@Override
	public List<Vehiculo> listAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculorepo.findAll();
	}

	@Override
	public void save(Vehiculo vehiculo) {
		vehiculorepo.save(vehiculo);

	}

	@Override
	public Vehiculo searchBycodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return vehiculorepo.findById(codigo).orElse(null);
	}

	@Override
	public void delete(Integer codigo) {
		// TODO Auto-generated method stub
		vehiculorepo.deleteById(codigo);
	}

}
