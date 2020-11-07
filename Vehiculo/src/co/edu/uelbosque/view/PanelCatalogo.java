package co.edu.uelbosque.view;

import java.awt.Color;
import javax.swing.*;



public class PanelCatalogo extends JPanel {
	private JLabel fondo;
	private JPanel slide;
	private JComboBox<String> datos;
	private JButton buscar;
	
	private JLabel mostrarInfo;
	
	private JButton[] botones;
	public PanelCatalogo() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);

	}

	public void inicializarComponentes() {
		
		
		datos = new JComboBox<String>();
		datos.setBounds(100,120,100,20);
		add(datos);
		
		buscar = new JButton("Mostrar");
		buscar.setBounds(100,300,100,20);
		add(buscar);
		
		mostrarInfo = new JLabel();
		mostrarInfo.setBounds(450,100,400,300);
		mostrarInfo.setBackground(Color.white);
		mostrarInfo.setOpaque(true);
		add(mostrarInfo);
		
		ImageIcon backGround = new ImageIcon(getClass().getResource("/imagenes/" + "fondoCatalogo.png"));
		fondo = new JLabel(backGround);
		fondo.setBounds(0, 0, 972, 495);
		add(fondo);
		setBackground(Color.black);
	}
}
