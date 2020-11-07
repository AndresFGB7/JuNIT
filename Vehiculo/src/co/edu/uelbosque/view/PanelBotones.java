package co.edu.uelbosque.view;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
public class PanelBotones extends JPanel{
	private JLabel fondo;
	public PanelBotones() {
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(973,107));
		
		ImageIcon backGround = new ImageIcon(getClass().getResource("/imagenes/"+"botonesFondo.png"));
		fondo = new JLabel(backGround);
		fondo.setBounds(-1, 0, 973, 107);
		add(fondo);
		
		
	}

}
