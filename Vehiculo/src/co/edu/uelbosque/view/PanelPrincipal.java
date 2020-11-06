package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PanelPrincipal extends JPanel {

	private JButton catalogo,agregar,comprar;
	private JLabel fondo,hand1,hand2,hand3,diamante1,diamante2;
	
	public PanelPrincipal() {
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
	
		ImageIcon diam = new ImageIcon(getClass().getResource("/imagenes/"+"humo.gif"));
		
		diamante1 = new JLabel(diam);
        diamante1.setBounds(120, 83, 119, 119);
        add(diamante1);
        
        diamante2 = new JLabel(diam);
        diamante2.setBounds(764, 83, 119, 119);
        add(diamante2);
		
		
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
		
		
		ImageIcon fond = new ImageIcon(getClass().getResource("/imagenes/"+"inicio.png"));
		fondo = new JLabel(fond);
		fondo.setBounds(-1, 0, 974, 604);
		add(fondo);

	}

	public JButton getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(JButton catalogo) {
		this.catalogo = catalogo;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getComprar() {
		return comprar;
	}

	public void setComprar(JButton comprar) {
		this.comprar = comprar;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getHand1() {
		return hand1;
	}

	public void setHand1(JLabel hand1) {
		this.hand1 = hand1;
	}

	public JLabel getHand2() {
		return hand2;
	}

	public void setHand2(JLabel hand2) {
		this.hand2 = hand2;
	}

	public JLabel getHand3() {
		return hand3;
	}

	public void setHand3(JLabel hand3) {
		this.hand3 = hand3;
	}

	public JLabel getDiamante1() {
		return diamante1;
	}

	public void setDiamante1(JLabel diamante1) {
		this.diamante1 = diamante1;
	}

	public JLabel getDiamante2() {
		return diamante2;
	}

	public void setDiamante2(JLabel diamante2) {
		this.diamante2 = diamante2;
	}
	
	
}
