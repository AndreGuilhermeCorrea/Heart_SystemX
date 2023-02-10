package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.heartSystemX.controller.impl.FormClienteCT;
import br.com.heartSystemX.utils.MasksSwing;

public class FormClienteSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private FormClienteCT controller;

	MaskFormatter mascaraCPF, mascaraCEL, mascaraCEP, mascaraData = null;
	MasksSwing defTamECa = new MasksSwing();

	private JTextField tfCPFCliente, tfDtNasc, tfCel, tfCEP, tfDtCadastro, tfNomeCompleto, tfCartaoSUS, tfRaca,
			tfGenero, tfRG, tfEmail, tfEscolaridade, tfReligiao, tfMae, tfEndereco, tfComplemento, tfCidade, tfBairro,
			tfEndNum, tfNaturalidade, tfNacionalidade, tfUF, tfIdade;

	private JLabel lblNomeCompleto, lblCSUS, lblRaca, lblDtNasc, lblIdade, lblGenero, lblRg, lblCpf, lblCel, lblNomeMae,
			lblEnd, lblComp, lblCidade, lblBairro, lblNum, lblNaturalidade, lblNascionalidade, lblUf, lblCep, lbDt,
			lbIcon, lblEmail, lblEscolaridade, lblReligiao;

	private JButton btAtualiza, btExcluir, btSaveUser, btCancel, btLocaliza;

	//gether's
	public JTextField getTfNomeCompleto() {
		return tfNomeCompleto;
	}

	public JTextField getTfCartaoSUS() {
		return tfCartaoSUS;
	}

	public JTextField getTfRaca() {
		return tfRaca;
	}

	public JTextField getTfGenero() {
		return tfGenero;
	}

	public JTextField getTfRG() {
		return tfRG;
	}

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public JTextField getTfEscolaridade() {
		return tfEscolaridade;
	}

	public JTextField getTfReligiao() {
		return tfReligiao;
	}

	public JTextField getTfMae() {
		return tfMae;
	}

	public JTextField getTfEndereco() {
		return tfEndereco;
	}

	public JTextField getTfComplemento() {
		return tfComplemento;
	}

	public JTextField getTfCidade() {
		return tfCidade;
	}

	public JTextField getTfBairro() {
		return tfBairro;
	}

	public JTextField getTfEndNum() {
		return tfEndNum;
	}

	public JTextField getTfNaturalidade() {
		return tfNaturalidade;
	}

	public JTextField getTfNacionalidade() {
		return tfNacionalidade;
	}

	public JTextField getTfUF() {
		return tfUF;
	}

	public JTextField getTfCPFCliente() {
		return tfCPFCliente;
	}

	public JTextField getTfDtCadastro() {
		return tfDtCadastro;
	}

	public JTextField getTfDtNasc() {
		return tfDtNasc;
	}

	public JTextField getTfCel() {
		return tfCel;
	}

	public JTextField getTfCEP() {
		return tfCEP;
	}

	public JTextField getTfIdade() {
		return tfIdade;
	}

	public FormClienteSwing() {
		initialize();
		this.controller = new FormClienteCT();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Cliente");
		setBounds(100, 100, 730, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setBounds(10, 13, 112, 15);
		lblNomeCompleto.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lblNomeCompleto);

		lblCSUS = new JLabel("Cartão SUS");
		lblCSUS.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCSUS.setBounds(10, 87, 74, 15);
		contentPane.add(lblCSUS);

		lblRaca = new JLabel("Raça");
		lblRaca.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblRaca.setBounds(10, 132, 82, 15);
		contentPane.add(lblRaca);

		lblDtNasc = new JLabel("Data Nasc.");
		lblDtNasc.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblDtNasc.setBounds(10, 52, 88, 15);
		contentPane.add(lblDtNasc);

		lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblIdade.setBounds(240, 52, 63, 15);
		contentPane.add(lblIdade);

		lblGenero = new JLabel("Genêro");
		lblGenero.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblGenero.setBounds(200, 132, 63, 15);
		contentPane.add(lblGenero);

		lblRg = new JLabel("RG");
		lblRg.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblRg.setBounds(449, 52, 33, 15);
		contentPane.add(lblRg);

		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCpf.setBounds(522, 13, 33, 15);
		contentPane.add(lblCpf);

		lblCel = new JLabel("Celular");
		lblCel.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCel.setBounds(495, 231, 60, 15);
		contentPane.add(lblCel);

		lblNomeMae = new JLabel("Nome da Mãe");
		lblNomeMae.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNomeMae.setBounds(240, 181, 87, 15);
		contentPane.add(lblNomeMae);

		lblEnd = new JLabel("Endereço");
		lblEnd.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblEnd.setBounds(10, 267, 70, 15);
		contentPane.add(lblEnd);

		lblComp = new JLabel("Compl.");
		lblComp.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblComp.setBounds(543, 267, 54, 15);
		contentPane.add(lblComp);

		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCidade.setBounds(249, 317, 54, 15);
		contentPane.add(lblCidade);

		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblBairro.setBounds(10, 317, 46, 15);
		contentPane.add(lblBairro);

		lblNum = new JLabel("N.");
		lblNum.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNum.setBounds(449, 267, 13, 15);
		contentPane.add(lblNum);

		lblNaturalidade = new JLabel("Naturalidade");
		lblNaturalidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNaturalidade.setBounds(240, 92, 94, 15);
		contentPane.add(lblNaturalidade);

		lblNascionalidade = new JLabel("Nacionalidade");
		lblNascionalidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNascionalidade.setBounds(449, 92, 94, 15);
		contentPane.add(lblNascionalidade);

		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblUf.setBounds(611, 317, 23, 15);
		contentPane.add(lblUf);

		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCep.setBounds(449, 317, 46, 15);
		contentPane.add(lblCep);

		lbDt = new JLabel("Data Cadastro");
		lbDt.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbDt.setBounds(478, 370, 97, 15);
		contentPane.add(lbDt);

		lbIcon = new JLabel();
		lbIcon.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lbIcon.setHorizontalTextPosition(SwingConstants.RIGHT);
		lbIcon.setHorizontalAlignment(SwingConstants.RIGHT);
		lbIcon.setIcon(new ImageIcon(FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		lbIcon.setBounds(27, 370, 64, 64);
		contentPane.add(lbIcon);

		lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblEmail.setBounds(10, 227, 54, 22);
		contentPane.add(lblEmail);

		lblEscolaridade = new JLabel("Escolaridade");
		lblEscolaridade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblEscolaridade.setBounds(10, 181, 86, 15);
		contentPane.add(lblEscolaridade);

		lblReligiao = new JLabel("Religião");
		lblReligiao.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblReligiao.setBounds(422, 132, 82, 15);
		contentPane.add(lblReligiao);

		tfNomeCompleto = new JTextField();
		tfNomeCompleto.setBounds(124, 10, 364, 22);
		tfNomeCompleto.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfNomeCompleto);

		tfCartaoSUS = new JTextField();
		tfCartaoSUS.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCartaoSUS.setBounds(89, 85, 137, 22);
		contentPane.add(tfCartaoSUS);

		tfRaca = new JTextField();

		tfRaca.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfRaca.setBounds(64, 130, 126, 22);
		contentPane.add(tfRaca);

		tfGenero = new JTextField();

		tfGenero.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfGenero.setBounds(260, 130, 152, 22);
		contentPane.add(tfGenero);

		tfRG = new JTextField();

		tfRG.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfRG.setColumns(10);
		tfRG.setBounds(479, 45, 134, 22);
		contentPane.add(tfRG);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCPFCliente = new JFormattedTextField(mascaraCPF);
			tfCPFCliente.setBounds(559, 10, 129, 22);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error!: " + e.getMessage());
		}
		tfCPFCliente.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfCPFCliente);

		try {
			mascaraCEL = new MaskFormatter("(##)#####-####");
			mascaraCEL.setPlaceholderCharacter('_');
			tfCel = new JFormattedTextField(mascaraCEL);
			tfCel.setBounds(559, 225, 129, 22);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CEL Error!: " + e.getMessage());
		}
		tfCel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfCel);

		tfEmail = new JTextField();

		tfEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfEmail.setBounds(64, 225, 418, 22);
		contentPane.add(tfEmail);

		tfEscolaridade = new JTextField();

		tfEscolaridade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfEscolaridade.setBounds(104, 175, 126, 22);
		contentPane.add(tfEscolaridade);

		tfReligiao = new JTextField();

		tfReligiao.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfReligiao.setBounds(500, 130, 113, 22);
		contentPane.add(tfReligiao);

		tfMae = new JTextField();

		tfMae.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfMae.setBounds(337, 175, 351, 22);
		contentPane.add(tfMae);

		tfEndereco = new JTextField();

		tfEndereco.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfEndereco.setBounds(83, 265, 356, 22);
		contentPane.add(tfEndereco);

		tfComplemento = new JTextField();

		tfComplemento.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfComplemento.setBounds(601, 265, 87, 22);
		contentPane.add(tfComplemento);

		tfCidade = new JTextField();

		tfCidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCidade.setBounds(313, 315, 126, 22);
		contentPane.add(tfCidade);

		tfBairro = new JTextField();

		tfBairro.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfBairro.setBounds(66, 315, 173, 22);
		contentPane.add(tfBairro);

		tfEndNum = new JTextField();

		tfEndNum.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfEndNum.setBounds(473, 265, 60, 22);
		contentPane.add(tfEndNum);

		tfNaturalidade = new JTextField();

		tfNaturalidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNaturalidade.setBounds(327, 85, 112, 22);
		contentPane.add(tfNaturalidade);

		tfNacionalidade = new JTextField();

		tfNacionalidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNacionalidade.setBounds(554, 85, 134, 22);
		contentPane.add(tfNacionalidade);

		tfUF = new JTextField();
		tfUF = defTamECa.tamTipCarac(02,
				" AC, AL, AP, AM, BA, CE, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO, DF");
		tfUF.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfUF.setBounds(645, 315, 43, 22);
		contentPane.add(tfUF);

		try {
			mascaraCEP = new MaskFormatter("##.###-###");
			mascaraCEP.setPlaceholderCharacter('_');
			tfCEP = new JFormattedTextField(mascaraCEP);
			tfCEP.setBounds(495, 310, 97, 22);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CEP Error!: " + e.getMessage());

		}
		tfCEP.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfCEP);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtNasc = new JFormattedTextField(mascaraData);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}
		tfDtNasc.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfDtNasc.setBounds(89, 45, 86, 22);
		contentPane.add(tfDtNasc);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadastro = new JFormattedTextField(mascaraData);
			tfDtCadastro.setBounds(585, 368, 86, 22);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}
		tfDtCadastro.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfDtCadastro);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza
				.setIcon(new ImageIcon(FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(530, 409, 36, 41);
		contentPane.add(btAtualiza);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(576, 409, 36, 41);
		contentPane.add(btExcluir);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsere();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(622, 409, 36, 41);
		contentPane.add(btSaveUser);

		btCancel = new JButton();
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evtSair) {
				int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Cancelar?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		btCancel.setIcon(new ImageIcon(FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(668, 409, 36, 41);
		contentPane.add(btCancel);

		btLocaliza = new JButton();
		btLocaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesq();
				if(getTfDtNasc().getText().equals("__/__/____")) {
				}else {
					idade();
				}
			}
		});
		btLocaliza.setIcon(new ImageIcon(
				FormClienteSwing.class.getResource("/br/com/heartSystemX/icons/MetroUI-Other-Search-icon.png")));
		btLocaliza.setBounds(652, 43, 36, 35);
		contentPane.add(btLocaliza);

	}

	private void idade() {
		try {
			String dtNasc = tfDtNasc.getText();
			// variável string recebendo dtNasc
			String idade = MasksSwing.calcIdade(dtNasc);
			// textfield idade recebendo a variável idade
			tfIdade = new JTextField(idade);
			tfIdade.setEditable(false);
			tfIdade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			tfIdade.setBounds(313, 44, 31, 22);
			contentPane.add(tfIdade);
		} catch (ParseException e1) {
			JOptionPane.showMessageDialog(null, "Erro! Idade não calculada! Data inválida! " + e1.getMessage());
		}

	}

	private void onClickPesq() {
		try {
			controller.pesquisaCpf(this);
		} catch (Exception e) {

		}
	}

	private void onClickAtualiza() {
		try {
			controller.atualizar(this);
		} catch (Exception e) {

		}
	}

	private void onClickDelete() {
		try {
			controller.deletar(this);
		} catch (Exception e) {

		}
	}

	private void onClickInsere() {
		try {
			controller.inserir(this);
		} catch (Exception e) {

		}
	}

}
