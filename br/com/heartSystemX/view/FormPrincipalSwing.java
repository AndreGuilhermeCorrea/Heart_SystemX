package br.com.heartSystemX.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class FormPrincipalSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;

	private JMenuBar menuInicial;

	private JMenu mnUsuarioPre, mnClientePre, mnHistoricoPre, mnHelpPre, mnOpcoesPre;

	private JMenuItem mnUsuario, mnCliente, mnHSaude, mnHFamilia, mnAntropometria, mnPsico, mntmQuestionarios,
			mntmAutor, mnSobre, mnSair, mntmPrograma, mntmAntropometria;

	public JLabel lbUsuario, lbDta;

	private JLabel lbDs, lbVersion, lbIcon;

	private FormUsuarioSwing user;
	private FormClienteSwing cliente;
	private FormSaudeSwing saude;
	private FormFamiliaSwing familia;
	private FormAntropometriaSwing antropometria;
	private FormPsicoSwing psico;
	private FormPsicoAltoRiscoSwing psicoAR;
	private FormInfAutor autor;
	private FormInfPrograma programa;
	private FormInfSobre sobre;
	private FormInfAntropometria infAntropometria;
	private FormInfQuestionarios questionario;

	private JMenuItem mnPsicologiaAltoRisco;

	public FormPrincipalSwing() {
		InitializeFormTelaInicio();
	}

	private void InitializeFormTelaInicio() {
		// evento que ao abrir tela formata a label data
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E dd/MM/yyyy");
				LocalDateTime timePoint = LocalDateTime.now();
				String dataHoje = timePoint.format(fmt);
				lbDta.setText("Data: " + dataHoje);
			}
		});

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPrincipalSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 773);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(242, 242, 242));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuInicial = new JMenuBar();
		menuInicial.setBounds(0, 0, 877, 20);
		menuInicial.setBorder(UIManager.getBorder("MenuBar.border"));
		contentPane.add(menuInicial);

		mnUsuarioPre = new JMenu("Usuário");
		mnUsuarioPre.setMnemonic('U');
		mnUsuarioPre.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		menuInicial.add(mnUsuarioPre);

		mnClientePre = new JMenu("Cliente");
		mnClientePre.setMnemonic('C');
		mnClientePre.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		menuInicial.add(mnClientePre);

		mnHistoricoPre = new JMenu("Histórico");
		mnHistoricoPre.setMnemonic('H');
		mnHistoricoPre.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		menuInicial.add(mnHistoricoPre);

		mnHelpPre = new JMenu("Help");
		mnHelpPre.setMnemonic('H');
		mnHelpPre.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		menuInicial.add(mnHelpPre);

		mnOpcoesPre = new JMenu("Opções");
		mnOpcoesPre.setMnemonic('O');
		mnOpcoesPre.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		menuInicial.add(mnOpcoesPre);

		mnUsuario = new JMenuItem("Usuário");
		mnUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnUsuarioPre.add(mnUsuario);
		mnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				user = new FormUsuarioSwing();
				user.setVisible(true);
			}
		});

		mnCliente = new JMenuItem("Cliente");
		mnCliente.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnClientePre.add(mnCliente);
		mnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				cliente = new FormClienteSwing();
				cliente.setVisible(true);
			}
		});

		mnHSaude = new JMenuItem("H. Saúde");
		mnHSaude.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHistoricoPre.add(mnHSaude);
		mnHSaude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				saude = new FormSaudeSwing();
				saude.setVisible(true);
			}
		});

		mnHFamilia = new JMenuItem("H. Familiar");
		mnHFamilia.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHistoricoPre.add(mnHFamilia);
		mnHFamilia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				familia = new FormFamiliaSwing();
				familia.setVisible(true);
			}
		});

		mnAntropometria = new JMenuItem("Medidas Antropométricas");
		mnAntropometria.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHistoricoPre.add(mnAntropometria);
		mnAntropometria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				antropometria = new FormAntropometriaSwing();
				antropometria.setVisible(true);
				;
			}
		});

		mnPsico = new JMenuItem("Psicologia");
		mnPsico.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHistoricoPre.add(mnPsico);
		mnPsico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				psico = new FormPsicoSwing();
				psico.setVisible(true);
			}
		});

		mnPsicologiaAltoRisco = new JMenuItem("Psicologia Alto Risco");
		mnPsicologiaAltoRisco.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHistoricoPre.add(mnPsicologiaAltoRisco);
		mnPsicologiaAltoRisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				psicoAR = new FormPsicoAltoRiscoSwing();
				psicoAR.setVisible(true);
			}
		});

		mnSobre = new JMenuItem("Sobre");
		mnSobre.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHelpPre.add(mnSobre);
		mnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				sobre = new FormInfSobre();
				sobre.setVisible(true);
			}
		});

		mntmAntropometria = new JMenuItem("Antropometria");
		mntmAntropometria.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHelpPre.add(mntmAntropometria);
		mntmAntropometria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				infAntropometria = new FormInfAntropometria();
				infAntropometria.setVisible(true);
			}
		});

		mntmPrograma = new JMenuItem("Programa");
		mntmPrograma.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHelpPre.add(mntmPrograma);
		mntmPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				programa = new FormInfPrograma();
				programa.setVisible(true);
			}
		});

		mntmAutor = new JMenuItem("Autor");
		mntmAutor.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHelpPre.add(mntmAutor);
		mntmAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				autor = new FormInfAutor();
				autor.setVisible(true);
			}
		});

		mntmQuestionarios = new JMenuItem("Questionários");
		mntmQuestionarios.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnHelpPre.add(mntmQuestionarios);
		mntmQuestionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				questionario = new FormInfQuestionarios();
				questionario.setVisible(true);
			}
		});

		mnSair = new JMenuItem("Sair");
		mnSair.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		mnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Sair do Sistema?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sair == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mnOpcoesPre.add(mnSair);

		lbDs = new JLabel("Desenvolvido por: ");
		lbDs.setEnabled(false);
		lbDs.setFont(new Font("Trebuchet MS", Font.PLAIN, 8));
		lbDs.setBounds(10, 719, 154, 15);
		contentPane.add(lbDs);

		lbVersion = new JLabel("V. 1.0.0.0 SWING");
		lbVersion.setEnabled(false);
		lbVersion.setFont(new Font("Trebuchet MS", Font.PLAIN, 8));
		lbVersion.setBounds(808, 719, 59, 14);
		contentPane.add(lbVersion);

		lbDta = new JLabel();
		lbDta.setBounds(10, 18, 164, 20);
		lbDta.setForeground(new Color(255, 128, 0));
		lbDta.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(lbDta);

		lbUsuario = new JLabel("Usuário:");
		lbUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lbUsuario.setBounds(463, 18, 404, 20);
		lbUsuario.setForeground(new Color(255, 128, 0));
		lbUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(lbUsuario);

		lbIcon = new JLabel("");
		lbIcon.setIcon(new ImageIcon(FormPrincipalSwing.class.getResource("/br/com/heartSystemX/icons/image (1).jpg")));
		lbIcon.setBounds(10, 39, 857, 660);
		contentPane.add(lbIcon);

	}
}
