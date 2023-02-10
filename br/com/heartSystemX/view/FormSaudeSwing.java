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

import br.com.heartSystemX.controller.impl.FormSaudeCT;
import br.com.heartSystemX.utils.MasksSwing;

public class FormSaudeSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	MaskFormatter mascaraData, mascaraCPF = null;
	MasksSwing defTamECa = new MasksSwing();

	private FormSaudeCT controller;

	private JTextField tfCPFClienteS, tfNomeCliente, tfDtCadastroS, tfS1, tfS2, tfS3, tfS4, tfS5, tfS6, tfS7, tfS8,
			tfS9, tfS10, tfS11, tfS12, tfS13, tfS14, tfS15, tfS16, tfS17, tfS18, tfS19, tfS20, tfS21, tfS22, tfS23,
			tfS24, tfS25, tfS26, tfS27, tfS28, tfS29, tfS30, tfS31;

	private JButton btLocaliza, btCancel, btSaveUser, btExcluir, btAtualiza;

	private JLabel lblCpf, lbDt, lblS1, lblS2, lblS3, lblS4, lblS5, lblS6, lblS7, lblS8, lblS9, lblS10, lblS11, lblS12,
			lblS13, lblS14, lblS15, lblS16, lblS17, lblS18, lblS19, lblS20, lblS21, lblS22, lblS23, lblS24, lblS25,
			lblS26, lblS27, lblS28, lblS29, lblS30, lblS31, lbS, lbN, lblIcon;

	public JTextField getTfCPFClienteS() {
		return tfCPFClienteS;
	}

	public JTextField getTfNomeCliente() {
		return tfNomeCliente;
	}

	public JTextField getTfDtCadastroS() {
		return tfDtCadastroS;
	}

	public JTextField getTfS1() {
		return tfS1;
	}

	public JTextField getTfS2() {
		return tfS2;
	}

	public JTextField getTfS3() {
		return tfS3;
	}

	public JTextField getTfS4() {
		return tfS4;
	}

	public JTextField getTfS5() {
		return tfS5;
	}

	public JTextField getTfS6() {
		return tfS6;
	}

	public JTextField getTfS7() {
		return tfS7;
	}

	public JTextField getTfS8() {
		return tfS8;
	}

	public JTextField getTfS9() {
		return tfS9;
	}

	public JTextField getTfS10() {
		return tfS10;
	}

	public JTextField getTfS11() {
		return tfS11;
	}

	public JTextField getTfS12() {
		return tfS12;
	}

	public JTextField getTfS13() {
		return tfS13;
	}

	public JTextField getTfS14() {
		return tfS14;
	}

	public JTextField getTfS15() {
		return tfS15;
	}

	public JTextField getTfS16() {
		return tfS16;
	}

	public JTextField getTfS17() {
		return tfS17;
	}

	public JTextField getTfS18() {
		return tfS18;
	}

	public JTextField getTfS19() {
		return tfS19;
	}

	public JTextField getTfS20() {
		return tfS20;
	}

	public JTextField getTfS21() {
		return tfS21;
	}

	public JTextField getTfS22() {
		return tfS22;
	}

	public JTextField getTfS23() {
		return tfS23;
	}

	public JTextField getTfS24() {
		return tfS24;
	}

	public JTextField getTfS25() {
		return tfS25;
	}

	public JTextField getTfS26() {
		return tfS26;
	}

	public JTextField getTfS27() {
		return tfS27;
	}

	public JTextField getTfS28() {
		return tfS28;
	}

	public JTextField getTfS29() {
		return tfS29;
	}

	public JTextField getTfS30() {
		return tfS30;
	}

	public JTextField getTfS31() {
		return tfS31;
	}

	public FormSaudeSwing() {
		initialize();
		this.controller = new FormSaudeCT();
	}

	public void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Hist. Saúde");
		setBounds(100, 100, 750, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCpf.setBounds(10, 11, 32, 14);
		contentPane.add(lblCpf);

		lblS1 = new JLabel("1- Tabagista");
		lblS1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS1.setBounds(10, 51, 232, 14);
		contentPane.add(lblS1);

		lblS2 = new JLabel("2- Etilista");
		lblS2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS2.setBounds(10, 76, 232, 14);
		contentPane.add(lblS2);

		lblS3 = new JLabel("3- Faz Algum tipo de dieta?");
		lblS3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS3.setBounds(10, 101, 232, 14);
		contentPane.add(lblS3);

		lblS4 = new JLabel("4- Sente falta de Ar?");
		lblS4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS4.setBounds(10, 124, 232, 14);
		contentPane.add(lblS4);

		lblS5 = new JLabel("5- Possui vida sexual ativa?");
		lblS5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS5.setBounds(10, 149, 232, 14);
		contentPane.add(lblS5);

		lblS6 = new JLabel("6- Faz uso de medicação?");
		lblS6.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS6.setBounds(10, 174, 232, 14);
		contentPane.add(lblS6);

		lblS7 = new JLabel("7- É diabetico?");
		lblS7.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS7.setBounds(10, 199, 232, 14);
		contentPane.add(lblS7);

		lblS8 = new JLabel("8- Sente dores no peito?");
		lblS8.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS8.setBounds(10, 224, 232, 14);
		contentPane.add(lblS8);

		lblS9 = new JLabel("9- É hipertenso?");
		lblS9.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS9.setBounds(10, 249, 232, 14);
		contentPane.add(lblS9);

		lblS10 = new JLabel("10- Tem niveis de colesterol alterados?");
		lblS10.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS10.setBounds(10, 274, 232, 14);
		contentPane.add(lblS10);

		lblS11 = new JLabel("11- Tem níveis de triglicérides alterados?");
		lblS11.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS11.setBounds(10, 299, 232, 14);
		contentPane.add(lblS11);

		lblS12 = new JLabel("12- É anemico?");
		lblS12.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS12.setBounds(10, 324, 232, 14);
		contentPane.add(lblS12);

		lblS13 = new JLabel("13- Gota?");
		lblS13.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS13.setBounds(294, 51, 130, 14);
		contentPane.add(lblS13);

		lblS14 = new JLabel("14- Alérgico?");
		lblS14.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS14.setBounds(294, 76, 130, 14);
		contentPane.add(lblS14);

		lblS15 = new JLabel("15- Cardíaco?");
		lblS15.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS15.setBounds(294, 101, 130, 14);
		contentPane.add(lblS15);

		lblS16 = new JLabel("16- Tem arritmia?");
		lblS16.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS16.setBounds(294, 124, 130, 14);
		contentPane.add(lblS16);

		lblS17 = new JLabel("17- Ja teve infarto?");
		lblS17.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS17.setBounds(294, 149, 130, 14);
		contentPane.add(lblS17);

		lblS18 = new JLabel("18- Possui stent?");
		lblS18.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS18.setBounds(294, 174, 130, 14);
		contentPane.add(lblS18);

		lblS19 = new JLabel("19- Cateterismo?");
		lblS19.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS19.setBounds(294, 199, 130, 14);
		contentPane.add(lblS19);

		lblS20 = new JLabel("20- AVC?");
		lblS20.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS20.setBounds(294, 224, 130, 14);
		contentPane.add(lblS20);

		lblS21 = new JLabel("21- Problemas renais?");
		lblS21.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS21.setBounds(294, 249, 130, 14);
		contentPane.add(lblS21);

		lblS22 = new JLabel("22- Câncer?");
		lblS22.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS22.setBounds(294, 274, 130, 14);
		contentPane.add(lblS22);

		lblS23 = new JLabel("23- Hepatite?");
		lblS23.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS23.setBounds(294, 299, 130, 14);
		contentPane.add(lblS23);

		lblS24 = new JLabel("24- Labirintite?");
		lblS24.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS24.setBounds(294, 324, 130, 14);
		contentPane.add(lblS24);

		lblS25 = new JLabel("25- Alguma Patologia Arterial?");
		lblS25.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS25.setBounds(481, 51, 189, 14);
		contentPane.add(lblS25);

		lblS26 = new JLabel("26- Alguma Patologia Pulmonar?");
		lblS26.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS26.setBounds(481, 76, 189, 14);
		contentPane.add(lblS26);

		lblS27 = new JLabel("27- Tireóide?");
		lblS27.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS27.setBounds(481, 101, 189, 14);
		contentPane.add(lblS27);

		lblS28 = new JLabel("28- Hábito Menstrual?");
		lblS28.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS28.setBounds(481, 124, 125, 14);
		contentPane.add(lblS28);

		lblS29 = new JLabel("29- Hábito Intestinal?");
		lblS29.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS29.setBounds(481, 149, 125, 14);
		contentPane.add(lblS29);

		lblS30 = new JLabel("30- Alguma Patologia Ortopédica?");
		lblS30.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS30.setBounds(481, 174, 189, 14);
		contentPane.add(lblS30);

		lblS31 = new JLabel("31- Dores de cabeça?");
		lblS31.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblS31.setBounds(481, 199, 189, 14);
		contentPane.add(lblS31);

		lbS = new JLabel("S para Sim");
		lbS.setEnabled(false);
		lbS.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbS.setBounds(10, 434, 68, 14);
		contentPane.add(lbS);

		lbN = new JLabel("N para Não");
		lbN.setEnabled(false);
		lbN.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lbN.setBounds(10, 453, 68, 14);
		contentPane.add(lbN);

		lblIcon = new JLabel();
		lblIcon.setIcon(
				new ImageIcon(FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/medical-mobile-80.png")));
		lblIcon.setBounds(88, 376, 68, 72);
		contentPane.add(lblIcon);

		lbDt = new JLabel("Data Cadastro");
		lbDt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbDt.setBounds(527, 388, 79, 22);
		contentPane.add(lbDt);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCPFClienteS = new JFormattedTextField(mascaraCPF);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error!: " + e.getMessage());
		}
		tfCPFClienteS.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		tfCPFClienteS.setBounds(47, 9, 170, 19);
		contentPane.add(tfCPFClienteS);

		tfNomeCliente = new JTextField("Nome Cliente");
		tfNomeCliente.setEditable(false);
		tfNomeCliente.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		tfNomeCliente.setBounds(262, 9, 462, 19);
		contentPane.add(tfNomeCliente);

		tfS1 = new JTextField();
		tfS1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS1 = defTamECa.tamTipCarac(1, "SN");
		tfS1.setBounds(242, 46, 42, 20);
		contentPane.add(tfS1);

		tfS2 = new JTextField();
		tfS2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS2 = defTamECa.tamTipCarac(1, "SN");
		tfS2.setBounds(242, 71, 42, 20);
		contentPane.add(tfS2);

		tfS3 = new JTextField();
		tfS3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS3 = defTamECa.tamTipCarac(1, "SN");
		tfS3.setBounds(242, 96, 42, 20);
		contentPane.add(tfS3);

		tfS4 = new JTextField();
		tfS4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS4 = defTamECa.tamTipCarac(1, "SN");
		tfS4.setBounds(242, 119, 42, 20);
		contentPane.add(tfS4);

		tfS5 = new JTextField();
		tfS5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS5 = defTamECa.tamTipCarac(1, "SN");
		tfS5.setBounds(242, 144, 42, 20);
		contentPane.add(tfS5);

		tfS6 = new JTextField();
		tfS6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS6 = defTamECa.tamTipCarac(1, "SN");
		tfS6.setBounds(242, 169, 42, 20);
		contentPane.add(tfS6);

		tfS7 = new JTextField();
		tfS7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS7 = defTamECa.tamTipCarac(1, "SN");
		tfS7.setBounds(242, 194, 42, 20);
		contentPane.add(tfS7);

		tfS8 = new JTextField();
		tfS8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS8 = defTamECa.tamTipCarac(1, "SN");
		tfS8.setBounds(242, 219, 42, 20);
		contentPane.add(tfS8);

		tfS9 = new JTextField();
		tfS9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS9 = defTamECa.tamTipCarac(1, "SN");
		tfS9.setBounds(242, 244, 42, 20);
		contentPane.add(tfS9);

		tfS10 = new JTextField();
		tfS10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS10 = defTamECa.tamTipCarac(1, "SN");
		tfS10.setBounds(242, 269, 42, 20);
		contentPane.add(tfS10);

		tfS11 = new JTextField();
		tfS11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS11 = defTamECa.tamTipCarac(1, "SN");
		tfS11.setBounds(242, 294, 42, 20);
		contentPane.add(tfS11);

		tfS12 = new JTextField();
		tfS12.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS12 = defTamECa.tamTipCarac(1, "SN");
		tfS12.setBounds(242, 319, 42, 20);
		contentPane.add(tfS12);

		tfS13 = new JTextField();
		tfS13.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS13 = defTamECa.tamTipCarac(1, "SN");
		tfS13.setBounds(429, 46, 42, 20);
		contentPane.add(tfS13);

		tfS14 = new JTextField();
		tfS14.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS14 = defTamECa.tamTipCarac(1, "SN");
		tfS14.setBounds(429, 71, 42, 20);
		contentPane.add(tfS14);

		tfS15 = new JTextField();
		tfS15.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS15 = defTamECa.tamTipCarac(1, "SN");
		tfS15.setBounds(429, 96, 42, 20);
		contentPane.add(tfS15);

		tfS16 = new JTextField();
		tfS16.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS16 = defTamECa.tamTipCarac(1, "SN");
		tfS16.setBounds(429, 119, 42, 20);
		contentPane.add(tfS16);

		tfS17 = new JTextField();
		tfS17.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS17 = defTamECa.tamTipCarac(1, "SN");
		tfS17.setBounds(429, 144, 42, 20);
		contentPane.add(tfS17);

		tfS18 = new JTextField();
		tfS18.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS18 = defTamECa.tamTipCarac(1, "SN");
		tfS18.setBounds(429, 169, 42, 20);
		contentPane.add(tfS18);

		tfS19 = new JTextField();
		tfS19.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS19 = defTamECa.tamTipCarac(1, "SN");
		tfS19.setBounds(429, 194, 42, 20);
		contentPane.add(tfS19);

		tfS20 = new JTextField();
		tfS20.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS20 = defTamECa.tamTipCarac(1, "SN");
		tfS20.setBounds(429, 219, 42, 20);
		contentPane.add(tfS20);

		tfS21 = new JTextField();
		tfS21.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS21 = defTamECa.tamTipCarac(1, "SN");
		tfS21.setBounds(429, 244, 42, 20);
		contentPane.add(tfS21);

		tfS22 = new JTextField();
		tfS22.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS22 = defTamECa.tamTipCarac(1, "SN");
		tfS22.setBounds(429, 269, 42, 20);
		contentPane.add(tfS22);

		tfS23 = new JTextField();
		tfS23.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS23 = defTamECa.tamTipCarac(1, "SN");
		tfS23.setBounds(429, 294, 42, 20);
		contentPane.add(tfS23);

		tfS24 = new JTextField();
		tfS24.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS24 = defTamECa.tamTipCarac(1, "SN");
		tfS24.setBounds(429, 319, 42, 20);
		contentPane.add(tfS24);

		tfS25 = new JTextField();
		tfS25.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS25 = defTamECa.tamTipCarac(1, "SN");
		tfS25.setBounds(685, 45, 42, 20);
		contentPane.add(tfS25);

		tfS26 = new JTextField();
		tfS26.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS26 = defTamECa.tamTipCarac(1, "SN");
		tfS26.setBounds(685, 70, 42, 20);
		contentPane.add(tfS26);

		tfS27 = new JTextField();
		tfS27.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS27 = defTamECa.tamTipCarac(1, "SN");
		tfS27.setBounds(685, 95, 42, 20);
		contentPane.add(tfS27);

		tfS28 = new JTextField();
		tfS28.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS28.setBounds(620, 118, 107, 20);
		contentPane.add(tfS28);

		tfS29 = new JTextField();
		tfS29.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS29.setBounds(620, 143, 107, 20);
		contentPane.add(tfS29);

		tfS30 = new JTextField();
		tfS30.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS30 = defTamECa.tamTipCarac(1, "SN");
		tfS30.setBounds(685, 168, 42, 20);
		contentPane.add(tfS30);

		tfS31 = new JTextField();
		tfS31.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfS31 = defTamECa.tamTipCarac(1, "SN");
		tfS31.setBounds(685, 193, 42, 20);
		contentPane.add(tfS31);
		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadastroS = new JFormattedTextField(mascaraData);
			tfDtCadastroS.setLocation(624, 388);
			tfDtCadastroS.setSize(100, 19);
			tfDtCadastroS.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}
		contentPane.add(tfDtCadastroS);

		btLocaliza = new JButton();
		btLocaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesq();
				onClickBusca();
			}
		});
		btLocaliza.setIcon(new ImageIcon(FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/lupaCinza.png")));
		btLocaliza.setBounds(227, 5, 32, 23);
		contentPane.add(btLocaliza);

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
		btCancel.setIcon(new ImageIcon(FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(688, 421, 36, 41);
		contentPane.add(btCancel);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsert();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(642, 421, 36, 41);
		contentPane.add(btSaveUser);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(596, 421, 36, 41);
		contentPane.add(btExcluir);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza.setIcon(new ImageIcon(FormSaudeSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(550, 421, 36, 41);
		contentPane.add(btAtualiza);

	}

	private void onClickPesq() {
		try {
			controller.pesquisaCpf(this);

		} catch (Exception e) {

		}
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
