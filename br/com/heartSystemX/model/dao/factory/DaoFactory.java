package br.com.heartSystemX.model.dao.factory;

import br.com.heartSystemX.model.dao.AntropometriaDAO;
import br.com.heartSystemX.model.dao.ClienteDAO;
import br.com.heartSystemX.model.dao.FamiliaDAO;
import br.com.heartSystemX.model.dao.PsicoAltoRiscoDAO;
import br.com.heartSystemX.model.dao.PsicoDAO;
import br.com.heartSystemX.model.dao.SaudeDAO;
import br.com.heartSystemX.model.dao.UsuarioDAO;
import br.com.heartSystemX.model.dao.impl.AntropometriaDaoJDBC;
import br.com.heartSystemX.model.dao.impl.ClienteDaoJDBC;
import br.com.heartSystemX.model.dao.impl.FamiliaDaoJDBC;
import br.com.heartSystemX.model.dao.impl.PsicoAltoRiscoDaoJDBC;
import br.com.heartSystemX.model.dao.impl.PsicoDaoJDBC;
import br.com.heartSystemX.model.dao.impl.SaudeDaoJDBC;
import br.com.heartSystemX.model.dao.impl.UsuarioDaoJDBC;
import br.com.heartSystemX.utils.conect.ConnectDB;

//classe Fábrica de Dao's com operações estáticas responsaveis por instanciar os dao's
public class DaoFactory {

	public static ClienteDAO createClienteDao() {
		return new ClienteDaoJDBC(ConnectDB.getConnection());
	}

	public static FamiliaDAO createFamiliaDAO() {
		return new FamiliaDaoJDBC(ConnectDB.getConnection());
	}

	public static AntropometriaDAO createAntropometriaDAO() {
		return new AntropometriaDaoJDBC(ConnectDB.getConnection());
	}

	public static SaudeDAO createSaudeDAO() {
		return new SaudeDaoJDBC(ConnectDB.getConnection());
	}

	public static PsicoDAO createPsicoDAO() {
		return new PsicoDaoJDBC(ConnectDB.getConnection());
	}

	public static PsicoAltoRiscoDAO createPsicoAltoRiscoDAO() {
		return new PsicoAltoRiscoDaoJDBC(ConnectDB.getConnection());
	}

	public static UsuarioDAO createUsuarioDAO() {
		return new UsuarioDaoJDBC(ConnectDB.getConnection());
	}
}
