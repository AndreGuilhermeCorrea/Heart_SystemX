package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.heartSystemX.controller.impl.FormUsuarioCT;

public class FormUsuarioSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private FormUsuarioCT controller;

	private JButton btProcuraUsuario, btSaveUser, btCancel, btExcluir, btAtualiza;
	private JLabel lbUsuario, lbNome, lbSenha, lbCpf;
	private JTextField tfNomeUsuario, tfUsuario, tfUsuarioCPF;
	private JPasswordField tfNewSenhaUser;

	MaskFormatter mascaraCPF = null;

	//gether's
	public JButton getBtProcuraUsuario() {
		return btProcuraUsuario;
	}

	public JButton getBtSaveUser() {
		return btSaveUser;
	}

	public JButton getBtCancel() {
		return btCancel;
	}

	public JButton getBtExcluir() {
		return btExcluir;
	}

	public JTextField getTfNomeUsuario() {
		return tfNomeUsuario;
	}

	public JTextField getTfUsuario() {
		return tfUsuario;
	}

	public JTextField getTfUsuarioCPF() {
		return tfUsuarioCPF;
	}

	public JPasswordField getTfNewSenhaUser() {
		return tfNewSenhaUser;
	}

	public FormUsuarioSwing() {
		initialize();
		this.controller = new FormUsuarioCT();
	}

	private void initialize() {

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 518, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - LogDesSaude/Usuário ");
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbCpf = new JLabel("CPF");
		lbCpf.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbCpf.setBounds(268, 38, 51, 22);
		contentPane.add(lbCpf);

		lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbUsuario.setBounds(268, 66, 51, 22);
		contentPane.add(lbUsuario);

		lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbSenha.setBounds(268, 94, 45, 22);
		contentPane.add(lbSenha);

		lbNome = new JLabel("Nome Completo");
		lbNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbNome.setBounds(9, 10, 123, 22);
		contentPane.add(lbNome);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfUsuarioCPF = new JFormattedTextField(mascaraCPF);
		} catch (Exception e) {
		}

		tfUsuarioCPF.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfUsuarioCPF.setBounds(329, 38, 162, 22);
		contentPane.add(tfUsuarioCPF);

		tfNomeUsuario = new JTextField();
		tfNomeUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNomeUsuario.setBounds(109, 10, 382, 22);
		contentPane.add(tfNomeUsuario);

		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfUsuario.setBounds(328, 66, 163, 22);
		contentPane.add(tfUsuario);

		tfNewSenhaUser = new JPasswordField();
		tfNewSenhaUser.setBounds(329, 94, 162, 22);
		contentPane.add(tfNewSenhaUser);

		btProcuraUsuario = new JButton();
		btProcuraUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickBusca();
			}
		});
		btProcuraUsuario.setIcon(new ImageIcon(
				FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/MetroUI-Other-Search-icon.png")));
		btProcuraUsuario.setBounds(207, 50, 51, 50);
		contentPane.add(btProcuraUsuario);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsert();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(409, 127, 36, 41);
		contentPane.add(btSaveUser);

		btCancel = new JButton();
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evtSair) {
				int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Sair?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		btCancel.setIcon(new ImageIcon(FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(455, 127, 36, 41);
		contentPane.add(btCancel);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Remover o Usuário?",
						"Atenção! Essa ação não pode ser desfeita!", JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					onClickDelete();
				}
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(363, 127, 36, 41);
		contentPane.add(btExcluir);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza
				.setIcon(new ImageIcon(FormUsuarioSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(317, 127, 36, 41);
		contentPane.add(btAtualiza);

	}

	private void onClickInsert() {
		try {
			controller.inserir(this);
		} catch (Exception e) {

		}
	}

	private void onClickDelete() {
		try {
			controller.deletar(this);
		} catch (Exception e) {

		}
	}

	private void onClickAtualiza() {
		try {
			controller.atualizar(this);
		} catch (Exception e) {

		}
	}

	private void onClickBusca() {
		try {
			controller.buscaObj(this);
		} catch (Exception e) {

		}
	}
}
