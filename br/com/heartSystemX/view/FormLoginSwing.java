package br.com.heartSystemX.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.heartSystemX.model.dao.impl.UsuarioDaoJDBC;
import br.com.heartSystemX.model.entities.Usuario;

public class FormLoginSwing extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField tfSenha;
	private JButton btLogin, btCancel;
	private JLabel lbUsuario, lbSenha;

	private UsuarioDaoJDBC objUsuarioDaoJDBC;

	private FormPrincipalSwing inicial;

	public void logar() throws IOException {

		try {
			String usuario = tfUsuario.getText();
			String senha = new String(tfSenha.getPassword());

			Usuario objUser = new Usuario();
			objUser.setUsuario(usuario);
			objUser.setSenha(senha);

			// instancia da classe UsuarioDaoJDBC
			objUsuarioDaoJDBC = new UsuarioDaoJDBC(null);

			ResultSet rs = objUsuarioDaoJDBC.logar(objUser);

			if (rs.next()) {

				inicial = new FormPrincipalSwing();
				inicial.setVisible(true);
				// seta o label da tela de inicio com nome do usuario
				inicial.lbUsuario.setText("Usuário: " + objUser.getUsuario());
				this.dispose(); // fecha tela de login ao logar

			} else {
				JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
				tfUsuario.setText("");
				tfSenha.setText("");
			}
			tfUsuario.setText("");
			tfSenha.setText("");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "UsuarioDao: " + e.getMessage());
		}

	}

	public FormLoginSwing() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FormLoginSwing.class.getResource("/br/com/heartSystemX/icons/health-64.png")));

		setResizable(false);
		setTitle("AGC - LogDesSaude/Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);// localizar o painel no centro da tela
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lbUsuario.setBounds(40, 39, 51, 22);
		contentPane.add(lbUsuario);

		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfUsuario.setBounds(102, 41, 112, 20);
		contentPane.add(tfUsuario);

		lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lbSenha.setBounds(40, 67, 45, 22);
		contentPane.add(lbSenha);

		tfSenha = new JPasswordField();
		tfSenha.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		tfSenha.setBounds(102, 69, 112, 20);
		contentPane.add(tfSenha);

		btLogin = new JButton("Login");
		btLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btLogin.setBounds(71, 110, 72, 22);
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					logar();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Impossível carregar a classe: " + e.getMessage());
				}
			}
		});
		contentPane.add(btLogin);

		btCancel = new JButton("Cancel");
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sai = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar?", "Atenção",
						JOptionPane.YES_NO_OPTION);
				if (sai == JOptionPane.YES_OPTION) {
					// fecha conexao
					System.exit(0);
				}
			}
		});
		btCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btCancel.setBounds(167, 110, 72, 22);
		contentPane.add(btCancel);

	}

}
