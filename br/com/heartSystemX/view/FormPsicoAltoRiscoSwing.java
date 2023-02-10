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

import br.com.heartSystemX.controller.impl.FormPsicoAltoRiscoCT;
import br.com.heartSystemX.utils.MasksSwing;

public class FormPsicoAltoRiscoSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	MaskFormatter mascaraCPF, mascaraData = null;
	MasksSwing defTamECa = new MasksSwing();

	private FormPsicoAltoRiscoCT controller;

	private JTextField tfCPFPsicoAr, tfNomePsicoAr, tfPsicoAr1, tfPsicoAr2, tfPsicoAr3, tfPsicoAr4, tfPsicoAr5,
			tfPsicoAr6, tfPsicoAr7, tfPsicoAr8, tfPsicoAr9, tfPsicoAr10, tfPsicoAr11, tfDtCadPsicoAr;

	private JButton btLocaliza, btAtualiza, btExcluir, btSaveUser, btCancel;

	private JLabel lblCpfPsico, lbIDt, lblPsicoAR1, lblPsicoAR2, lblPsicoAR3, lblPsicoAR4, lblPsicoAR5, lblPsicoAR6,
			lblPsicoAR7, lblPsicoAR8, lblPsicoAR9, lblPsicoAR10, lblPsicoAR11, lblS, lblN, lbIcon;

	//gether's
	public JTextField getTfCPFPsicoAr() {
		return tfCPFPsicoAr;
	}

	public JTextField getTfNomePsicoAr() {
		return tfNomePsicoAr;
	}

	public JTextField getTfPsicoAr1() {
		return tfPsicoAr1;
	}

	public JTextField getTfPsicoAr2() {
		return tfPsicoAr2;
	}

	public JTextField getTfPsicoAr3() {
		return tfPsicoAr3;
	}

	public JTextField getTfPsicoAr4() {
		return tfPsicoAr4;
	}

	public JTextField getTfPsicoAr5() {
		return tfPsicoAr5;
	}

	public JTextField getTfPsicoAr6() {
		return tfPsicoAr6;
	}

	public JTextField getTfPsicoAr7() {
		return tfPsicoAr7;
	}

	public JTextField getTfPsicoAr8() {
		return tfPsicoAr8;
	}

	public JTextField getTfPsicoAr9() {
		return tfPsicoAr9;
	}

	public JTextField getTfPsicoAr10() {
		return tfPsicoAr10;
	}

	public JTextField getTfPsicoAr11() {
		return tfPsicoAr11;
	}

	public JTextField getTfDtCadPsicoAr() {
		return tfDtCadPsicoAr;
	}

	public FormPsicoAltoRiscoSwing() {
		initialize();
		this.controller = new FormPsicoAltoRiscoCT();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Hist. Psico A.R.");
		setBounds(100, 100, 629, 497);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lblCpfPsico = new JLabel("CPF");
		lblCpfPsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCpfPsico.setBounds(10, 13, 32, 14);
		contentPane.add(lblCpfPsico);

		lbIDt = new JLabel("Data Cadastro");
		lbIDt.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbIDt.setBounds(426, 379, 86, 22);
		contentPane.add(lbIDt);

		lblPsicoAR1 = new JLabel("1- Voce tem pensado em se machucar?");
		lblPsicoAR1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR1.setBounds(10, 48, 502, 14);
		contentPane.add(lblPsicoAR1);

		lblPsicoAR2 = new JLabel("2- Voce pensa em dar fim a sua vida?");
		lblPsicoAR2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR2.setBounds(10, 75, 502, 14);
		contentPane.add(lblPsicoAR2);

		lblPsicoAR3 = new JLabel("3- Voce tem pensado em suicídio?");
		lblPsicoAR3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR3.setBounds(10, 101, 502, 14);
		contentPane.add(lblPsicoAR3);

		lblPsicoAR4 = new JLabel("4- Sente que a vida perdeu o sentido?");
		lblPsicoAR4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR4.setBounds(10, 129, 502, 14);
		contentPane.add(lblPsicoAR4);

		lblPsicoAR5 = new JLabel("5- Voce pensou que seria melhor morrer?");
		lblPsicoAR5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR5.setBounds(10, 157, 502, 14);
		contentPane.add(lblPsicoAR5);

		lblPsicoAR6 = new JLabel("6- Sente-se útil na vida que está levando?");
		lblPsicoAR6.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR6.setBounds(10, 184, 502, 14);
		contentPane.add(lblPsicoAR6);

		lblPsicoAR7 = new JLabel("7- Voce alguma vez pensou ou está pensando em se machucar agora?");
		lblPsicoAR7.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR7.setBounds(10, 210, 502, 14);
		contentPane.add(lblPsicoAR7);

		lblPsicoAR8 = new JLabel("8- Voce tem se sentido tão mal que chega a pensar em se machucar?");
		lblPsicoAR8.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR8.setBounds(10, 238, 502, 14);
		contentPane.add(lblPsicoAR8);

		lblPsicoAR9 = new JLabel("9- Voce tem um plano para se matar?");
		lblPsicoAR9.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR9.setBounds(10, 264, 502, 14);
		contentPane.add(lblPsicoAR9);

		lblPsicoAR10 = new JLabel("10- Voce tem um plano de como faria isso?");
		lblPsicoAR10.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR10.setBounds(10, 292, 502, 14);
		contentPane.add(lblPsicoAR10);

		lblPsicoAR11 = new JLabel("11- Tem desejo de receber ajuda?");
		lblPsicoAR11.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblPsicoAR11.setBounds(10, 317, 502, 14);
		contentPane.add(lblPsicoAR11);

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

		lbIcon = new JLabel();
		lbIcon.setIcon(new ImageIcon(
				FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/medical-mobile-80.png")));
		lbIcon.setBounds(94, 378, 68, 72);
		contentPane.add(lbIcon);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCPFPsicoAr = new JFormattedTextField(mascaraCPF);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error!: " + e.getMessage());
		}

		tfCPFPsicoAr.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCPFPsicoAr.setBounds(47, 9, 170, 19);
		contentPane.add(tfCPFPsicoAr);

		tfNomePsicoAr = new JTextField("Nome Cliente");
		tfNomePsicoAr.setEditable(false);
		tfNomePsicoAr.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNomePsicoAr.setBounds(262, 9, 341, 17);
		contentPane.add(tfNomePsicoAr);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadPsicoAr = new JFormattedTextField(mascaraData);
			tfDtCadPsicoAr.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			tfDtCadPsicoAr.setBounds(517, 378, 86, 19);
			contentPane.add(tfDtCadPsicoAr);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error!: " + e.getMessage());
		}

		tfPsicoAr1 = new JTextField();
		tfPsicoAr1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr1 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr1.setBounds(540, 42, 42, 20);
		contentPane.add(tfPsicoAr1);

		tfPsicoAr2 = new JTextField();
		tfPsicoAr2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr2 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr2.setBounds(540, 69, 42, 20);
		contentPane.add(tfPsicoAr2);

		tfPsicoAr3 = new JTextField();
		tfPsicoAr3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr3 = defTamECa.tamTipCarac(1, "SN");
		;
		tfPsicoAr3.setBounds(540, 95, 42, 20);
		contentPane.add(tfPsicoAr3);

		tfPsicoAr4 = new JTextField();
		tfPsicoAr4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr4 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr4.setBounds(540, 123, 42, 20);
		contentPane.add(tfPsicoAr4);

		tfPsicoAr5 = new JTextField();
		tfPsicoAr5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr5 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr5.setBounds(540, 151, 42, 20);
		contentPane.add(tfPsicoAr5);

		tfPsicoAr6 = new JTextField();
		tfPsicoAr6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr6 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr6.setBounds(540, 178, 42, 20);
		contentPane.add(tfPsicoAr6);

		tfPsicoAr7 = new JTextField();
		tfPsicoAr7.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr7 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr7.setBounds(540, 204, 42, 20);
		contentPane.add(tfPsicoAr7);

		tfPsicoAr8 = new JTextField();
		tfPsicoAr8.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr8 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr8.setBounds(540, 232, 42, 20);
		contentPane.add(tfPsicoAr8);

		tfPsicoAr9 = new JTextField();
		tfPsicoAr9.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr9 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr9.setBounds(540, 258, 42, 20);
		contentPane.add(tfPsicoAr9);

		tfPsicoAr10 = new JTextField();
		tfPsicoAr10.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr10 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr10.setBounds(540, 286, 42, 20);
		contentPane.add(tfPsicoAr10);

		tfPsicoAr11 = new JTextField();
		tfPsicoAr11.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPsicoAr11 = defTamECa.tamTipCarac(1, "SN");
		tfPsicoAr11.setBounds(540, 311, 42, 20);
		contentPane.add(tfPsicoAr11);

		btLocaliza = new JButton();
		btLocaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesq();
				onClickCarregaObj();
			}
		});
		btLocaliza.setIcon(
				new ImageIcon(FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/lupaBranca.png")));
		btLocaliza.setBounds(227, 5, 32, 23);
		contentPane.add(btLocaliza);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza.setIcon(
				new ImageIcon(FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(429, 406, 36, 41);
		contentPane.add(btAtualiza);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(475, 406, 36, 41);
		contentPane.add(btExcluir);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsere();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(521, 406, 36, 41);
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
		btCancel.setIcon(new ImageIcon(FormPsicoAltoRiscoSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.setBounds(567, 406, 36, 41);
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

	private void onClickInsere() {
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
