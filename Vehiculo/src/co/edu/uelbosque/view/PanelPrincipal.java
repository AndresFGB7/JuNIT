package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/**
 * Esta clase agrega los botones principales del programa
 *
 */

public class PanelPrincipal extends JPanel {

	private JButton catalogo,agregar,comprar;
	private JLabel fondo,hand1,hand2,hand3,diamante1,diamante2;
	/**
	 * El metodo constructor de la clase Panel Principal
	 */
	public PanelPrincipal() {
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
	}
	/**
	 * Este metodo inicializa los Componentes de la clase  Panel Principal
	 * 
	 */
	public void inicializarComponentes() {
	
		
		//LABEL DIAMANTES TITULO
		ImageIcon diam = new ImageIcon(getClass().getResource("/imagenes/"+"humo.gif"));
		
		diamante1 = new JLabel(diam);
        diamante1.setBounds(120, 83, 119, 119);
        add(diamante1);
        
        diamante2 = new JLabel(diam);
        diamante2.setBounds(764, 83, 119, 119);
        add(diamante2);
		
		//INDICADORES BOTONES
		ImageIcon Hand = new ImageIcon(getClass().getResource("/imagenes/"+"hand.gif"));
		hand1 = new JLabel(Hand);
		hand1.setBounds(274, 314,97, 58);
		hand1.setVisible(false);
		add(hand1);
		
		hand2 = new JLabel(Hand);
		hand2.setBounds(274, 386,97, 58);
		hand2.setVisible(false);
		add(hand2);
		
		hand3 = new JLabel(Hand);
		hand3.setBounds(274, 458,97, 58);
		hand3.setVisible(false);
		add(hand3);
		
		//BOTONES PANEL
		ImageIcon coat = new ImageIcon(getClass().getResource("/imagenes/"+"catalogo.png"));
		catalogo = new JButton(coat);
		catalogo.setBounds(385, 317, 242, 41);
		catalogo.setActionCommand("CATALOGO");
		add(catalogo);
		
		ImageIcon agre = new ImageIcon(getClass().getResource("/imagenes/"+"agregar.png"));
		agregar = new JButton(agre);
		agregar.setBounds(385, 391, 242, 41);
		agregar.setActionCommand("AGREGAR");
		add(agregar);
		
		ImageIcon comp = new ImageIcon(getClass().getResource("/imagenes/"+"comprar.png"));
		comprar = new JButton(comp);
		comprar.setBounds(385, 463, 242, 41);
		comprar.setActionCommand("COMPRAR");
		add(comprar);
		
		//FONDO
		ImageIcon fond = new ImageIcon(getClass().getResource("/imagenes/"+"inicio.png"));
		fondo = new JLabel(fond);
		fondo.setBounds(-1, 0, 974, 604);
		add(fondo);

	}
	/**
	 * @return the catalogo
	 */
	public JButton getCatalogo() {
		return catalogo;
	}
	/**
	 * @param catalogo the catalogo to set
	 */
	public void setCatalogo(JButton catalogo) {
		this.catalogo = catalogo;
	}
	/**
	 * @return the agregar
	 */
	public JButton getAgregar() {
		return agregar;
	}
	/**
	 * @param agregar the agregar to set
	 */
	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}
	/**
	 * @return the comprar
	 */
	public JButton getComprar() {
		return comprar;
	}
	/**
	 * @param comprar the comprar to set
	 */
	public void setComprar(JButton comprar) {
		this.comprar = comprar;
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
	 * @return the hand1
	 */
	public JLabel getHand1() {
		return hand1;
	}
	/**
	 * @param hand1 the hand1 to set
	 */
	public void setHand1(JLabel hand1) {
		this.hand1 = hand1;
	}
	/**
	 * @return the hand2
	 */
	public JLabel getHand2() {
		return hand2;
	}
	/**
	 * @param hand2 the hand2 to set
	 */
	public void setHand2(JLabel hand2) {
		this.hand2 = hand2;
	}
	/**
	 * @return the hand3
	 */
	public JLabel getHand3() {
		return hand3;
	}
	/**
	 * @param hand3 the hand3 to set
	 */
	public void setHand3(JLabel hand3) {
		this.hand3 = hand3;
	}
	/**
	 * @return the diamante1
	 */
	public JLabel getDiamante1() {
		return diamante1;
	}
	/**
	 * @param diamante1 the diamante1 to set
	 */
	public void setDiamante1(JLabel diamante1) {
		this.diamante1 = diamante1;
	}
	/**
	 * @return the diamante2
	 */
	public JLabel getDiamante2() {
		return diamante2;
	}
	/**
	 * @param diamante2 the diamante2 to set
	 */
	public void setDiamante2(JLabel diamante2) {
		this.diamante2 = diamante2;
	}

	
	
}
