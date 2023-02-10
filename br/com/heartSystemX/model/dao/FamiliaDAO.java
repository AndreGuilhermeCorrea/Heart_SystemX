package br.com.heartSystemX.model.dao;

import java.util.List;
import br.com.heartSystemX.model.entities.Familia;

public interface FamiliaDAO {
	
	void insert(Familia objFam);

	void update(Familia objFam);

	void deleteByCpf(String cpf);

	Familia findByCPF(String cpf);

	List<Familia> findAll();

}
