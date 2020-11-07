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
	private JButton bComparar;
	private JButton bAtras;
	
	private JLabel mostrarInfo;
	private JLabel mostrarInfo2;
	
	
	
	private JLabel mostrarInfo3;
	private JLabel mostrarInfo4;
	private JLabel mostrarInfo5;
	private JLabel mostrarInfo6;

	private JComboBox<String> comparar;

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
		
		
		//COMPARAR

		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		comparar = new JComboBox<String>();
		comparar.setBounds(100,200,100,25);
		comparar.setVisible(false);
		add(comparar);
		

	
		datos2 = new JComboBox<String>();
		datos2.setBounds(100,170,100,25);
		datos2.setVisible(false);
		add(datos2);
		
		bComparar = new JButton("Comparar");
		bComparar.setBounds(100,300,100,30);
		bComparar.setActionCommand("Compara");
		bComparar.setVisible(false);
		add(bComparar);		
		
		mostrarInfo3 = new JLabel();
		mostrarInfo3.setBounds(250,60,310,340);
		mostrarInfo3.setVisible(false);
		mostrarInfo3.setBackground(Color.white);
		mostrarInfo3.setFont(new Font("ARIAL",2,30));
		mostrarInfo3.setOpaque(false);
		mostrarInfo3.setForeground(Color.white);
		add(mostrarInfo3);
		mostrarInfo4 = new JLabel();
		mostrarInfo4.setBounds(248,60,310,340);
		mostrarInfo4.setVisible(false);
		mostrarInfo4.setBackground(Color.white);
		mostrarInfo4.setOpaque(false);
		mostrarInfo4.setFont(new Font("ARIAL",2,30));
		mostrarInfo4.setForeground(Color.black);
		add(mostrarInfo4);
		
		
		mostrarInfo5 = new JLabel();
		mostrarInfo5.setBounds(550,60,310,340);
		mostrarInfo5.setBackground(Color.white);
		mostrarInfo5.setFont(new Font("ARIAL",2,30));
		mostrarInfo5.setOpaque(false);
		mostrarInfo5.setVisible(false);
		mostrarInfo5.setForeground(Color.white);
		add(mostrarInfo5);
		mostrarInfo6 = new JLabel();
		mostrarInfo6.setBounds(548,60,310,340);
		mostrarInfo6.setBackground(Color.white);
		mostrarInfo6.setVisible(false);
		mostrarInfo6.setOpaque(false);
		mostrarInfo6.setFont(new Font("ARIAL",2,30));
		mostrarInfo6.setForeground(Color.black);
		add(mostrarInfo6);
	
	
		
		//COMBOBOX DE DATOS
		datos = new JComboBox<String>();
		datos.setBounds(100,120,100,27);
		add(datos);
		
		//BOTON
		buscar = new JButton("Mostrar");
		buscar.setBounds(100,300,100,30);
		buscar.setActionCommand("MOSTRAR");
		add(buscar);
		
		//VENTANA DATOS
		mostrarInfo = new JLabel();
		mostrarInfo.setBounds(450,60,400,340);
		mostrarInfo.setBackground(Color.white);
		mostrarInfo.setOpaque(false);
		mostrarInfo.setFont(new Font("ARIAL",2,30));
		mostrarInfo.setForeground(Color.white);
		add(mostrarInfo);
		mostrarInfo2 = new JLabel();
		mostrarInfo2.setBounds(448,60,400,340);
		mostrarInfo2.setBackground(Color.white);
		mostrarInfo2.setOpaque(false);
		mostrarInfo2.setFont(new Font("ARIAL",2,30));
		mostrarInfo2.setForeground(Color.black);
		add(mostrarInfo2);

		
		bAtras = new JButton("Atras");
		bAtras.setActionCommand("ATRAS");
		bAtras.setBounds(20,30,80,22);
		add(bAtras);
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

	/**
	 * @return the comparar
	 */
	public JComboBox<String> getComparar() {
		return comparar;
	}

	/**
	 * @param comparar the comparar to set
	 */
	public void setComparar(JComboBox<String> comparar) {
		this.comparar = comparar;
	}

	/**
	 * @return the datos1
	 */
	public JComboBox<String> getDatos1() {
		return datos1;
	}

	/**
	 * @param datos1 the datos1 to set
	 */
	public void setDatos1(JComboBox<String> datos1) {
		this.datos1 = datos1;
	}

	/**
	 * @return the datos2
	 */
	public JComboBox<String> getDatos2() {
		return datos2;
	}

	/**
	 * @param datos2 the datos2 to set
	 */
	public void setDatos2(JComboBox<String> datos2) {
		this.datos2 = datos2;
	}

	/**
	 * @return the bComparar
	 */
	public JButton getbComparar() {
		return bComparar;
	}

	/**
	 * @return the fondo
	 */
	public JLabel getFondo() {
		return fondo;
	}

	/**
	 * @param fondo the fondo to set
	 */
	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}


	/**
	 * @return the mostrarInfo3
	 */
	public JLabel getMostrarInfo3() {
		return mostrarInfo3;
	}

	/**
	 * @param mostrarInfo3 the mostrarInfo3 to set
	 */
	public void setMostrarInfo3(JLabel mostrarInfo3) {
		this.mostrarInfo3 = mostrarInfo3;
	}

	/**
	 * @return the bAtras
	 */
	public JButton getbAtras() {
		return bAtras;
	}

	/**
	 * @param bAtras the bAtras to set
	 */
	public void setbAtras(JButton bAtras) {
		this.bAtras = bAtras;
	}

	/**
	 * @return the mostrarInfo4
	 */
	public JLabel getMostrarInfo4() {
		return mostrarInfo4;
	}

	/**
	 * @param mostrarInfo4 the mostrarInfo4 to set
	 */
	public void setMostrarInfo4(JLabel mostrarInfo4) {
		this.mostrarInfo4 = mostrarInfo4;
	}

	/**
	 * @return the mostrarInfo5
	 */
	public JLabel getMostrarInfo5() {
		return mostrarInfo5;
	}

	/**
	 * @param mostrarInfo5 the mostrarInfo5 to set
	 */
	public void setMostrarInfo5(JLabel mostrarInfo5) {
		this.mostrarInfo5 = mostrarInfo5;
	}

	/**
	 * @return the mostrarInfo6
	 */
	public JLabel getMostrarInfo6() {
		return mostrarInfo6;
	}

	/**
	 * @param mostrarInfo6 the mostrarInfo6 to set
	 */
	public void setMostrarInfo6(JLabel mostrarInfo6) {
		this.mostrarInfo6 = mostrarInfo6;
	}

	/**
	 * @param bComparar the bComparar to set
	 */
	public void setbComparar(JButton bComparar) {
		this.bComparar = bComparar;
	}
}
