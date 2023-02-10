package br.com.heartSystemX.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.PsicoAltoRiscoDAO;
import br.com.heartSystemX.model.entities.PsicoAltoRisco;
import br.com.heartSystemX.utils.conect.ConnectDB;
import br.com.heartSystemX.utils.exception.DbException;
import br.com.heartSystemX.utils.exception.DbIntegrityException;

//classe implementa interface PsicoAltoRiscoDAO, vai encapsular todas operações referente ao banco de dados.
public class PsicoAltoRiscoDaoJDBC implements PsicoAltoRiscoDAO {

	private Connection conectaDB;
	
	public PsicoAltoRiscoDaoJDBC() {
	}

	public PsicoAltoRiscoDaoJDBC(Connection conectaDB) {
		this.conectaDB = conectaDB;
	}

	@Override
	public void insert(PsicoAltoRisco objPAR) {
		PreparedStatement pst = null;
		// Instrução SQL para inserir registro na tabela do DB.
		String insereSql = "insert into tbpsicoaltorisco values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(insereSql);	
			pst.setString(1, objPAR.getCpfCliente());
			pst.setString(2, objPAR.getPrimeiro());
			pst.setString(3, objPAR.getSegundo());
			pst.setString(4, objPAR.getTerceiro());
			pst.setString(5, objPAR.getQuarto());
			pst.setString(6, objPAR.getQuinto());
			pst.setString(7, objPAR.getSexto());
			pst.setString(8, objPAR.getSetimo());
			pst.setString(9, objPAR.getOitavo());
			pst.setString(10, objPAR.getNono());
			pst.setString(11, objPAR.getDecimo());
			pst.setString(12, objPAR.getDecimoPrimeiro());	
			pst.setDate(13, new java.sql.Date(objPAR.getDtCadastroHPAR().getTime()));
			int rowsAffected = pst.executeUpdate();
			// teste para linhas afetadas
			if (rowsAffected > 0) {
				JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
			} else {
				throw new DbException("Erro!!! Nenhuma linha afetada!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
		}
	}

	@Override
	public void update(PsicoAltoRisco objPAR) {
		PreparedStatement pst = null;
		// Instrução SQL para atualizar registro específico da tabela no DB.
		String campos = "cpf=?, primeiro=?, segundo=?,  terceiro=?,  quarto=?,  quinto=?,  sexto=?,  setimo=?,  oitavo=?,  nono=?,  decimo=?,  decimoPrimeiro=?, data=?";
		String atualizaSql = "update tbpsicoaltorisco set " + campos + " WHERE cpf=?";
		try {
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(atualizaSql);
			pst.setString(1, objPAR.getCpfCliente());
			pst.setString(2, objPAR.getPrimeiro());
			pst.setString(3, objPAR.getSegundo());
			pst.setString(4, objPAR.getTerceiro());
			pst.setString(5, objPAR.getQuarto());
			pst.setString(6, objPAR.getQuinto());
			pst.setString(7, objPAR.getSexto());
			pst.setString(8, objPAR.getSetimo());
			pst.setString(9, objPAR.getOitavo());
			pst.setString(10, objPAR.getNono());
			pst.setString(11, objPAR.getDecimo());
			pst.setString(12, objPAR.getDecimoPrimeiro());
			pst.setDate(13, new java.sql.Date(objPAR.getDtCadastroHPAR().getTime()));
			pst.setString(14, objPAR.getCpfCliente());
			pst.executeUpdate();
			int rowsAffected = pst.executeUpdate();
			// teste para linhas afetadas
			if (rowsAffected > 0) {
				JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
			} else {
				throw new DbException("Erro!!! Nenhuma linha afetada!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
		}
	}

	@Override
	public void deleteByCpf(String cpf) {
		PreparedStatement pst = null;
		// Instrução SQL para deletar registro específico da tabela
		String deleteSQL = "delete from tbpsicoaltorisco WHERE cpf=?";
		try {
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(deleteSQL);
			pst.setString(1, cpf);
			int rowsAffected = pst.executeUpdate();
			// teste para linhas afetadas
			if (rowsAffected > 0) {
				JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
			} else {
				throw new DbException("Erro!!! Nenhuma linha afetada!");
			}
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
		}
	}

	@Override
	public PsicoAltoRisco findByCPF(String cpf) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		// Instrução SQL para seleção de registro específico da tabela
		String selectSQL = "select * from tbpsicoaltorisco where cpf=?";
		try {
			// conexao db
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(selectSQL);
			pst.setString(1, cpf);
			// Executa a pesquisa da seleção SQL e atribui o resultado ao ResultSet;
			rs = pst.executeQuery();
			// Laço de repetição para preencher com os dados do banco
			if (rs.next()) {
				// cahamada do método instancia passando rs como argumento
				PsicoAltoRisco objPAR = instanciaPsicoAltoRisco(rs);
				int sai = JOptionPane.showConfirmDialog(null, "Cliente já cadastrado nessa tabela! Deseja Alterar?",
						"Atenção!", JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
				return objPAR;
				}
			}else {
				return null;
			}
			return null;
		} catch (Exception e1) {
			throw new DbException(e1.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
			ConnectDB.closeResultSet(rs);
		}
	}

	@Override
	public List<PsicoAltoRisco> findAll() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		// Instrução SQL para listar todos os registros na tabela do DB.
		String selectSQL = "select * from tbpsicoaltorisco";
		try {
			// conexao db
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(selectSQL);
			rs = pst.executeQuery();
			List<PsicoAltoRisco> list = new ArrayList<>();
			// Laço de repetição para preencher a lista com os registros
			while (rs.next()) {
				// cahamada do método instancia passando rs como argumento
				PsicoAltoRisco objPAR = instanciaPsicoAltoRisco(rs);
				list.add(objPAR);
			}
			return list;
		} catch (Exception e1) {
			throw new DbException(e1.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
			ConnectDB.closeResultSet(rs);
		}
	}

	//método que instancia, com excessão propagada e nao tratada
	private PsicoAltoRisco instanciaPsicoAltoRisco(ResultSet rs) throws SQLException {
		PsicoAltoRisco objPAR = new PsicoAltoRisco();
		// "seta" os atributos da classe com os dados do BD
		objPAR.setCpfCliente(rs.getString("cpf"));
		objPAR.setPrimeiro(rs.getString("primeiro"));
		objPAR.setSegundo(rs.getString("segundo"));
		objPAR.setTerceiro(rs.getString("terceiro"));
		objPAR.setQuarto(rs.getString("quarto"));
		objPAR.setQuinto(rs.getString("quinto"));
		objPAR.setSexto(rs.getString("sexto"));
		objPAR.setSetimo(rs.getString("setimo"));
		objPAR.setOitavo(rs.getString("oitavo"));
		objPAR.setNono(rs.getString("nono"));
		objPAR.setDecimo(rs.getString("decimo"));
		objPAR.setDecimoPrimeiro(rs.getString("decimoPrimeiro"));	
		objPAR.setDtCadastroHPAR(rs.getDate("data"));	
		return objPAR;
	}

}
