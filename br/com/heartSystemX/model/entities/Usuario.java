package br.com.heartSystemX.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	// atributos
	private String cpfUsuario;
	private String usuario;
	private String login;
	private String senha;
	
	// construtor padrão
	public Usuario() {
	}
	
	// construtor com argumentos
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	// hash cod e equals para que os objetos possam ser comparados pelo CPF
	@Override
	public int hashCode() {
		return Objects.hash(cpfUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(cpfUsuario, other.cpfUsuario);
	}

	// construtor com argumentos
	public Usuario(String cpfUsuario, String usuario, String login, String senha) {
		super();
		this.cpfUsuario = cpfUsuario;
		this.usuario = usuario;
		this.login = login;
		this.senha = senha;
	}

	// toString
	@Override
	public String toString() {
		return "Usuario [cpfUsuario=" + cpfUsuario + ", usuario=" + usuario + ", login=" + login + ", senha=" + senha
				+ "]";
	}

	

}
