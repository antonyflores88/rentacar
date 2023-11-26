package sv.edu.ufg.rcs.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import sv.edu.ufg.rcs.models.entity.Clientefull;



public interface ClientefullRepo extends CrudRepository<Clientefull, Integer> {

	@Query("SELECT c FROM Clientefull c WHERE c.numdoc = :numdoc")
	Clientefull findByNumeroDoc(String  numdoc);
}
