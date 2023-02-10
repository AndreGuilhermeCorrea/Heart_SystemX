package br.com.heartSystemX.model.dao;

import java.sql.ResultSet;
import java.util.List;

import br.com.heartSystemX.model.entities.Usuario;

public interface UsuarioDAO {
	
	ResultSet logar(Usuario objUser);
	
	void insert(Usuario objUser);

	void update(Usuario objUser);

	void deleteByCpf(String cpf);

	Usuario findByCPF(String cpf);

	List<Usuario> findAll();
}