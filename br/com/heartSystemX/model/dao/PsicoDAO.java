package br.com.heartSystemX.model.dao;

import java.util.List;
import br.com.heartSystemX.model.entities.Psico;

public interface PsicoDAO {
	
	void insert(Psico objPsico);

	void update(Psico objPsico);

	void deleteByCpf(String cpf);

	Psico findByCPF(String cpf);

	List<Psico> findAll();
}
