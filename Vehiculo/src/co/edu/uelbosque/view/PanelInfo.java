package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Esta clase muestra la lista completa de vehiculos
 *
 */
public class PanelInfo extends JPanel {
	JTextArea mostrarInfo3;
	
	/**
	 * El metodo constructor de la clase Panel 	Info
	 */
	
	public PanelInfo() {
		setLayout(null);
		setPreferredSize(new Dimension(500,5000));
		inicializarComponentes();
		setVisible(true);
	}

	/**
	 * Este metodo inicializa los Componentes de la clase  Panel Info
	 * 
	 */
	private void inicializarComponentes() {
		
		mostrarInfo3 = new JTextArea();
		mostrarInfo3.setBounds(0,0,500,5000);
		mostrarInfo3.setFont(new Font("Arial Black",2,20));
		mostrarInfo3.setBackground(Color.black);
		mostrarInfo3.setForeground(Color.white);
		mostrarInfo3.setOpaque(true);
	//	mostrarInfo3.setEnabled(false);
		add(mostrarInfo3);
	}

	/**
	 * @return the mostrarInfo3
	 */
	public JTextArea getMostrarInfo3() {
		return mostrarInfo3;
	}

	/**
	 * @param mostrarInfo3 the mostrarInfo3 to set
	 */
	public void setMostrarInfo3(JTextArea mostrarInfo3) {
		this.mostrarInfo3 = mostrarInfo3;
	}



}
