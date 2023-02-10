package br.com.heartSystemX.model.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.SaudeDaoJDBC;
import br.com.heartSystemX.model.entities.Saude;

public class SaudeService {

	private SaudeDaoJDBC dao;
	private Saude objSaude;

	public SaudeService() {
		this.dao = new SaudeDaoJDBC();
	}

	public void findByCpf(String cpf) {
		dao.findByCPF(cpf);
	}

	public void insert(Saude objSaude) {
		dao.insert(objSaude);
	}

	public void update(Saude objSaude) {
		dao.update(objSaude);
	}

	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	public Saude pesquisaView(String cpf) {
		objSaude = dao.findByCPF(cpf);
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		String strDt = formato.format(objSaude.getDtCadastroS());
		Date dtUtil;
		try {
			dtUtil = formato.parse(strDt);
			objSaude.setDtCadastroS(dtUtil);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error! " + e);
		}

		return objSaude;
	}

}
