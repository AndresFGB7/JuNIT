package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class PanelNuevo extends JPanel {
	
	private JLabel fondo,moto,jet,carro,avion,camioneta,puntero,enunciado,enunciado2;
	private JButton bAvion,bCarro,bMoto,bHelicoptero,bCamioneta,generar;
	private JTextPane textoMarca,textoModelo;
	
	
	public PanelNuevo() {
		
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
		
	}
	
	public void inicializarComponentes() {
		
		enunciado = new JLabel("CAMIONETA");
		enunciado.setBounds(79, 480, 412, 94);
		enunciado.setForeground(Color.black);
		enunciado.setFont(new Font("Phosphate",2,60));
		add(enunciado);
		
		enunciado2 = new JLabel(enunciado.getText());
		enunciado2.setBounds(78, 478, 412, 94);
		enunciado2.setForeground(Color.gray);
		enunciado2.setFont(new Font("Phosphate",2,60));
		add(enunciado2);
		
		ImageIcon bCar = new ImageIcon(getClass().getResource("/imagenes/"+"botonCarro.png"));
		bCarro = new JButton(bCar);
		bCarro.setActionCommand("CARROBOTON");
		bCarro.setBounds(512, 181, 80, 80);
		bCarro.setOpaque(false);
		bCarro.setBorderPainted(false);
		add(bCarro);
		
		ImageIcon bCam = new ImageIcon(getClass().getResource("/imagenes/"+"botonCamioneta.png"));
		bCamioneta = new JButton(bCam);
		bCamioneta.setActionCommand("CAMIONETABOTON");
		bCamioneta.setBounds(602, 181, 80, 80);
		bCamioneta.setOpaque(false);
		bCamioneta.setBorderPainted(false);
		add(bCamioneta);
		
		ImageIcon bMO = new ImageIcon(getClass().getResource("/imagenes/"+"botonMoto.png"));
		bMoto = new JButton(bMO);
		bMoto.setActionCommand("MOTOBOTON");
		bMoto.setBounds(692, 181, 80, 80);
		bMoto.setOpaque(false);
		bMoto.setBorderPainted(false);
		add(bMoto);
		
		ImageIcon bAvi = new ImageIcon(getClass().getResource("/imagenes/"+"botonAvion.png"));
		bAvion = new JButton(bAvi);
		bAvion.setActionCommand("AVIONBOTON");
		bAvion.setBounds(782, 181, 80, 80);
		bAvion.setOpaque(false);
		bAvion.setBorderPainted(false);
		add(bAvion);
		
		ImageIcon bHeli = new ImageIcon(getClass().getResource("/imagenes/"+"botonHelicoptero.png"));
		bHelicoptero = new JButton(bHeli);
		bHelicoptero.setActionCommand("HELICOPTEROBOTON");
		bHelicoptero.setBounds(872, 181, 80, 80);
		bHelicoptero.setOpaque(false);
		bHelicoptero.setBorderPainted(false);
		add(bHelicoptero);

		textoMarca= new JTextPane();
		textoMarca.setFont(new Font("Phosphate",2,17));
		textoMarca.setBounds(675, 285, 150, 25);
		add(textoMarca);
		
		generar = new JButton();
		generar.setBounds(675, 388, 114,25);
		add(generar);
		
		ImageIcon mot = new ImageIcon(getClass().getResource("/imagenes/"+"motocicleta.gif"));
		moto = new JLabel(mot);
		moto.setBounds(85, 153, 341, 341);
		moto.setVisible(false);
		add(moto);
		
		ImageIcon je = new ImageIcon(getClass().getResource("/imagenes/"+"helicoptero.gif"));
		jet = new JLabel(je);
		jet.setBounds(20, 110, 480, 480);
		jet.setVisible(false);
		add(jet);
		
		ImageIcon car = new ImageIcon(getClass().getResource("/imagenes/"+"carro.gif"));
		carro = new JLabel(car);
		carro.setBounds(20, 50, 500, 500);
		carro.setVisible(false);
		add(carro);
		
		ImageIcon cav= new ImageIcon(getClass().getResource("/imagenes/"+"avion.gif"));
		avion = new JLabel(cav);
		avion.setBounds(110, 180, 313, 313);
		avion.setVisible(true);
		add(avion);
		
		ImageIcon cami = new ImageIcon(getClass().getResource("/imagenes/"+"camioneta.gif"));
		camioneta = new JLabel(cami);
		camioneta.setBounds(35, 100, 440, 440);
		camioneta.setVisible(false);
		add(camioneta);

		ImageIcon punt = new ImageIcon(getClass().getResource("/imagenes/"+"puntero.gif"));
		puntero = new JLabel(punt);
		puntero.setBounds(502, 275, 40, 48);
		puntero.setVisible(true);
		add(puntero);
		
		puntero = new JLabel(punt);
		puntero.setBounds(502, 336, 40, 48);
		puntero.setVisible(true);
		add(puntero);
		
		puntero = new JLabel(punt);
		puntero.setBounds(502, 397, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(502, 458, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(725, 458, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		
		ImageIcon fond = new ImageIcon(getClass().getResource("/imagenes/"+"choose.png"));
		fondo = new JLabel(fond);
		fondo.setBounds(-1, 0, 974, 604);
		add(fondo);
	}

}
