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

import br.com.heartSystemX.controller.impl.FormFamiliaCT;
import br.com.heartSystemX.utils.MasksSwing;

public class FormFamiliaSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	MaskFormatter mascaraCPF, mascaraData = null;
	MasksSwing defTamECa = new MasksSwing();

	private FormFamiliaCT controller;

	private JTextField tfCpfFam, tfNomeFam, tfFam1, tfFam2, tfFam3, tfFam4, tfFam5, tfFam6, tfFam7, tfFam8, tfFam9,
			tfFam10, tfFam11, tfDtCadFam;

	private JLabel lbCpf, lbDtCad, lbIcon, lblF1, lblF2, lblF3, lblF4, lblF5, lblF6, lblF7, lblF8, lblF9, lblF10,
			lblF11, lbN, lbS;

	private JButton btCancel, btSaveUser, btLocaliza, btExcluir, btAtualiza;

	//gether's
	public JTextField getTfCpfFam() {
		return tfCpfFam;
	}

	public JTextField getTfNomeFam() {
		return tfNomeFam;
	}

	public JTextField getTfFam1() {
		return tfFam1;
	}

	public JTextField getTfFam2() {
		return tfFam2;
	}

	public JTextField getTfFam3() {
		return tfFam3;
	}

	public JTextField getTfFam4() {
		return tfFam4;
	}

	public JTextField getTfFam5() {
		return tfFam5;
	}

	public JTextField getTfFam6() {
		return tfFam6;
	}

	public JTextField getTfFam7() {
		return tfFam7;
	}

	public JTextField getTfFam8() {
		return tfFam8;
	}

	public JTextField getTfFam9() {
		return tfFam9;
	}

	public JTextField getTfFam10() {
		return tfFam10;
	}

	public JTextField getTfFam11() {
		return tfFam11;
	}

	public JTextField getTfDtCadFam() {
		return tfDtCadFam;
	}

	public FormFamiliaSwing() {
		initialize();
		this.controller = new FormFamiliaCT();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Familia");
		setBounds(100, 100, 550, 325);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lbCpf = new JLabel("CPF");
		lbCpf.setFont(new Font("Arial", Font.PLAIN, 12));
		lbCpf.setBounds(10, 8, 32, 14);
		contentPane.add(lbCpf);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCpfFam = new JFormattedTextField(mascaraCPF);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error!: " + e.getMessage());
		}
		tfCpfFam.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCpfFam.setColumns(10);
		tfCpfFam.setBounds(47, 4, 170, 19);
		contentPane.add(tfCpfFam);

		tfNomeFam = new JTextField("Nome Cliente");
		tfNomeFam.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNomeFam.setEditable(false);
		tfNomeFam.setBounds(262, 4, 259, 19);
		contentPane.add(tfNomeFam);

		btLocaliza = new JButton();
		btLocaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesqCliente();
				onClickCarregaObj();
			}
		});
		btLocaliza.setIcon(new ImageIcon(FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/lupaCinza.png")));
		btLocaliza.setBounds(225, 6, 32, 23);
		contentPane.add(btLocaliza);

		lblF1 = new JLabel("1- Patologia Cardíaca?");
		lblF1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF1.setBounds(10, 43, 134, 14);
		contentPane.add(lblF1);

		lblF2 = new JLabel("2- Patologia Arterial?");
		lblF2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF2.setBounds(10, 70, 134, 14);
		contentPane.add(lblF2);

		lblF3 = new JLabel("3- Patologia Pulmonar?");
		lblF3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF3.setBounds(10, 96, 134, 14);
		contentPane.add(lblF3);

		lblF4 = new JLabel("4- Tabagista?");
		lblF4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF4.setBounds(10, 124, 134, 14);
		contentPane.add(lblF4);

		lblF5 = new JLabel("5- Etilista?");
		lblF5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF5.setBounds(10, 152, 134, 14);
		contentPane.add(lblF5);

		lblF6 = new JLabel("6- Diabetes?");
		lblF6.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF6.setBounds(10, 179, 134, 14);
		contentPane.add(lblF6);

		lblF7 = new JLabel("7- Câncer?");
		lblF7.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF7.setBounds(237, 42, 126, 14);
		contentPane.add(lblF7);

		lblF8 = new JLabel("8- Hipertenso?");
		lblF8.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF8.setBounds(237, 70, 126, 14);
		contentPane.add(lblF8);

		lblF9 = new JLabel("9- Renal?");
		lblF9.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF9.setBounds(237, 96, 126, 14);
		contentPane.add(lblF9);

		lblF11 = new JLabel("11- Asmatico?");
		lblF11.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF11.setBounds(237, 152, 126, 14);
		contentPane.add(lblF11);

		lblF10 = new JLabel("10- AVC?");
		lblF10.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblF10.setBounds(237, 124, 126, 14);
		contentPane.add(lblF10);

		lbDtCad = new JLabel("Data Cadastro");
		lbDtCad.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lbDtCad.setBounds(351, 202, 79, 22);
		contentPane.add(lbDtCad);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadFam = new JFormattedTextField(mascaraData);
			tfDtCadFam.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
			tfDtCadFam.setBounds(435, 201, 86, 19);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}
		contentPane.add(tfDtCadFam);

		lbN = new JLabel("N para Não");
		lbN.setFont(new Font("Trebuchet MS", Font.PLAIN, 9));
		lbN.setEnabled(false);
		lbN.setBounds(10, 266, 68, 14);
		contentPane.add(lbN);

		lbS = new JLabel("S para Sim");
		lbS.setFont(new Font("Trebuchet MS", Font.PLAIN, 9));
		lbS.setEnabled(false);
		lbS.setBounds(10, 247, 68, 14);
		contentPane.add(lbS);

		lbIcon = new JLabel();
		lbIcon.setIcon(
				new ImageIcon(FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/medical-mobile-80.png")));
		lbIcon.setBounds(65, 208, 68, 72);
		contentPane.add(lbIcon);

		tfFam1 = new JTextField();
		tfFam1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam1 = defTamECa.tamTipCarac(1, "SN");
		tfFam1.setBounds(154, 38, 42, 20);
		contentPane.add(tfFam1);

		tfFam2 = new JTextField();
		tfFam2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam2 = defTamECa.tamTipCarac(1, "SN");
		tfFam2.setBounds(154, 65, 42, 20);
		contentPane.add(tfFam2);

		tfFam3 = new JTextField();
		tfFam3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam3 = defTamECa.tamTipCarac(1, "SN");
		tfFam3.setBounds(154, 91, 42, 20);
		contentPane.add(tfFam3);

		tfFam4 = new JTextField();
		tfFam4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam4 = defTamECa.tamTipCarac(1, "SN");
		tfFam4.setBounds(154, 119, 42, 20);
		contentPane.add(tfFam4);

		tfFam5 = new JTextField();
		tfFam5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam5 = defTamECa.tamTipCarac(1, "SN");
		tfFam5.setBounds(154, 147, 42, 20);
		contentPane.add(tfFam5);

		tfFam6 = new JTextField();
		tfFam6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam6 = defTamECa.tamTipCarac(1, "SN");
		tfFam6.setBounds(154, 174, 42, 20);
		contentPane.add(tfFam6);

		tfFam7 = new JTextField();
		tfFam7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam7 = defTamECa.tamTipCarac(1, "SN");
		tfFam7.setBounds(351, 38, 42, 20);
		contentPane.add(tfFam7);

		tfFam8 = new JTextField();
		tfFam8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam8 = defTamECa.tamTipCarac(1, "SN");
		tfFam8.setBounds(351, 65, 42, 20);
		contentPane.add(tfFam8);

		tfFam9 = new JTextField();
		tfFam9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam9 = defTamECa.tamTipCarac(1, "SN");
		tfFam9.setBounds(351, 93, 42, 20);
		contentPane.add(tfFam9);

		tfFam10 = new JTextField();
		tfFam10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam10 = defTamECa.tamTipCarac(1, "SN");
		tfFam10.setBounds(351, 119, 42, 20);
		contentPane.add(tfFam10);

		tfFam11 = new JTextField();
		tfFam11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfFam11 = defTamECa.tamTipCarac(1, "SN");
		tfFam11.setBounds(351, 147, 42, 20);
		contentPane.add(tfFam11);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza
				.setIcon(new ImageIcon(FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(347, 235, 36, 41);
		contentPane.add(btAtualiza);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(393, 235, 36, 41);
		contentPane.add(btExcluir);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsere();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(439, 235, 36, 41);
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
		btCancel.setIcon(new ImageIcon(FormFamiliaSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(485, 235, 36, 41);
		contentPane.add(btCancel);
	}

	private void onClickPesqCliente() {
		controller = new FormFamiliaCT();
		try {
			controller.pesquisaCpf(this);
		} catch (Exception e) {

		}
	}

	private void onClickCarregaObj() {
		controller = new FormFamiliaCT();
		try {
			controller.buscaObj(this);
		} catch (Exception e) {

		}
	}

	private void onClickDelete() {
		controller = new FormFamiliaCT();
		try {
			controller.deletar(this);
		} catch (Exception e) {

		}
	}

	private void onClickAtualiza() {
		controller = new FormFamiliaCT();
		try {
			controller.atualizar(this);
		} catch (Exception e) {

		}
	}

	private void onClickInsere() {
		controller = new FormFamiliaCT();
		try {
			controller.inserir(this);
		} catch (Exception e) {

		}
	}

}
