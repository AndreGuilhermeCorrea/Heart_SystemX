package br.com.heartSystemX.model.service.impl;

import br.com.heartSystemX.model.dao.impl.UsuarioDaoJDBC;
import br.com.heartSystemX.model.entities.Usuario;

public class UsuarioService {
	private UsuarioDaoJDBC dao;
	private Usuario objUser;

	public UsuarioService() {
		this.dao = new UsuarioDaoJDBC();
	}

	public void findByCPF(String cpf) {
		dao.findByCPF(cpf);
	}
	public void insert(Usuario objUser) {
		dao.insert(objUser);
	}

	public void update(Usuario objUser) {
		dao.update(objUser);
	}

	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	public Usuario pesquisaView(String cpf) {
		objUser = dao.findByCPF(cpf);
		
		return objUser;
		
	}

}
