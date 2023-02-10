package br.com.heartSystemX.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ClienteView implements Serializable {
	private static final long serialVersionUID = 1L;

	// atributos
	private String cpfCliente;
	private String nomeCompleto;
	private Integer idade;
	private Date nascimento;
	private String genero;
	
	// construtor padrão
	public ClienteView() {
	}
	
	// construtor com argumentos
	public ClienteView(String cpfCliente, String nomeCompleto, Integer idade, Date nascimento, String genero) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	
	// gethers e sethers
	public String getCpfCliente() {
		return cpfCliente;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public Integer getIdade() {
		return idade;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// hash cod e equals para que os objetos possam ser comparados pelo CPF
	@Override
	public int hashCode() {
		return Objects.hash(cpfCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteView other = (ClienteView) obj;
		return Objects.equals(cpfCliente, other.cpfCliente);
	}

	// toString
	@Override
	public String toString() {
		return "ClienteView [cpfCliente=" + cpfCliente + ", nomeCompleto=" + nomeCompleto + ", idade=" + idade
				+ ", nascimento=" + nascimento + ", genero=" + genero + "]";
	}

	
	
}
