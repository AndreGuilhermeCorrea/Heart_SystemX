package br.com.heartSystemX.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.heartSystemX.model.dao.FamiliaDAO;
import br.com.heartSystemX.model.entities.Familia;
import br.com.heartSystemX.utils.conect.ConnectDB;
import br.com.heartSystemX.utils.exception.DbException;
import br.com.heartSystemX.utils.exception.DbIntegrityException;

//classe implementa interface ClienteDAO, vai encapsular todas operações referente ao banco de dados.
public class FamiliaDaoJDBC implements FamiliaDAO {

	private Connection conectaDB;

	public FamiliaDaoJDBC(Connection conectaDB) {
		this.conectaDB = conectaDB;
	}

	public FamiliaDaoJDBC() {
	}

	@Override
	public void insert(Familia objFam) {
		PreparedStatement pst = null;
		// Instrução SQL para inserir registro na tabela do DB.
		String insereSql = "insert into tbhistoriafamiliar values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(insereSql);
			pst.setString(1, objFam.getCpfCliente());
			pst.setDate(2, new java.sql.Date(objFam.getdtCadastroHF().getTime()));
			pst.setString(3, objFam.getPatologiaCardiaca());
			pst.setString(4, objFam.getPatologiaArterial());
			pst.setString(5, objFam.getPatologiaPulmonar());
			pst.setString(6, objFam.getTabagista());
			pst.setString(7, objFam.getEtilista());
			pst.setString(8, objFam.getDiabetes());
			pst.setString(9, objFam.getCancer());
			pst.setString(10, objFam.getHipertensao());
			pst.setString(11, objFam.getRenal());
			pst.setString(12, objFam.getaVC());
			pst.setString(13, objFam.getAsma());
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
	public void update(Familia objFam) {
		PreparedStatement pst = null;
		// Instrução SQL para atualizar registro específico da tabela no DB.
		String campos = "cpf=?, data=?, patologiaCardiaca=?, patologiaArterial=?, patologiaPulmonar=?,"
				+ " tabagista=?, etilista=?, diabetes=?, cancer=?, hipertensão=?, renal=?, AVC=?, asma=?";
		String atualizaSql = "update tbhistoriafamiliar set " + campos + " WHERE cpf=?";
		try {
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(atualizaSql);
			pst.setString(1, objFam.getCpfCliente());
			pst.setDate(2, new java.sql.Date(objFam.getdtCadastroHF().getTime()));
			pst.setString(3, objFam.getPatologiaCardiaca());
			pst.setString(4, objFam.getPatologiaArterial());
			pst.setString(5, objFam.getPatologiaPulmonar());
			pst.setString(6, objFam.getTabagista());
			pst.setString(7, objFam.getEtilista());
			pst.setString(8, objFam.getDiabetes());
			pst.setString(9, objFam.getCancer());
			pst.setString(10, objFam.getHipertensao());
			pst.setString(11, objFam.getRenal());
			pst.setString(12, objFam.getaVC());
			pst.setString(13, objFam.getAsma());
			pst.setString(14, objFam.getCpfCliente());
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
		String deleteSQL = "delete from tbhistoriafamiliar WHERE cpf=?";
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
	public Familia findByCPF(String cpf) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		// Instrução SQL para seleção de registro específico da tabela
		String selectSQL = "select * from tbhistoriafamiliar where cpf=?";
		try {
			// conexao db
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(selectSQL);
			pst.setString(1, cpf);
			// Executa a pesquisa da seleção SQL e atribui o resultado ao ResultSet;
			rs = pst.executeQuery();
			// Laço de repetição para preencher com os dados do banco
			if (rs.next()) {
				Familia objFam = instanciaFamilia(rs);
				int sai = JOptionPane.showConfirmDialog(null, "Cliente já cadastrado nessa tabela! Deseja Alterar?",
						"Atenção!", JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					return objFam;
				}
			} else {
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
	public List<Familia> findAll() {
		PreparedStatement pst = null;
		ResultSet rs = null;
		// Instrução SQL para listar todos os registros na tabela do DB.
		String selectSQL = "select * from tbhistoriafamiliar";
		try {
			// conexao db
			conectaDB = ConnectDB.getConnection();
			pst = conectaDB.prepareStatement(selectSQL);
			rs = pst.executeQuery();
			List<Familia> list = new ArrayList<>();
			// Laço de repetição para preencher a lista com os registros
			while (rs.next()) {
				// cahamada do método instancia passando rs como argumento
				Familia objFam = instanciaFamilia(rs);
				list.add(objFam);
			}
			return list;
		} catch (Exception e1) {
			throw new DbException(e1.getMessage());
		} finally {
			ConnectDB.closePreparedStatement(pst);
			ConnectDB.closeResultSet(rs);
		}
	}

	////método que instancia, com excessão propagada e nao tratada
	private Familia instanciaFamilia(ResultSet rs) throws SQLException {
		Familia objFam = new Familia();
		// "seta" os atributos da classe com os dados do BD
		objFam.setCpfCliente(rs.getString("cpf"));
		objFam.setdtCadastroHF(rs.getDate("data"));
		objFam.setPatologiaCardiaca(rs.getString("patologiaCardiaca"));
		objFam.setPatologiaArterial(rs.getString("patologiaArterial"));
		objFam.setPatologiaPulmonar(rs.getString("patologiaPulmonar"));
		objFam.setTabagista(rs.getString("tabagista"));
		objFam.setEtilista(rs.getString("etilista"));
		objFam.setDiabetes(rs.getString("diabetes"));
		objFam.setCancer(rs.getString("cancer"));
		objFam.setHipertensao(rs.getString("hipertensão"));
		objFam.setRenal(rs.getString("renal"));
		objFam.setaVC(rs.getString("AVC"));
		objFam.setAsma(rs.getString("asma"));
		return objFam;
	}

}
