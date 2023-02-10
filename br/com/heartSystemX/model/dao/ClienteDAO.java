package br.com.heartSystemX.model.dao;

import java.util.List;
import br.com.heartSystemX.model.entities.Cliente;
import br.com.heartSystemX.model.entities.ClienteView;

public interface ClienteDAO {

	void insert(Cliente objClient);

	void update(Cliente objClient);

	void deleteByCpf(String cpf);

	Cliente findByCPF(String cpf);
	
	ClienteView pespesquisaCPFeNome(String cpf);

	List<Cliente> findAll();
}
