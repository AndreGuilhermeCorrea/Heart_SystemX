package br.com.heartSystemX.view;

import java.awt.Color;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.heartSystemX.controller.impl.FormAntropometriaCT;
import br.com.heartSystemX.utils.MasksSwing;

//classe responsável pela interface Grafica para o usuário(GUI)
public class FormAntropometriaSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	MaskFormatter mascaraCPF, mascaraData = null;
	MasksSwing defTamECa = new MasksSwing();

	private FormAntropometriaCT controller;

	private JTextField tfCpfA, tfNomeCliente, tfIdade, tfSexo, tfPeso, tfAltura, tfIMC, tfCIMC, tfPesoDesejavel,
			tfIMCDesejavel, tfPesoAjustado, tfAdequacaoPeso, tfCompleicao, tfTipoComp, tfPcSuprailiaca, tfPcTorax,
			tfPcAbdomem, tfPcCoxa, tfPcTricip, tfSomaDobras, tfcPunho, tfcCintura, tfcQuadril, tfMassaCMagra,
			tfMassaCGorda, tfDensidade, tfPedometroMedia, tfPedometro1, tfPedometro2, tfPedometro3, tfPedometroClass,
			tfSentarAlcanca, tfNivelFlexib, tfPercGord, tfRiscoSaude, tfRazaoCintQuad, tfDtCadastroA;

	private JButton btLcCpf, btAtualiza, btCancel, btCalc, btExcluir, btSaveUser;

	private JLabel lbCpfCliente, lbAltura, lbPeso, lbImc, lbCImc, lbPesoDes, lbImcDes, lbTipoComp, lbPesoAj, lbAdqPeso,
			lbComp, lbMCG, lbDtCad, lbDens, lbPed1, lbPed2, lbPed3, lbPedMed, lbPedClass, lbPcAbd, lbPcTor, lbPcTri,
			lbPcCoxa, lbSomDob, lbNvFlex, lbPcSupra, lbMCM, lbCPunho, lbCCint, lbCQuad, lbSentAlc, lbPercGord,
			lbRiscSaud, lbRazCQ;

	//gether's
	public JTextField getTfNomeCliente() {
		return tfNomeCliente;
	}

	public JTextField getTfDtCadastroA() {
		return tfDtCadastroA;
	}

	public JTextField getTfCpfA() {
		return tfCpfA;
	}

	public JTextField getTfIdade() {
		return tfIdade;
	}

	public JTextField getTfSexo() {
		return tfSexo;
	}

	public JTextField getTfPeso() {
		return tfPeso;
	}

	public JTextField getTfAltura() {
		return tfAltura;
	}

	public JTextField getTfIMC() {
		return tfIMC;
	}

	public JTextField getTfCIMC() {
		return tfCIMC;
	}

	public JTextField getTfPesoDesejavel() {
		return tfPesoDesejavel;
	}

	public JTextField getTfIMCDesejavel() {
		return tfIMCDesejavel;
	}

	public JTextField getTfPesoAjustado() {
		return tfPesoAjustado;
	}

	public JTextField getTfAdequacaoPeso() {
		return tfAdequacaoPeso;
	}

	public JTextField getTfCompleicao() {
		return tfCompleicao;
	}

	public JTextField getTfTipoComp() {
		return tfTipoComp;
	}

	public JTextField getTfPcSuprailiaca() {
		return tfPcSuprailiaca;
	}

	public JTextField getTfPcTorax() {
		return tfPcTorax;
	}

	public JTextField getTfPcAbdomem() {
		return tfPcAbdomem;
	}

	public JTextField getTfPcCoxa() {
		return tfPcCoxa;
	}

	public JTextField getTfPcTricip() {
		return tfPcTricip;
	}

	public JTextField getTfSomaDobras() {
		return tfSomaDobras;
	}

	public JTextField getTfcPunho() {
		return tfcPunho;
	}

	public JTextField getTfcCintura() {
		return tfcCintura;
	}

	public JTextField getTfcQuadril() {
		return tfcQuadril;
	}

	public JTextField getTfMassaCMagra() {
		return tfMassaCMagra;
	}

	public JTextField getTfMassaCGorda() {
		return tfMassaCGorda;
	}

	public JTextField getTfDensidade() {
		return tfDensidade;
	}

	public JTextField getTfPedometroMedia() {
		return tfPedometroMedia;
	}

	public JTextField getTfPedometro1() {
		return tfPedometro1;
	}

	public JTextField getTfPedometro2() {
		return tfPedometro2;
	}

	public JTextField getTfPedometro3() {
		return tfPedometro3;
	}

	public JTextField getTfPedometroClass() {
		return tfPedometroClass;
	}

	public JTextField getTfSentarAlcanca() {
		return tfSentarAlcanca;
	}

	public JTextField getTfNivelFlexib() {
		return tfNivelFlexib;
	}

	public JTextField getTfPercGord() {
		return tfPercGord;
	}

	public JTextField getTfRiscoSaude() {
		return tfRiscoSaude;
	}

	public JTextField getTfRazaoCintQuad() {
		return tfRazaoCintQuad;
	}

	public FormAntropometriaSwing() {
		initialize();
		this.controller = new FormAntropometriaCT();
	}

	private void initialize() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Antropometria Inicial");
		setBounds(100, 100, 771, 510);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		lbCpfCliente = new JLabel("CPF");
		lbCpfCliente.setBounds(10, 9, 32, 19);
		lbCpfCliente.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbCpfCliente);

		lbPeso = new JLabel("Peso (kg)");
		lbPeso.setBounds(121, 32, 65, 14);
		lbPeso.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPeso);

		lbAltura = new JLabel("Altura (mt)");
		lbAltura.setBounds(121, 57, 65, 14);
		lbAltura.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbAltura);

		lbImc = new JLabel("IMC");
		lbImc.setBounds(121, 82, 65, 14);
		lbImc.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbImc);

		lbCImc = new JLabel("Class. IMC");
		lbCImc.setBounds(121, 107, 65, 14);
		lbCImc.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbCImc);

		lbPesoDes = new JLabel("Peso Desejável");
		lbPesoDes.setBounds(180, 274, 83, 14);
		lbPesoDes.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPesoDes);

		lbImcDes = new JLabel("IMC Desejável");
		lbImcDes.setBounds(180, 304, 83, 14);
		lbImcDes.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbImcDes);

		lbTipoComp = new JLabel("Tipo Compleição");
		lbTipoComp.setBounds(180, 364, 91, 14);
		lbTipoComp.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbTipoComp);

		lbAdqPeso = new JLabel("Adequação Peso(%)");
		lbAdqPeso.setBounds(329, 274, 118, 14);
		lbAdqPeso.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbAdqPeso);

		lbPesoAj = new JLabel("Peso Ajustado");
		lbPesoAj.setBounds(329, 304, 118, 14);
		lbPesoAj.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPesoAj);

		lbComp = new JLabel("Compleição");
		lbComp.setBounds(180, 334, 83, 14);
		lbComp.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbComp);

		lbDtCad = new JLabel("Data Cadastro");
		lbDtCad.setBounds(568, 381, 79, 22);
		lbDtCad.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbDtCad);

		lbMCG = new JLabel("Massa C. Gorda");
		lbMCG.setBounds(10, 334, 106, 14);
		lbMCG.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbMCG);

		lbDens = new JLabel("Densidade(ASCM)");
		lbDens.setBounds(10, 364, 106, 14);
		lbDens.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbDens);

		lbPed1 = new JLabel("Pedômetro 1°");
		lbPed1.setBounds(351, 32, 87, 14);
		lbPed1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPed1);

		lbPed2 = new JLabel("Pedômetro 2°");
		lbPed2.setBounds(351, 57, 87, 14);
		lbPed2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPed2);

		lbPed3 = new JLabel("Pedômetro 3°");
		lbPed3.setBounds(351, 82, 87, 14);
		lbPed3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPed3);

		lbPedMed = new JLabel("Pedômetro Média");
		lbPedMed.setBounds(518, 57, 112, 14);
		lbPedMed.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPedMed);

		lbPedClass = new JLabel("Pedômetro Class.");
		lbPedClass.setBounds(518, 32, 112, 14);
		lbPedClass.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPedClass);

		lbPcAbd = new JLabel("P.C. Abd.(mm)");
		lbPcAbd.setBounds(174, 170, 103, 14);
		lbPcAbd.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPcAbd);

		lbPcTor = new JLabel("P.C. Torax(mm)");
		lbPcTor.setBounds(174, 140, 103, 14);
		lbPcTor.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPcTor);

		lbPcTri = new JLabel("P.C. Triciptal(mm)");
		lbPcTri.setBounds(173, 230, 104, 14);
		lbPcTri.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPcTri);

		lbPcCoxa = new JLabel("P.C. Coxa(mm)");
		lbPcCoxa.setBounds(174, 200, 103, 14);
		lbPcCoxa.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPcCoxa);

		lbSomDob = new JLabel("Soma 3 D.C.");
		lbSomDob.setBounds(335, 170, 69, 14);
		lbSomDob.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbSomDob);

		lbPcSupra = new JLabel("P.C. Suprailiaca(mm)");
		lbPcSupra.setBounds(335, 140, 125, 14);
		lbPcSupra.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbPcSupra);

		lbNvFlex = new JLabel("Nível flexibilidade ");
		lbNvFlex.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbNvFlex.setBounds(503, 241, 115, 14);
		contentPane.add(lbNvFlex);

		lbMCM = new JLabel("Massa C. Magra");
		lbMCM.setBounds(10, 304, 106, 14);
		lbMCM.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		contentPane.add(lbMCM);

		lbCPunho = new JLabel("Circ. Punho(cm)");
		lbCPunho.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbCPunho.setBounds(10, 140, 106, 14);
		contentPane.add(lbCPunho);

		lbCCint = new JLabel("Circ. Cintura(cm)");
		lbCCint.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbCCint.setBounds(10, 170, 106, 14);
		contentPane.add(lbCCint);

		lbCQuad = new JLabel("Circ. Quadril(cm)");
		lbCQuad.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbCQuad.setBounds(10, 200, 106, 14);
		contentPane.add(lbCQuad);

		lbSentAlc = new JLabel("Sentar/Alcançar(Wells e Dillon)");
		lbSentAlc.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbSentAlc.setBounds(503, 211, 173, 14);
		contentPane.add(lbSentAlc);

		lbPercGord = new JLabel("% Gord.");
		lbPercGord.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbPercGord.setBounds(10, 274, 106, 14);
		contentPane.add(lbPercGord);

		lbRiscSaud = new JLabel("Risco a Saúde");
		lbRiscSaud.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbRiscSaud.setBounds(351, 107, 83, 14);
		contentPane.add(lbRiscSaud);

		lbRazCQ = new JLabel("Razão C.Q.(cm)");
		lbRazCQ.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lbRazCQ.setBounds(10, 230, 106, 14);
		contentPane.add(lbRazCQ);

		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			mascaraCPF.setPlaceholderCharacter('_');
			tfCpfA = new JFormattedTextField(mascaraCPF);
			tfCpfA.setBounds(47, 9, 170, 19);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "CPF Error! " + e.getMessage());
		}
		tfCpfA.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfCpfA);

		tfNomeCliente = new JTextField("Nome Cliente");
		tfNomeCliente.setBounds(262, 9, 476, 19);
		tfNomeCliente.setEditable(false);
		tfNomeCliente.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(tfNomeCliente);

		try {
			mascaraData = new MaskFormatter("##/##/####");
			mascaraData.setPlaceholderCharacter('_');
			tfDtCadastroA = new JFormattedTextField(mascaraData);
			tfDtCadastroA.setBounds(652, 379, 86, 19);
			tfDtCadastroA.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
			tfDtCadastroA.setColumns(10);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Date Error! " + e.getMessage());
		}
		contentPane.add(tfDtCadastroA);

		tfIdade = new JTextField();
		tfIdade.setHorizontalAlignment(SwingConstants.CENTER);
		tfIdade.setText("ID");
		tfIdade.setBounds(10, 31, 101, 39);
		tfIdade.setForeground(new Color(255, 128, 0));
		tfIdade.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		tfIdade.setEditable(false);
		contentPane.add(tfIdade);

		tfSexo = new JTextField();
		tfSexo.setHorizontalAlignment(SwingConstants.CENTER);
		tfSexo.setText("Sx");
		tfSexo.setForeground(new Color(255, 128, 0));
		tfSexo.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		tfSexo.setEditable(false);
		tfSexo.setBounds(10, 83, 101, 38);
		contentPane.add(tfSexo);

		tfPeso = new JTextField();
		
		tfPeso.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPeso.setBounds(196, 32, 50, 22);
		contentPane.add(tfPeso);

		tfAltura = new JTextField();
	
		tfAltura.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfAltura.setBounds(196, 57, 50, 22);
		contentPane.add(tfAltura);

		tfcPunho = new JTextField();
	
		tfcPunho.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfcPunho.setBounds(121, 140, 42, 22);
		contentPane.add(tfcPunho);

		tfcCintura = new JTextField();
		
		tfcCintura.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfcCintura.setBounds(121, 170, 42, 22);
		contentPane.add(tfcCintura);

		tfcQuadril = new JTextField();
		
		tfcQuadril.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfcQuadril.setBounds(121, 200, 42, 22);
		contentPane.add(tfcQuadril);

		tfRazaoCintQuad = new JTextField();
		tfRazaoCintQuad.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfRazaoCintQuad.setEditable(false);
		tfRazaoCintQuad.setBounds(121, 230, 42, 22);
		contentPane.add(tfRazaoCintQuad);

		tfIMC = new JTextField();
		tfIMC.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfIMC.setEditable(false);
		tfIMC.setBounds(196, 82, 50, 22);

		tfCIMC = new JTextField();
		tfCIMC.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCIMC.setEditable(false);
		tfCIMC.setBounds(196, 107, 128, 22);
		contentPane.add(tfIMC);
		contentPane.add(tfCIMC);

		tfPcTricip = new JTextField();
		tfPcTricip.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPcTricip.setBounds(278, 230, 42, 22);
		contentPane.add(tfPcTricip);

		tfPcCoxa = new JTextField();
		tfPcCoxa.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPcCoxa.setBounds(278, 200, 42, 22);
		contentPane.add(tfPcCoxa);

		tfPcAbdomem = new JTextField();
		tfPcAbdomem.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPcAbdomem.setBounds(278, 170, 42, 22);
		contentPane.add(tfPcAbdomem);

		tfPcTorax = new JTextField();
		tfPcTorax.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPcTorax.setBounds(278, 140, 42, 22);
		contentPane.add(tfPcTorax);

		tfPcSuprailiaca = new JTextField();
		tfPcSuprailiaca.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPcSuprailiaca.setBounds(470, 140, 42, 22);
		contentPane.add(tfPcSuprailiaca);

		tfSomaDobras = new JTextField();
		tfSomaDobras.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfSomaDobras.setEditable(false);
		tfSomaDobras.setBounds(470, 170, 42, 22);
		contentPane.add(tfSomaDobras);

		tfMassaCMagra = new JTextField();
		tfMassaCMagra.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfMassaCMagra.setEditable(false);
		tfMassaCMagra.setBounds(121, 304, 42, 22);
		contentPane.add(tfMassaCMagra);

		tfMassaCGorda = new JTextField();
		tfMassaCGorda.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfMassaCGorda.setEditable(false);
		tfMassaCGorda.setBounds(121, 334, 42, 22);
		contentPane.add(tfMassaCGorda);

		tfDensidade = new JTextField();
		tfDensidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfDensidade.setEditable(false);
		tfDensidade.setBounds(121, 364, 42, 22);
		contentPane.add(tfDensidade);

		tfPedometro1 = new JTextField();
		tfPedometro1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPedometro1.setBounds(442, 33, 66, 22);
		contentPane.add(tfPedometro1);

		tfPedometro2 = new JTextField();
		tfPedometro2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPedometro2.setBounds(442, 58, 66, 22);
		contentPane.add(tfPedometro2);

		tfPedometro3 = new JTextField();
		tfPedometro3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPedometro3.setBounds(442, 83, 66, 22);
		contentPane.add(tfPedometro3);

		tfPedometroMedia = new JTextField();
		tfPedometroMedia.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPedometroMedia.setEditable(false);
		tfPedometroMedia.setBounds(641, 58, 97, 22);
		contentPane.add(tfPedometroMedia);

		tfPedometroClass = new JTextField();
		tfPedometroClass.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPedometroClass.setEditable(false);
		tfPedometroClass.setBounds(641, 33, 97, 22);
		contentPane.add(tfPedometroClass);

		tfPesoDesejavel = new JTextField();
		tfPesoDesejavel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPesoDesejavel.setEditable(false);
		tfPesoDesejavel.setBounds(278, 274, 42, 22);
		contentPane.add(tfPesoDesejavel);

		tfIMCDesejavel = new JTextField();
		tfIMCDesejavel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfIMCDesejavel.setEditable(false);
		tfIMCDesejavel.setBounds(278, 304, 42, 22);
		contentPane.add(tfIMCDesejavel);

		tfAdequacaoPeso = new JTextField();
		tfAdequacaoPeso.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfAdequacaoPeso.setEditable(false);
		tfAdequacaoPeso.setBounds(455, 274, 42, 22);
		contentPane.add(tfAdequacaoPeso);

		tfPesoAjustado = new JTextField();
		tfPesoAjustado.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPesoAjustado.setEditable(false);
		tfPesoAjustado.setBounds(455, 304, 42, 22);
		contentPane.add(tfPesoAjustado);

		tfCompleicao = new JTextField();
		tfCompleicao.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfCompleicao.setEditable(false);
		tfCompleicao.setBounds(278, 334, 42, 22);
		contentPane.add(tfCompleicao);

		tfTipoComp = new JTextField();
		tfTipoComp.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfTipoComp.setEditable(false);
		tfTipoComp.setBounds(278, 364, 110, 22);
		contentPane.add(tfTipoComp);

		tfPercGord = new JTextField();
		tfPercGord.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfPercGord.setEditable(false);
		tfPercGord.setBounds(121, 274, 42, 22);
		contentPane.add(tfPercGord);

		tfRiscoSaude = new JTextField();
		tfRiscoSaude.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfRiscoSaude.setEditable(false);
		tfRiscoSaude.setBounds(442, 107, 205, 22);
		contentPane.add(tfRiscoSaude);

		tfSentarAlcanca = new JTextField();
		
		tfSentarAlcanca.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfSentarAlcanca.setBounds(682, 211, 56, 22);
		contentPane.add(tfSentarAlcanca);

		tfNivelFlexib = new JTextField();
		tfNivelFlexib.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfNivelFlexib.setEditable(false);
		tfNivelFlexib.setBounds(624, 241, 114, 22);
		contentPane.add(tfNivelFlexib);

		btCalc = new JButton();
		btCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickCalc();
			}
		});
		btCalc.setIcon(new ImageIcon(
				FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/Calculator-2-icon.png")));
		btCalc.setBounds(467, 350, 63, 57);
		contentPane.add(btCalc);

		btLcCpf = new JButton();
		btLcCpf.setBounds(227, 5, 32, 23);
		btLcCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickPesq();
				onClickCarregaObj();
			}
		});
		btLcCpf.setIcon(
				new ImageIcon(FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/lupaCinza.png")));
		contentPane.add(btLcCpf);

		btAtualiza = new JButton();
		btAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickAtualiza();
			}
		});
		btAtualiza.setIcon(
				new ImageIcon(FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/Save-as-icon.png")));
		btAtualiza.setBounds(564, 414, 36, 41);
		contentPane.add(btAtualiza);

		btExcluir = new JButton();
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickDelete();
			}
		});
		btExcluir.setIcon(new ImageIcon(
				FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/Actions-application-exit-icon.png")));
		btExcluir.setBounds(610, 414, 36, 41);
		contentPane.add(btExcluir);

		btSaveUser = new JButton();
		btSaveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onClickInsert();
			}
		});
		btSaveUser.setIcon(new ImageIcon(
				FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/Actions-contact-new-icon (1).png")));
		btSaveUser.setBounds(656, 414, 36, 41);
		contentPane.add(btSaveUser);

		btCancel = new JButton();
		btCancel.setIcon(new ImageIcon(FormAntropometriaSwing.class.getResource("/br/com/heartSystemX/icons/fechar.png")));
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evtSair) {
				int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Cancelar?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		btCancel.setBounds(702, 414, 36, 41);
		contentPane.add(btCancel);
	}

	private void onClickCalc() {
		try {
			controller.calc(this);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao realizar o calculo! ");
		}
	}

	private void onClickPesq() {
		try {
			controller.pesquisaCpf(this);
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
