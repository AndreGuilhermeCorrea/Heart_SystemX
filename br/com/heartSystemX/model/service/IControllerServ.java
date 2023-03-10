package br.com.heartSystemX.model.service;

public interface IControllerServ {

	void findByCpf(String cpf);

	void insert(Object obj);

	void update(Object obj);

	void deleteByCpf(String cpf);

	Object pesquisaView(String cpf);

}
