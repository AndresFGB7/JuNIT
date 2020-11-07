package co.edu.uelbosque.view;
import java.awt.Color;

import javax.swing.*;
public class PanelCatalogo extends JPanel{
	private JLabel fondo;
	public PanelCatalogo() {
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
	}

	
	public void inicializarComponentes() {
	
	
		
		ImageIcon backGround = new ImageIcon(getClass().getResource("/imagenes/"+"fondoCatalogo.png"));
		fondo = new JLabel(backGround);
		fondo.setBounds(0, 0, 972, 495);
		add(fondo);
		setBackground(Color.BLACK);
		
	}
}
