package sv.edu.ufg.rcs.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.edu.ufg.rcs.models.entity.Pagos;
import sv.edu.ufg.rcs.models.repository.PagosRepo;

@Service
public class PagosServiceImpl implements iPagosService {

	@Autowired
	private PagosRepo pagosRepo;
	
	@Override
	public List<Pagos> listAll() {
		// TODO Auto-generated method stub
		return (List<Pagos>) pagosRepo.findAll();
	}

	@Override
	public void save(Pagos pagos) {
		// TODO Auto-generated method stub
		pagosRepo.save(pagos);
	}

	@Override
	public Pagos searchById(String dui) {
		// TODO Auto-generated method stub
		return pagosRepo.findById(dui).orElse(null);
	}

	@Override
	public void delete(String dui) {
		// TODO Auto-generated method stub
		pagosRepo.deleteById(dui);
	}

}
