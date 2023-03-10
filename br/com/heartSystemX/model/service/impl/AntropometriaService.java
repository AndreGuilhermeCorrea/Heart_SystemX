package br.com.heartSystemX.model.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.impl.AntropometriaDaoJDBC;
import br.com.heartSystemX.model.entities.Antropometria;
import br.com.heartSystemX.model.service.IControllerServ;

public class AntropometriaService implements IControllerServ {

	private AntropometriaDaoJDBC dao;
	private Antropometria objAntro;

	public AntropometriaService() {
		dao = new AntropometriaDaoJDBC();
	}

	@Override
	public void findByCpf(String cpf) {
		dao.findByCPF(cpf);
	}

	@Override
	public void insert(Object obj) {
		objAntro = (Antropometria) obj;
		dao.insert(objAntro);
	}

	@Override
	public void update(Object obj) {
		objAntro = (Antropometria) obj;
		dao.update(objAntro);
	}

	@Override
	public void deleteByCpf(String cpf) {
		dao.deleteByCpf(cpf);
	}

	@Override
	public Antropometria pesquisaView(String cpf) {
		objAntro = dao.findByCPF(cpf);
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		String strDt = formato.format(objAntro.getDtCadastroA());
		Date dtUtil;
		try {
			dtUtil = formato.parse(strDt);
			objAntro.setDtCadastroA(dtUtil);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Date Error! " + e);
		}
		return objAntro;
	}

	
}
