package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormInfAntropometria extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JLabel lbTexto;

	public FormInfAntropometria() {
		initialize();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Antropometria");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		String texto = "<html><h1>INSTRUÇÕES PARA OS TESTES DA COMPOSICÃO CORPORAL<hr></h1>"
				+ " <br>1)Comparecer trajando roupas que facilitam as medidas."
				+ "<br>2)Manter seus padrões alimentar e de ingestão de líquidos."
				+ "<br>3)Evitar consumo de alimentos capazes de produzir quantidades excessivas de gases no trato gastrintestinal."
				+ "<br>4)Jejum de quatro horas que antecedem os testes."
				+ "<br>5)Evitar atividades físicas exaustivas nas últimas 24 horas que antecedem os testes."
				+ "<br>6)Urinar e evacuar antes do teste. "
				+ "<br>7)Não fumar 3 horas antes dos testes. </html>";
	
		lbTexto = new JLabel(texto);
		lbTexto.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbTexto.setBounds(10, 10, 744, 454);
		contentPane.add(lbTexto);

	}
}
