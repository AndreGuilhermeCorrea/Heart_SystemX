package br.com.heartSystemX.model.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.PsicoDaoJDBC;
import br.com.heartSystemX.model.entities.Psico;

public class PsicoService {
	private PsicoDaoJDBC dao;
	private Psico objPsico;

	public PsicoService() {
		this.dao = new PsicoDaoJDBC();
	}

	public void findByCpf(String cpf) {
		dao.findByCPF(cpf);
	}

	public void insert(Psico objPsico) {
		dao.insert(objPsico);
	}

	public void update(Psico objPsico) {
		dao.update(objPsico);
	}

	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	public Psico pesquisaView(String cpf) {
		objPsico = dao.findByCPF(cpf);
		// formatador para dd/mm/aaaa
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		// recebe dataSql ja em dataUtil
		// convertendo data para string
		String strDt = formato.format(objPsico.getDtCadastroHP());
		Date dtUtil;
		try {
			dtUtil = formato.parse(strDt);
			objPsico.setDtCadastroHP(dtUtil);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e);
		}

		return objPsico;
	}

}
