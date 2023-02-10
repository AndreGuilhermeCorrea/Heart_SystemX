package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormInfSobre extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lbTexto;

	public FormInfSobre() {
		initialize();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Sobre");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		contentPane.setLayout(null);

		String texto = "<html><h1>SOBRE<hr></h1><br>"
				+ "<p>O avanço tecnológico permite ao mundo facilidades incríveis que vão além do conforto, "
				+ "entretanto, há um aumento significativo de doenças crônicas como diabetes, hipertenção, câncer, acidente vascular encefálico entre tantas outras.</p>"
				+ "<br><p>São problemas relacionados com obesidade, estresse, baixa-estima, sedentarismo, alto uso de alcool, tabaco e outras dorgas.</p>"
				+ "<p>Parte desse caos está diretamente relacionado a falta de atividade física, "
				+ "portanto essa prática além de proteger e promover a saúde na população, resulta no ganho significativo de benefícios.</p>"
				+ "<br><p>A prática de atividade física é também considerada lazer e visa reduzir os níveis de estresses como: "
				+ "ansiedade, irritabilidade e depressão, "
				+ "além de manter uma boa forma física e melhorar a qualidade de vida, autoimagem e autoestima do praticante, promovendo bem-estar.</p>"
				+ "</html>";

		lbTexto = new JLabel(texto);
		lbTexto.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbTexto.setBounds(10, 10, 744, 454);
		contentPane.add(lbTexto);
	}

}
