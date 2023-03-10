package br.com.heartSystemX.model.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.PsicoAltoRiscoDaoJDBC;
import br.com.heartSystemX.model.entities.PsicoAltoRisco;

public class PsicoAltoRiscoService {

	private PsicoAltoRiscoDaoJDBC dao;
	private PsicoAltoRisco objPAR;

	public PsicoAltoRiscoService() {
		this.dao = new PsicoAltoRiscoDaoJDBC();
	}

	public void findByCpf(String cpf) {
		dao.findByCPF(cpf);
	}

	public void insert(PsicoAltoRisco objPAR) {
		dao.insert(objPAR);
	}

	public void update(PsicoAltoRisco objPAR) {
		dao.update(objPAR);
	}

	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	public PsicoAltoRisco pesquisaView(String cpf) {
		objPAR = dao.findByCPF(cpf);

		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		String strDt = formato.format(objPAR.getDtCadastroHPAR());
		Date dtUtil;
		try {
			dtUtil = formato.parse(strDt);
			objPAR.setDtCadastroHPAR(dtUtil);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error! " + e);
		}
		return objPAR;
	}

}
