package br.edu.udc.es.dp.frontcontroller;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelaMain {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		final JFrame frame = new JFrame("TelaMain");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JTextField nomeTela = new JTextField(15);
		frame.getContentPane().add(nomeTela);
		
		final JButton botao = new JButton("Abrir -> ");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String request = nomeTela.getText();
				new FrontController().handleRequest(request);
			}
		});
		frame.getContentPane().add(botao);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}