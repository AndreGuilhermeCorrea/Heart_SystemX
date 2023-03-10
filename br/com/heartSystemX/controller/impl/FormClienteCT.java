package br.com.heartSystemX.controller.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.com.heartSystemX.controller.Icontroller;
import br.com.heartSystemX.model.entities.Cliente;
import br.com.heartSystemX.model.service.impl.ClienteService;
import br.com.heartSystemX.view.FormClienteSwing;

public class FormClienteCT implements Icontroller {

	private FormClienteSwing frame;
	private Cliente objClient;
	private ClienteService servicoClient;

	// envia solicitação para camada de serviço e retorna objeto carregado
	private Cliente findByCpf(String cpf) {
		this.servicoClient = new ClienteService();
		objClient = servicoClient.pesquisaView(cpf);
		return objClient;
	}

	@Override
	// pesquisa cliente cadastrado
	public void pesquisaCpf(Object view) {
		frame = (FormClienteSwing) view;
		String cpf = frame.getTfCPFCliente().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			// chama o método de pesquisa do cliente passando o cpf
			findByCpf(cpf);
			// chamada do método
			frame = instanciaForm(objClient);
		}
	}

	@Override
	public void inserir(Object view) {
		frame = (FormClienteSwing) view;
		String cpf = frame.getTfCPFCliente().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			// chamada do método
			this.objClient = instanciaOBJ(frame);
			// envia solicitação para camada de serviço com objeto carregado
			servicoClient = new ClienteService();
			servicoClient.insert(objClient);
			// chama o metodo para anular os tf passando o frame como objeto
			setarNullFrame(frame);
		}
	}

	// atualiza cliente nessa tabela com base no objeto passado para camada de
	// servico
	@Override
	public void atualizar(Object view) {
		frame = (FormClienteSwing) view;
		String cpf = frame.getTfCPFCliente().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o Cliente dessa tabela?",
					"Atenção! Essa ação não pode ser desfeita!", JOptionPane.YES_NO_OPTION);
			if (sai == JOptionPane.YES_OPTION) {
				// chamada do método
				this.objClient = instanciaOBJ(frame);
				// envia solicitação para camada de serviço com objeto carregado
				this.servicoClient.update(objClient);
				// chama o metodo para anular os tf passando o frame como objeto
				setarNullFrame(frame);
			}
		}
	}

	// deleta o cliente com base no cpf passado para camada de servico
	@Override
	public void deletar(Object view) {
		frame = (FormClienteSwing) view;
		String cpf = frame.getTfCPFCliente().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Remover o Cliente dessa tabela?",
					"Atenção! Essa ação não pode ser desfeita!", JOptionPane.YES_NO_OPTION);
			if (sai == JOptionPane.YES_OPTION) {
				// envia solicitação para camada de serviço
				this.servicoClient.deleteByCpf(cpf);
				// chama o metodo para anular os tf passando o frame como objeto
				setarNullFrame(frame);
			}
		}
	}

	// pesquisa cliente ja cadastrado nessa tabela e retorna o objeto
	@Override
	public void buscaObj(Object view) {
		frame = (FormClienteSwing) view;
		String cpf = frame.getTfCPFCliente().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else
			// chama o método de pesquisa do cliente passando o cpf
			findByCpf(cpf);
			// chamada do método
			frame = instanciaForm(objClient);
		
	}

	// metodo para formatar inteiro em string
	private String intFormat(Integer intA) {
		String saida = Integer.toString(intA);
		return saida;
	}

	// metodo para formatar string em inteiro
	private Integer intFormat2(String intA) {
		Integer saida = Integer.parseInt(intA);
		return saida;
	}

	// método seta o objeto com o frame passado
	private Cliente instanciaOBJ(FormClienteSwing frame) {
		this.objClient = new Cliente();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		objClient.setCpfCliente(frame.getTfCPFCliente().getText());
		objClient.setNomeCompleto(frame.getTfNomeCompleto().getText());
		objClient.setRg(frame.getTfRG().getText());
		objClient.setCartaosus(frame.getTfCartaoSUS().getText());
		objClient.setNaturalidade(frame.getTfNaturalidade().getText());
		objClient.setNacionalidade(frame.getTfNacionalidade().getText());
		objClient.setRaca(frame.getTfRaca().getText());
		objClient.setGenero(frame.getTfGenero().getText());
		objClient.setReligião(frame.getTfReligiao().getText());
		objClient.setNomemae(frame.getTfMae().getText());
		objClient.setEmail(frame.getTfEmail().getText());
		objClient.setEscolaridade(frame.getTfEscolaridade().getText());
		objClient.setTelefonecontato(frame.getTfCel().getText());
		objClient.setEndereço(frame.getTfEndereco().getText());
		objClient.setNumero(intFormat2(frame.getTfEndNum().getText()));
		objClient.setComplemento(frame.getTfComplemento().getText());
		objClient.setBairro(frame.getTfBairro().getText());
		objClient.setCidade(frame.getTfCidade().getText());
		objClient.setCep(frame.getTfCEP().getText());
		objClient.setEstado(frame.getTfUF().getText());
		objClient.setIdade(intFormat2(frame.getTfIdade().getText()));
		try {
			objClient.setNascimento(formato.parse(frame.getTfDtNasc().getText()));
			objClient.setDatacadastro(formato.parse(frame.getTfDtCadastro().getText()));
		} catch (ParseException e) {

		}
		return objClient;
	}

	// método seta o Frame com o objeto passado
	private FormClienteSwing instanciaForm(Cliente objClient) {
		// formato da data
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		// seta os textfields com os dados do DB de acordo com a pesquisa do cpf
		frame.getTfNomeCompleto().setText(objClient.getNomeCompleto());
		frame.getTfRG().setText(objClient.getRg());
		frame.getTfDtNasc().setText(formato.format(objClient.getNascimento()));
		frame.getTfCartaoSUS().setText(objClient.getCartaosus());
		frame.getTfNaturalidade().setText(objClient.getNaturalidade());
		frame.getTfNacionalidade().setText(objClient.getNacionalidade());
		frame.getTfRaca().setText(objClient.getRaca());
		frame.getTfGenero().setText(objClient.getGenero());
		frame.getTfReligiao().setText(objClient.getReligião());
		frame.getTfMae().setText(objClient.getNomemae());
		frame.getTfEmail().setText(objClient.getEmail());
		frame.getTfEscolaridade().setText(objClient.getEscolaridade());
		frame.getTfCel().setText(objClient.getTelefonecontato());
		frame.getTfEndereco().setText(objClient.getEndereço());
		frame.getTfEndNum().setText(intFormat(objClient.getNumero()));
		frame.getTfComplemento().setText(objClient.getComplemento());
		frame.getTfBairro().setText(objClient.getBairro());
		frame.getTfCidade().setText(objClient.getCidade());
		frame.getTfCEP().setText(objClient.getCep());
		frame.getTfUF().setText(objClient.getEstado());
		frame.getTfDtCadastro().setText(formato.format(objClient.getDatacadastro()));
		return frame;
	}

	private void setarNullFrame(FormClienteSwing frame) {
		frame.getTfNomeCompleto().setText("");
		frame.getTfCPFCliente().setText("");
		frame.getTfRG().setText("");
		frame.getTfIdade().setText("");
		frame.getTfDtNasc().setText("");
		frame.getTfCartaoSUS().setText("");
		frame.getTfNaturalidade().setText("");
		frame.getTfNacionalidade().setText("");
		frame.getTfRaca().setText("");
		frame.getTfGenero().setText("");
		frame.getTfReligiao().setText("");
		frame.getTfMae().setText("");
		frame.getTfEmail().setText("");
		frame.getTfEscolaridade().setText("");
		frame.getTfCel().setText("");
		frame.getTfEndereco().setText("");
		frame.getTfEndNum().setText("");
		frame.getTfComplemento().setText("");
		frame.getTfBairro().setText("");
		frame.getTfCidade().setText("");
		frame.getTfCEP().setText("");
		frame.getTfUF().setText("");
		frame.getTfDtCadastro().setText("");

	}
}
