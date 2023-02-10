package br.com.heartSystemX.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

public class MasksSwing extends PlainDocument {

	private static final long serialVersionUID = 1L;

//classe responsável pelas máscaras de preenchimento e função idade

	public MaskFormatter mascaraData(JFormattedTextField textfield) throws ParseException {
		MaskFormatter masks = null;
		masks = new MaskFormatter("##/##/####");
		masks.setOverwriteMode(true);
		masks.setValidCharacters("0123456789");
		masks.setPlaceholderCharacter('_');
		masks.install(textfield);
		return masks;
	}

	public MaskFormatter mascaraCEL(JFormattedTextField textfield) throws ParseException {
		MaskFormatter masks = null;
		masks = new MaskFormatter("(##)#####-####");
		masks.setOverwriteMode(true);
		masks.setValidCharacters("0123456789");
		masks.setPlaceholderCharacter('_');
		masks.install(textfield);
		return masks;
	}

	public MaskFormatter mascaraCPF(JFormattedTextField textfield) throws ParseException {
		MaskFormatter masks = null;
		masks = new MaskFormatter("###.###.###-##");
		masks.setOverwriteMode(true);
		masks.setValidCharacters("0123456789");
		masks.setPlaceholderCharacter('_');
		masks.install(textfield);
		return masks;
	}

	public MaskFormatter mascaraCEP(JFormattedTextField textfield) throws ParseException {
		MaskFormatter masks = null;
		masks = new MaskFormatter("#####-###");
		masks.setOverwriteMode(true);
		masks.setValidCharacters("0123456789");
		masks.setPlaceholderCharacter('_');
		masks.install(textfield);
		return masks;
	}

	public JTextField tamTipCarac(int tamanho, String caracteres) {
		try {
			// quantidade de caracteres
			String quantidade = "";
			// método de repetição - qtd vezes o tamanho
			for (int i = 0; i < tamanho; i++) {
				// asterisco para aceitar qualquer coisa e crio a máscara
				quantidade = quantidade + "*";
			}
			
			// defino que a mascara possui essa
			// quantidade de elementos que foi informado em tamanho e
			// foi colocada com * dentro de quantidade
			javax.swing.text.MaskFormatter nome = new javax.swing.text.MaskFormatter(quantidade);

			// defino que o parâmetro caracter recebido pelo
			// método contém os caracteres válidos
			nome.setValidCharacters(caracteres);
			// retorno da JFormattedTextField com a mascara que foi criada
			return new javax.swing.JFormattedTextField(nome);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro");
			// retorno um JTextField vazio se erro
			return new JTextField();
		}
	}

	public static String calcIdade(String tfDtNasc) throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dtFormatada = formato.parse(tfDtNasc);

		Calendar dateOfBirth = new GregorianCalendar();
		dateOfBirth.setTime(dtFormatada);

		// Cria um objeto calendar com a data atual
		Calendar today = Calendar.getInstance();

		// Obtém a idade baseado no ano
		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		dateOfBirth.add(Calendar.YEAR, age);

		// se a data de hoje é antes da data de Nascimento, então diminui 1(um)
		if (today.before(dateOfBirth)) {
			age--;
		}
		// conversao int para string
		String idade = Integer.toString(age);
		return idade;
	}

}
