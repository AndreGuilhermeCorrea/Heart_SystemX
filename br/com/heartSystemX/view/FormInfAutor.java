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

public class FormInfAutor extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	private JLabel lbTexto, lbTexto2;
	private JScrollPane scrollPane;

	public FormInfAutor() {
		initialize();
	}

	private void initialize() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormPsicoSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));
		setTitle("AGC - Logística de Desenvolvimeto para Saúde/Sobre o Autor");
		setBounds(100, 100, 780, 515);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		painel = new JPanel();
		painel.setPreferredSize(new Dimension(775, 800));
		painel.setToolTipText("");
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(painel);

		String contato = "<html><h3>CONTATO:</h3></html>";

		String resumo = "<html><h3>SOBRE O AUTOR:<hr></h3></html>";

		painel.setLayout(null);

		lbTexto = new JLabel(contato);
		lbTexto.setBounds(550, 610, 190, 180);
		lbTexto.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		painel.add(lbTexto);

		lbTexto2 = new JLabel(resumo);
		lbTexto2.setBounds(15, 10, 520, 770);
		lbTexto2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		painel.add(lbTexto2);
		setContentPane(scrollPane);

	}
}
