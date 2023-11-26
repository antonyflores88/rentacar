package sv.edu.ufg.rcs.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.edu.ufg.rcs.models.entity.Registrocliente;
import sv.edu.ufg.rcs.models.repository.RegistrodeclienteRepository;

@Service
public class RegistrodeclienteImpl implements IRegistroService {

	@Autowired
	private RegistrodeclienteRepository registrodeclienterepository;
	
	@Override
	public void save(Registrocliente registro) {
		registrodeclienterepository.save(registro);

	}

}
