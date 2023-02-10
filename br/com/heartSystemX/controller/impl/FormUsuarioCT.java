package br.com.heartSystemX.controller.impl;

import javax.swing.JOptionPane;
import br.com.heartSystemX.controller.Icontroller;
import br.com.heartSystemX.model.entities.Usuario;
import br.com.heartSystemX.model.service.UsuarioService;
import br.com.heartSystemX.view.FormUsuarioSwing;

public class FormUsuarioCT implements Icontroller {
	private Usuario objUser;
	private UsuarioService servicoUser;
	private FormUsuarioSwing frame;


	// envia solicitação para camada de serviço e retorna objeto carregado
	private Usuario findByCpf(String cpf) {
		this.servicoUser = new UsuarioService();
		objUser = servicoUser.pesquisaView(cpf);
		return objUser;
	}

	@Override
	public void pesquisaCpf(Object view) {
		frame = (FormUsuarioSwing) view;
		String cpf = frame.getTfUsuarioCPF().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			// chama o método de pesquisa do cliente passando o cpf
			findByCpf(cpf);
			// chamada do método
			frame = instanciaForm(objUser);
		}
	}

	@Override
	public void inserir(Object view) {
		frame = (FormUsuarioSwing) view;
		String cpf = frame.getTfUsuarioCPF().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			this.objUser = instanciaOBJ(frame);
			this.servicoUser = new UsuarioService();
			servicoUser.insert(objUser);
			// chama o metodo para anular os tf passando o frame como objeto
			setarNullFrame(frame);
		}
	}

	@Override
	public void atualizar(Object view) {
		frame = (FormUsuarioSwing) view;
		String cpf = frame.getTfUsuarioCPF().getText();
		// teste para cpf nao nulo
		if (cpf.equals("___.___.___-__")) {
			JOptionPane.showMessageDialog(null, "O Campo CPF nao Pode ser Nulo!");
		} else {
			int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o Usuário dessa tabela?",
					"Atenção! Essa ação não pode ser desfeita!", JOptionPane.YES_NO_OPTION);
			if (sai == JOptionPane.YES_OPTION) {
				// chamada do método
				this.objUser = instanciaOBJ(frame);
				// envia solicitação para camada de serviço com objeto carregado
				this.servicoUser = new UsuarioService();
				servicoUser.update(objUser);
				// chama o metodo para anular os tf passando o frame como objeto
				setarNullFrame(frame);
			}
		}
	}

	@Override
	public void deletar(Object view) {
		frame = (FormUsuarioSwing) view;
		String cpf = frame.getTfUsuarioCPF().getText();
		int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Remover o Usuário dessa tabela?",
				"Atenção! Essa ação não pode ser desfeita!", JOptionPane.YES_NO_OPTION);
		if (sai == JOptionPane.YES_OPTION) {
			this.servicoUser = new UsuarioService();
			servicoUser.deleteByCpf(cpf);
			// chama o metodo para anular os tf passando o frame como objeto
			setarNullFrame(frame);
		}
	}

	// pesquisa usuario ja cadastrado nessa tabela e retorna o objeto
	@Override
	public void buscaObj(Object view) {
		frame = (FormUsuarioSwing) view;
		String cpf = frame.getTfUsuarioCPF().getText();
		// chama o método de pesquisa do cliente passando o cpf
		findByCpf(cpf);
		// chamada do método
		frame = instanciaForm(objUser);
	}
	
	// método seta o objeto com o frame passado
	private Usuario instanciaOBJ(FormUsuarioSwing frame) {
		this.objUser = new Usuario();
		objUser.setCpfUsuario(frame.getTfUsuarioCPF().getText());
		objUser.setUsuario(frame.getTfNomeUsuario().getText());
		objUser.setLogin(frame.getTfUsuario().getText());
		objUser.setSenha(new String(frame.getTfNewSenhaUser().getPassword()));
		return objUser;
	}
	
	// método seta o Frame com o objeto passado
	private FormUsuarioSwing instanciaForm(Usuario objUser) {
		frame.getTfUsuarioCPF().setText(objUser.getCpfUsuario());
		frame.getTfNomeUsuario().setText(objUser.getUsuario());
		frame.getTfUsuario().setText(objUser.getLogin());
		return frame;
	}
	
	// método seta o frame com nulo
	private void setarNullFrame(FormUsuarioSwing frame) {
		frame.getTfUsuarioCPF().setText("");
		frame.getTfNomeUsuario().setText("");
		frame.getTfUsuario().setText("");
		frame.getTfNewSenhaUser().setText("");
	}
}
