package sv.edu.ufg.rcs.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.edu.ufg.rcs.models.entity.Vehiculofull;
import sv.edu.ufg.rcs.models.repository.VehiculofullRepo;


@Service
public class VehiculofullServiceImpl implements iVehiculofullService {

	@Autowired
	private VehiculofullRepo vehiculoRepo;
	
	@Override
	public List<Vehiculofull> listAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculofull>) vehiculoRepo.findAll();
	}

	@Override
	public void save(Vehiculofull vehiculofull) {
		// TODO Auto-generated method stub
		vehiculoRepo.save(vehiculofull);
	}

	@Override
	public Vehiculofull searchById(Integer placa) {
		// TODO Auto-generated method stub
		return vehiculoRepo.findById(placa).orElse(null);
	}

	@Override
	public void delete(Integer placa) {
		// TODO Auto-generated method stub
		vehiculoRepo.deleteById(placa);
	}

}
