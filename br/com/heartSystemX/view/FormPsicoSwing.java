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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.heartSystemX.controller.impl.FormPsicoCT;
import br.com.heartSystemX.utils.MasksSwing;

public class FormPsicoSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	MaskFormatter mascaraCPF, mascaraData = null;
	MasksSwing defTamECa = new MasksSwing();

	private FormPsicoCT controller;

	private JTextField tfCPFPsico, tfNomePsico, tfPsico1, tfPsico2, tfPsico3, tfPsico4, tfPsico5, tfPsico6, tfPsico7,
			tfPsico8, tfPsico9, tfPsico10, tfPsico11, tfPsico12, tfPsico13, tfPsico14, tfPsico15, tfPsico16, tfPsico17,
			tfPsico18, tfPsico19, tfPsico20, tfPsico21, tfPsico22, tfPsico23, tfPsico24, tfDtCadPsico;

	private JButton btLocaliza, btAtualiza, btExcluir, btSaveUser, btCancel;

	private JLabel lblCpfPsico, lblPsico1, lblPsico2, lblPsico3, lblPsico4, lblPsico5, lblPsico6, lblPsico7, lblPsico8,
			lblPsico9, lblPsico10, lblPsico11, lblPsico12, lblPsico13, lblPsico14, lblPsico15, lblPsico16, lblPsico17,
			lblPsico18, lblPsico19, lblPsico20, lblPsico21, lblPsico22, lblPsico23, lblPsico24, lbIDt, lblS, lblN,
			lbIcon;

	//gether's
	public JTextField getTfCPFPsico() {
		return tfCPFPsico;
	}

	public JTextField getTfNomePsico() {
		return tfNomePsico;
	}

	public JTextField getTfPsico1() {
		return tfPsico1;
	}

	public JTextField getTfPsico2() {
		return tfPsico2;
	}

	public JTextField getTfPsico3() {
		return tfPsico3;
	}

	public JTextField getTfPsico4() {
		return tfPsico4;
	}

	public JTextField getTfPsico5() {
		return tfPsico5;
	}

	public JTextField getTfPsico6() {
		return tfPsico6;
	}

	public JTextField getTfPsico7() {
		return tfPsico7;
	}

	public JTextField getTfPsico8() {
		return tfPsico8;
	}

	public JTextField getTfPsico9() {
		return tfPsico9;
	}

	public JTextField getTfPsico10() {
		return tfPsico10;
	}

	public JTextField getTfPsico11() {
		return tfPsico11;
	}

	public JTextField getTfPsico12() {
		return tfPsico12;
	}

	public JTextField getTfPsico13() {
		return tfPsico13;
	}

	public JTextField getTfPsico14() {
		return tfPsico14;
	}

	public JTextField getTfPsico15() {
		return tfPsico15;
	}

	public JTextField getTfPsico16() {
		return tfPsico16;
	}

	public JTextField getTfPsico17() {
		return tfPsico17;
	}

	public JTextField getTfPsico18() {
		return tfPsico18;
	}

	public JTextField getTfPsico19() {
		return tfPsico19;
	}

	public JTextField getTfPsico20() {
		return tfPsico20;
	}

	public JTextField getTfPsico21() {
		return tfPsico21;
	}

	public JTextField getTfPsico22() {
		return tfPsico22;
	}

	public JTextField getTfPsico23() {
		return tfPsico23;
	}

	public JTextField getTfPsico24() {
		return tfPsico24;
	}

	public JTextField getTfDtCadPsico() {
		return tfDtCadPsico;
	}

	public FormPsicoSwing() {
		initialize();
		this.controller = new FormPsicoCT();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Hist. Psico");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lblCpfPsico = new JLabel("CPF");
		lblCpfPsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCpfPsico.setBounds(10, 13, 32, 14);
		contentPane.add(lblCpfPsico);

		lblPsico1 = new JLabel("01- Interesse em acompanhamento Psicológico?");
		lblPsico1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico1.setBounds(10, 48, 370, 14);
		contentPane.add(lblPsico1);

		lblPsico2 = new JLabel("02- Possui alguma patologia limitante para exercicio do Programa?");
		lblPsico2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico2.setBounds(10, 75, 370, 14);
		contentPane.add(lblPsico2);

		lblPsico3 = new JLabel("03- Possui sentimento de tristeza com frequencia?");
		lblPsico3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico3.setBounds(10, 101, 370, 14);
		contentPane.add(lblPsico3);

		lblPsico4 = new JLabel("04- Possui sentimento de solidão com frequencia?");
		lblPsico4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico4.setBounds(10, 129, 370, 14);
		contentPane.add(lblPsico4);

		lblPsico5 = new JLabel("05- Possui algum transtorno?");
		lblPsico5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico5.setBounds(10, 157, 370, 14);
		contentPane.add(lblPsico5);

		lblPsico6 = new JLabel("06- Os pensamentos são organizados?");
		lblPsico6.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico6.setBounds(10, 184, 370, 14);
		contentPane.add(lblPsico6);

		lblPsico7 = new JLabel("07- A linguagem e o diálogo são claros? ");
		lblPsico7.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico7.setBounds(10, 210, 370, 14);
		contentPane.add(lblPsico7);

		lblPsico8 = new JLabel("08- Possui dificuldade de concentração?");
		lblPsico8.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico8.setBounds(10, 238, 370, 14);
		contentPane.add(lblPsico8);

		lblPsico9 = new JLabel("09- Possui dificuldade de memorizar?");
		lblPsico9.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico9.setBounds(10, 264, 370, 14);
		contentPane.add(lblPsico9);

		lblPsico10 = new JLabel("10- Faz acompanhamento com psicológo ou psiquiatra? ");
		lblPsico10.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico10.setBounds(10, 292, 370, 14);
		contentPane.add(lblPsico10);

		lblPsico11 = new JLabel("11- Já fez acompanhamento com psicológo ou psiquiatra?");
		lblPsico11.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico11.setBounds(10, 317, 370, 14);
		contentPane.add(lblPsico11);

		lblPsico12 = new JLabel("12- Sente-se Amado ou acolhido por Amigos e/ou Familiares? ");
		lblPsico12.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico12.setBounds(10, 343, 370, 14);
		contentPane.add(lblPsico12);

		lblPsico13 = new JLabel("13- Dorme bem?");
		lblPsico13.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico13.setBounds(429, 45, 260, 14);
		contentPane.add(lblPsico13);

		lblPsico14 = new JLabel("14- Se Automedica?");
		lblPsico14.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico14.setBounds(429, 72, 260, 14);
		contentPane.add(lblPsico14);

		lblPsico15 = new JLabel("15- Faz uso elevado de Álcool?");
		lblPsico15.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico15.setBounds(429, 98, 260, 14);
		contentPane.add(lblPsico15);

		lblPsico16 = new JLabel("16- Faz uso de Drogas?");
		lblPsico16.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico16.setBounds(429, 126, 260, 14);
		contentPane.add(lblPsico16);

		lblPsico17 = new JLabel("17- Possui bom relacionamento Familiar?");
		lblPsico17.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico17.setBounds(429, 154, 260, 14);
		contentPane.add(lblPsico17);

		lblPsico18 = new JLabel("18- Possui bom relacionamento Social? ");
		lblPsico18.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico18.setBounds(429, 181, 260, 14);
		contentPane.add(lblPsico18);

		lblPsico19 = new JLabel("19- Pratica atividade física?");
		lblPsico19.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico19.setBounds(429, 207, 260, 14);
		contentPane.add(lblPsico19);

		lblPsico20 = new JLabel("20- Possui planos para o futuro?");
		lblPsico20.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico20.setBounds(429, 235, 260, 14);
		contentPane.add(lblPsico20);

		lblPsico21 = new JLabel("21- Pra voce a vida vale a pena?");
		lblPsico21.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico21.setBounds(429, 261, 260, 14);
		contentPane.add(lblPsico21);

		lblPsico22 = new JLabel("22- Caso a morte surgisse ela seria bem vinda?");
		lblPsico22.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico22.setBounds(429, 286, 260, 14);
		contentPane.add(lblPsico22);

		lblPsico23 = new JLabel("23- Já cogitou se machucar/ferir/morrer?");
		lblPsico23.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico23.setBounds(429, 312, 260, 14);
		contentPane.add(lblPsico23);

		lblPsico24 = new JLabel("24- Já tentou suícidio?");
		lblPsico24.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsico24.setBounds(429, 340, 260, 14);
		contentPane.add(lblPsico24);

		lbIDt = new JLabel("Data Cadastro");
		lbIDt.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbIDt.setBounds(547, 390, 86, 22);
		contentPane.add(lbIDt);

		lblS = new JLabel("S para Sim");
		lblS.setFont(new Font("Trebuchet MS", Font.PLAIN, 9));
		lblS.setEnabled(false);
		lblS.setBounds(10, 417, 68, 14);
		contentPane.add(lblS);

		lblN = new JLabel("N para Não");
		lblN.setFont(new Font("Trebuchet MS", Font.PLAIN, 9));
		lblN.setEnabled(false);
		lblN.setBounds(10, 436, 68, 14);
		contentPane.add(lblN);

		lbIcon = new JLabel("");
		lbIcon.setIcon(new ImageIcon(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/medical-mobile-80.png")));
		lbIcon.setBounds(94, 378, 68, 72);
		contentPane.add(lbIcon);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCPFPsico = new JFormattedTextField(mascaraCPF);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error!: " + e.getMessage());
		}

		tfCPFPsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCPFPsico.setBounds(47, 9, 170, 19);
		contentPane.add(tfCPFPsico);

		tfNomePsico = new JTextField("Nome Cliente");
		tfNomePsico.setEditable(false);
		tfNomePsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNomePsico.setBounds(262, 9, 307, 18);
		contentPane.add(tfNomePsico);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadPsico = new JFormattedTextField(mascaraData);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}
		tfDtCadPsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfDtCadPsico.setBounds(638, 389, 86, 19);
		contentPane.add(tfDtCadPsico);

		tfPsico1 = new JTextField();
		tfPsico1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico1 = defTamECa.tamTipCarac(1, "SN");
		tfPsico1.setBounds(377, 42, 42, 20);
		contentPane.add(tfPsico1);

		tfPsico2 = new JTextField();
		tfPsico2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico2 = defTamECa.tamTipCarac(1, "SN");
		tfPsico2.setBounds(377, 69, 42, 20);
		contentPane.add(tfPsico2);

		tfPsico3 = new JTextField();
		tfPsico3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico3 = defTamECa.tamTipCarac(1, "SN");
		tfPsico3.setBounds(377, 95, 42, 20);
		contentPane.add(tfPsico3);

		tfPsico4 = new JTextField();
		tfPsico4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico4 = defTamECa.tamTipCarac(1, "SN");
		tfPsico4.setBounds(377, 123, 42, 20);
		contentPane.add(tfPsico4);

		tfPsico5 = new JTextField();
		tfPsico5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico5 = defTamECa.tamTipCarac(1, "SN");
		tfPsico5.setBounds(377, 151, 42, 20);
		contentPane.add(tfPsico5);

		tfPsico6 = new JTextField();
		tfPsico6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico6 = defTamECa.tamTipCarac(1, "SN");
		tfPsico6.setBounds(377, 178, 42, 20);
		contentPane.add(tfPsico6);

		tfPsico7 = new JTextField();
		tfPsico7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico7 = defTamECa.tamTipCarac(1, "SN");
		tfPsico7.setBounds(377, 204, 42, 20);
		contentPane.add(tfPsico7);

		tfPsico8 = new JTextField();
		tfPsico8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico8 = defTamECa.tamTipCarac(1, "SN");
		tfPsico8.setBounds(377, 232, 42, 20);
		contentPane.add(tfPsico8);

		tfPsico9 = new JTextField();
		tfPsico9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico9 = defTamECa.tamTipCarac(1, "SN");
		tfPsico9.setBounds(377, 258, 42, 20);
		contentPane.add(tfPsico9);

		tfPsico10 = new JTextField();
		tfPsico10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico10 = defTamECa.tamTipCarac(1, "SN");
		tfPsico10.setBounds(377, 286, 42, 20);
		contentPane.add(tfPsico10);

		tfPsico11 = new JTextField();
		tfPsico11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico11 = defTamECa.tamTipCarac(1, "SN");
		tfPsico11.setBounds(377, 311, 42, 20);
		contentPane.add(tfPsico11);

		tfPsico12 = new JTextField();
		tfPsico12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico12 = defTamECa.tamTipCarac(1, "SN");
		tfPsico12.setBounds(377, 337, 42, 20);
		contentPane.add(tfPsico12);

		tfPsico13 = new JTextField();
		tfPsico13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico13 = defTamECa.tamTipCarac(1, "SN");
		tfPsico13.setBounds(699, 39, 42, 20);
		contentPane.add(tfPsico13);

		tfPsico14 = new JTextField();
		tfPsico14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico14 = defTamECa.tamTipCarac(1, "SN");
		tfPsico14.setBounds(699, 66, 42, 20);
		contentPane.add(tfPsico14);

		tfPsico15 = new JTextField();
		tfPsico15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico15 = defTamECa.tamTipCarac(1, "SN");
		tfPsico15.setBounds(699, 92, 42, 20);
		contentPane.add(tfPsico15);

		tfPsico16 = new JTextField();
		tfPsico16.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico16 = defTamECa.tamTipCarac(1, "SN");
		tfPsico16.setBounds(699, 120, 42, 20);
		contentPane.add(tfPsico16);

		tfPsico17 = new JTextField();
		tfPsico17.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico17 = defTamECa.tamTipCarac(1, "SN");
		tfPsico17.setBounds(699, 148, 42, 20);
		contentPane.add(tfPsico17);

		tfPsico18 = new JTextField();
		tfPsico18.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico18 = defTamECa.tamTipCarac(1, "SN");
		tfPsico18.setBounds(699, 175, 42, 20);
		contentPane.add(tfPsico18);

		tfPsico19 = new JTextField();
		tfPsico19.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico19 = defTamECa.tamTipCarac(1, "SN");
		tfPsico19.setBounds(699, 201, 42, 20);
		contentPane.add(tfPsico19);

		tfPsico20 = new JTextField();
		tfPsico20.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico20 = defTamECa.tamTipCarac(1, "SN");
		tfPsico20.setBounds(699, 229, 42, 20);
		contentPane.add(tfPsico20);

		tfPsico21 = new JTextField();
		tfPsico21.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico21 = defTamECa.tamTipCarac(1, "SN");
		tfPsico21.setBounds(699, 255, 42, 20);
		contentPane.add(tfPsico21);

		tfPsico22 = new JTextField();
		tfPsico22.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico22 = defTamECa.tamTipCarac(1, "SN");
		tfPsico22.setBounds(699, 283, 42, 20);
		contentPane.add(tfPsico22);

		tfPsico23 = new JTextField();
		tfPsico23.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico23 = defTamECa.tamTipCarac(1, "SN");
		tfPsico23.setBounds(699, 308, 42, 20);
		contentPane.add(tfPsico23);

		tfPsico24 = new JTextField();
		tfPsico24.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsico24 = defTamECa.tamTipCarac(1, "SN");
		tfPsico24.setBounds(699, 334, 42, 20);
		contentPane.add(tfPsico24);

		btLocaliza = new JButton();
		btLocaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesq();
				onClickCarregaObj();
			}
		});
		btLocaliza.setIcon(new ImageIcon(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/lupaBranca.png")));
		btLocaliza.setBounds(227, 5, 32, 23);
		contentPane.add(btLocaliza);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza.setIcon(new ImageIcon(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(580, 424, 36, 41);
		contentPane.add(btAtualiza);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(626, 424, 36, 41);
		contentPane.add(btExcluir);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsert();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(672, 424, 36, 41);
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
		btCancel.setIcon(new ImageIcon(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(718, 424, 36, 41);
		contentPane.add(btCancel);
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

	private void onClickInsert() {
		try {
			controller.inserir(this);
		} catch (Exception e) {

		}
	}

	private void onClickCarregaObj() {
		try {
			controller.buscaObj(this);
		} catch (Exception e) {

		}
	}

}
