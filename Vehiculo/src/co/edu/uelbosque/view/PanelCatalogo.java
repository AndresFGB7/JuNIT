package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

/**
 * Esta clase agrega muestra el catalogo de carros
 *
 */
public class PanelCatalogo extends JPanel {
	private JLabel fondo;
	private JComboBox<String> datos;
	private JButton buscar;
	
	private JLabel mostrarInfo;
	private JLabel mostrarInfo2;

	private JComboBox<String> comparar;
	private JComboBox<String> placas;

	private JComboBox<String> datos1;
	private JComboBox<String> datos2;
	private JButton[] botones;
	
	/**
	 * El metodo constructor de la clase Panel Catalogo
	 */
	public PanelCatalogo() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);

	}

	/**
	 * Este metodo inicializa los Componentes de la clase  Panel Catalogo
	 * 
	 */
	public void inicializarComponentes() {
	
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//COMBOBOX DE DATOS
		datos = new JComboBox<String>();
		datos.setBounds(100,120,100,20);
		add(datos);
		
		//BOTON
		buscar = new JButton("Mostrar");
		buscar.setBounds(100,300,100,20);
		buscar.setActionCommand("MOSTRAR");
		add(buscar);
		
		//VENTANA DATOS
		mostrarInfo = new JLabel();
		mostrarInfo.setBounds(450,100,400,300);
		mostrarInfo.setBackground(Color.white);
		mostrarInfo.setOpaque(false);
		mostrarInfo.setFont(new Font("ARIAL",2,30));
		mostrarInfo.setForeground(Color.white);
		add(mostrarInfo);
		mostrarInfo2 = new JLabel();
		mostrarInfo2.setBounds(448,100,400,300);
		mostrarInfo2.setBackground(Color.white);
		mostrarInfo2.setOpaque(false);
		mostrarInfo2.setFont(new Font("ARIAL",2,30));
		mostrarInfo2.setForeground(Color.black);
		add(mostrarInfo2);

		//FONDO
		ImageIcon backGround = new ImageIcon(getClass().getResource("/imagenes/" + "fondoCatalogo.png"));
		fondo = new JLabel(backGround);
		fondo.setBounds(0, 0, 972, 495);
		add(fondo);
		setBackground(Color.black);
	}

	/**
	 * @return the datos
	 */
	public JComboBox<String> getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(JComboBox<String> datos) {
		this.datos = datos;
	}

	/**
	 * @return the buscar
	 */
	public JButton getBuscar() {
		return buscar;
	}

	/**
	 * @param buscar the buscar to set
	 */
	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	/**
	 * @return the mostrarInfo
	 */
	public JLabel getMostrarInfo() {
		return mostrarInfo;
	}

	/**
	 * @param mostrarInfo the mostrarInfo to set
	 */
	public void setMostrarInfo(JLabel mostrarInfo) {
		this.mostrarInfo = mostrarInfo;
	}

	/**
	 * @return the botones
	 */
	public JButton[] getBotones() {
		return botones;
	}

	/**
	 * @param botones the botones to set
	 */
	public void setBotones(JButton[] botones) {
		this.botones = botones;
	}

	/**
	 * @return the mostrarInfo2
	 */
	public JLabel getMostrarInfo2() {
		return mostrarInfo2;
	}

	/**
	 * @param mostrarInfo2 the mostrarInfo2 to set
	 */
	public void setMostrarInfo2(JLabel mostrarInfo2) {
		this.mostrarInfo2 = mostrarInfo2;
	}
}
