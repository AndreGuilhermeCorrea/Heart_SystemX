package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormInfQuestionarios extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lbTexto;

	public FormInfQuestionarios() {
		initialize();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Questionários");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		String texto = "<html><h1>SOBRE OS QUESTIONÁRIOS PSICOLÓGICOS<hr></h1>"
				+ "<br><h2>Abordagem psicológica ao cliente usuário do programa.</h2>"
				+ "<br>A finalidade desse questionário se baseia na integralidade, permitindo portando a interação dos profissionais envolvidos para com os usuários."
				+ "<br>Dis-se que ato de conversar é pautado na afeição mútua potanto é uma estratégia que deve ser considerada."
				+ "<br>Esse projeto visa construir práticas que permitam contribuir na elaboração de ações nas quais possamos construir em conjunto uma sociedade saudável e justa."
				+ "</html>";

		lbTexto = new JLabel(texto);
		lbTexto.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbTexto.setBounds(10, 10, 744, 454);
		contentPane.add(lbTexto);
	}
	/*
	 * Abordagem psicológica ao cliente usuário do programa
	 */

	/*
	 * 1- primeiroHP Tem interesse em acompanhamento Psicológico? 2- segundoHP
	 * Possui alguma patologia limitante para exercicio do Programa? 3- terceiroHP
	 * Possui sentimento de tristeza com frequencia? 4- quartoHP Possui sentimento
	 * de solidão com frequencia? 5- quintoHP Possui algum transtorno? 6- sextoHP Os
	 * pensamentos são organizados 7- setimoHP A linguagem e o diálogo são claros?
	 * 8- oitavoHP Possui dificuldade de concentração? 9- nonoHP Possui dificuldade
	 * de memorizar? 10- decimoHP Faz acompanhamento com psicológo ou psiquiatra?
	 * 11- decimoPrimeiroHP Já fez acompanhamento com psicológo ou psiquiatra? 12-
	 * decimoSegundoHP Sente-se Amado ou acolhido por Amigos e/ou Familiares? 13-
	 * decimoTerceiroHP Dorme bem? 14- decimoQuartoHP Se Automedica? 15-
	 * decimoQuintoHP Faz uso elevado de Álcool? 16- decimoSextoHP Faz uso de
	 * Drogas? 17- decimoSetimoHP Possui bom relacionamento Familiar? 18-
	 * decimoOitavoHP Possui bom relacionamento Social? 19- decimoNonoHP Prática
	 * atividade física? 20- vigesimoHP Voce possui planos para o futuro? 21-
	 * vigesimoPrimeiroHP Pra voce a vida vale a pena? 22- vigesimoSegundoHP Caso a
	 * morte surgisse ela seria bem vinda? 23- vigesimoTerceiroHP Voce ja cogitou se
	 * machucar/ferir/morrer? 24- vigesimoQuartoHP Voce ja tentou suícidio?
	 */

}
