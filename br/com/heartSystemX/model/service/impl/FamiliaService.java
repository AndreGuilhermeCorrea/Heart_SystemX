package br.com.heartSystemX.model.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.FamiliaDaoJDBC;
import br.com.heartSystemX.model.entities.Familia;

public class FamiliaService {

	private FamiliaDaoJDBC dao;
	private Familia objFam;

	public FamiliaService() {
		this.dao = new FamiliaDaoJDBC();
	}

	public void findByCPF(String cpf) {
		dao.findByCPF(cpf);
	}
	
	public void insert(Familia objFam) {
		dao.insert(objFam);
	}
	
	public void update(Familia objFam) {
		dao.update(objFam);
	}
	
	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);	
	}

	public Familia pesquisaView(String cpf) {
		objFam = dao.findByCPF(cpf);
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		String strDt = formato.format(objFam.getdtCadastroHF());
		Date dtUtil;
		try {
			dtUtil = formato.parse(strDt);
			objFam.setdtCadastroHF(dtUtil);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error! " + e);
		}
		return objFam;
	}

	

	

}
