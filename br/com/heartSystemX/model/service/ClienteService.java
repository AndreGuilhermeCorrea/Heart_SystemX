package br.com.heartSystemX.model.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.ClienteDaoJDBC;
import br.com.heartSystemX.model.entities.Cliente;
import br.com.heartSystemX.model.entities.ClienteView;
import br.com.heartSystemX.utils.MasksSwing;

public class ClienteService {
	private ClienteDaoJDBC dao;
	private Cliente objClient;
	private ClienteView c2;

	public ClienteService() {
		this.dao = new ClienteDaoJDBC();
		this.objClient = new Cliente();
		this.c2 = new ClienteView();
	}

	public void findByCpf(String cpf) {
		dao.findByCPF(cpf);
	}

	public void insert(Cliente objClient) {
		dao.insert(objClient);
	}

	public void update(Cliente objClient) {
		System.out.println("dao");
		dao.update(objClient);
	}

	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	public ClienteView pespesquisaCPFeNome(String cpf) {
		c2 = dao.pespesquisaCPFeNome(cpf);
		// formatador para dd/mm/aaaa
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		// conversao da data java.util para string com o formato
		String strDt = formato.format(c2.getNascimento());
		// variável data java.util
		Date dtUtil;
		try {
			// conversão da string novamente em data java.util
			dtUtil = formato.parse(strDt);
			// setando o nascimento no formato
			c2.setNascimento(dtUtil);
			// variável tipo int idade com a comversao de string vinda do método de
			// calculo(masksSwing)
			int idade = Integer.parseInt(MasksSwing.calcIdade(strDt));
			// setando a idade
			c2.setIdade(idade);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e);
		}
		return c2;
	}

	public Cliente pesquisaView(String cpf) {
		objClient = dao.findByCPF(cpf);
		// formatador para dd/mm/aaaa
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		// conversao da data java.util para string com o formato
		String strDt = formato.format(objClient.getNascimento());
		// variável data java.util
		Date dtUtil;
		try {
			// conversão da string novamente em data java.util
			dtUtil = formato.parse(strDt);
			// setando o nascimento no formato
			objClient.setNascimento(dtUtil);
			// variável tipo int idade com a comversao de string vinda do método de
			// calculo(masksSwing)
			int idade = Integer.parseInt(MasksSwing.calcIdade(strDt));
			// setando a idade
			objClient.setIdade(idade);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e);
		}
		return objClient;
	}

}
