package br.com.heartSystemX.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.Serializable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class FormInfPrograma extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	private JLabel lbTexto;
	private JScrollPane scrollPane;
	

	public FormInfPrograma() {
		initialize();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Questionários");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(775, 800));
		painel.setToolTipText("");
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(painel);
		
		painel.setLayout(null);

		String texto = "<html><h1>SOBRE O PROGRAMA<hr></h1>"
				+ ""
				+ ""
				+ ""
				+ ""
				+ "</html>";

		lbTexto = new JLabel(texto);
		lbTexto.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lbTexto.setBounds(10, 10, 725, 770);
		painel.add(lbTexto);
		setContentPane(scrollPane);

	}

}
