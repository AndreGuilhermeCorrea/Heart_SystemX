package br.com.heartSystemX.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//Classe em construção
public class Alertas {
	
	public static void showAlert(String title, String header, String content, AlertType type) {
		Alert alertas = new Alert(type);
		alertas.setTitle(title);
		alertas.setHeaderText(header);
		alertas.setContentText(content);
		alertas.show();
	}
}
