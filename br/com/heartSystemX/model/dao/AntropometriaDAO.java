package br.com.heartSystemX.model.dao;

import java.util.List;
import br.com.heartSystemX.model.entities.Antropometria;

public interface AntropometriaDAO {
	
	void insert(Antropometria objAntro);

	void update(Antropometria objAntro);

	void deleteByCpf(String cpf);

	Antropometria findByCPF(String cpf);

	List<Antropometria> findAll();
}
