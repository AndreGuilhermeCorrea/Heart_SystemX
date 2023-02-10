package br.com.heartSystemX.application;

import java.awt.EventQueue;

import br.com.heartSystemX.view.FormLoginSwing;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLoginSwing frame = new FormLoginSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
