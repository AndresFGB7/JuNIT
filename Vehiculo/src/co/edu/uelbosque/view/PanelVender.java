package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Esta clase permite vender automoviles
 *
 */
public class PanelVender extends JPanel {

	private JLabel placa, fondo, marca, modelo, puertas, asientos;
	private JLabel[] labelMuestra;
	private JButton comprar, carro, moto, avion, camioneta, helicoptero, ver,bAtras;
	private JComboBox<String> datosVenta;

	/**
	 * El metodo constructor de la clase Panel Vender
	 */
	public PanelVender() {

		setLayout(null);

		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Este metodo inicializa los Componentes de la clase Panel Vender
	 * 
	 */

	private void inicializarComponentes() {
		
		ImageIcon back = new ImageIcon(getClass().getResource("/imagenes/" + "botonAtras.png"));
		bAtras = new JButton(back);
		bAtras.setActionCommand("ATRAS");
		bAtras.setBorderPainted(false);
		bAtras.setOpaque(false);
		bAtras.setBackground(Color.white);
		bAtras.setBounds(20,20,64,64);
		add(bAtras);
		

		// LABEL PLACA
		placa = new JLabel();
		placa.setFont(new Font("Phosphate", 2, 35));
		// placa.setOpaque(false);
		placa.setForeground(Color.BLACK);
		placa.setBounds(644, 36, 170, 43);
		add(placa);

		// BOTONES

		ver = newButtonTipe("botonVer");
		ver.setActionCommand("VERAUTO");
		ver.setBounds(70, 405, 332, 62);
		add(ver);

		comprar = newButtonTipe("botonComprar");
		comprar.setBounds(70, 480, 332, 62);
		comprar.setActionCommand("COMPRARAUTO");
		add(comprar);

		carro = newButtonTipe("botonCarro2");
		carro.setBounds(16, 170, 77, 77);
		carro.setActionCommand("CARROVENTA");
		add(carro);

		camioneta = newButtonTipe("botonCamioneta2");
		camioneta.setBounds(113, 170, 77, 77);
		camioneta.setActionCommand("CAMIONETAVENTA");
		add(camioneta);

		moto = newButtonTipe("botonMoto2");
		moto.setBounds(213, 170, 77, 77);
		moto.setActionCommand("MOTOVENTA");
		add(moto);

		avion = newButtonTipe("botonAvion2");
		avion.setBounds(309, 168, 77, 77);
		avion.setActionCommand("AVIONVENTA");
		add(avion);

		helicoptero = newButtonTipe("botonHelicoptero2");
		helicoptero.setBounds(409, 168, 77, 77);
		helicoptero.setActionCommand("HELICOPTEROVENTA");
		add(helicoptero);

		// INFORMACION

		marca = new JLabel();
		marca.setBounds(770, 390, 231, 35);
		marca.setFont(new Font("Arial Black", 2, 20));
		add(marca);

		modelo = new JLabel();
		modelo.setBounds(780, 445, 231, 35);
		modelo.setFont(new Font("Arial Black", 2, 20));
		add(modelo);

		puertas = new JLabel();
		puertas.setBounds(800, 490, 231, 35);
		puertas.setFont(new Font("Arial Black", 2, 20));
		add(puertas);

		asientos = new JLabel();
		asientos.setBounds(800, 530, 231, 35);
		asientos.setFont(new Font("Arial Black", 2, 20));
		add(asientos);

		//LABELS MUESTRARIO
				labelMuestra = new JLabel[5];
				labelMuestra[0] = newLMuestra("motocicleta");
				labelMuestra[0].setBounds(560, 50, 341, 341);
				add(labelMuestra[0]);

				labelMuestra[1] = newLMuestra("helicoptero");
				labelMuestra[1].setBounds(570, 60, 341, 341);
				add(labelMuestra[1]);
				
				labelMuestra[2] = newLMuestra("carro");
				labelMuestra[2].setBounds(500, -50, 500, 500);
				add(labelMuestra[2]);
				
				labelMuestra[3] = newLMuestra("avion");
				labelMuestra[3].setBounds(600, 80, 313, 313);
				add(labelMuestra[3]);
				
				labelMuestra[4] = newLMuestra("camioneta");
				labelMuestra[4].setBounds(530, 20, 440, 440);
				add(labelMuestra[4]);
				
		
		// COMBOBOX

	
		datosVenta = new JComboBox<String>();
		datosVenta.setBounds(70, 325, 332, 62);
		datosVenta.setFont(new Font("Arial Black", 2, 20));
		add(datosVenta);
	

		// FONDO
		ImageIcon fond = new ImageIcon(getClass().getResource("/imagenes/" + "fondoVender.png"));
		fondo = new JLabel(fond);
		fondo.setBounds(0, 0, 974, 604);
		add(fondo);

	}

	/**
	 * Este Metodo crea un label y le agrega el gif
	 * 
	 * @param a - el nombre del gif en la carpeta imagenes
	 * @return JLabel
	 */
	private JLabel newLMuestra(String a) {
		ImageIcon mot = new ImageIcon(getClass().getResource("/imagenes/" + a+".gif"));
		JLabel label = new JLabel(mot);
		label.setVisible(false);
		return label;
	}

	/**
	 * Este metodo crea un nuevo metodo creando un boton
	 * 
	 * @param comando - El comando a dar al boton String!=null
	 * @return JButton
	 */
	private JButton newButtonTipe(String comando) {
		JButton boton;
		ImageIcon b = new ImageIcon(getClass().getResource("/imagenes/" + comando + ".png"));
		boton = new JButton(b);
		boton.setBorderPainted(false);
		boton.setBackground(Color.black);
		boton.setOpaque(false);
		return boton;
	}

	/**
	 * @return the placa
	 */
	public JLabel getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(JLabel placa) {
		this.placa = placa;
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
	 * @return the marca
	 */
	public JLabel getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(JLabel marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public JLabel getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(JLabel modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the puertas
	 */
	public JLabel getPuertas() {
		return puertas;
	}

	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(JLabel puertas) {
		this.puertas = puertas;
	}

	/**
	 * @return the asientos
	 */
	public JLabel getAsientos() {
		return asientos;
	}

	/**
	 * @param asientos the asientos to set
	 */
	public void setAsientos(JLabel asientos) {
		this.asientos = asientos;
	}

	
	/**
	 * @return the labelMuestra
	 */
	public JLabel getLabelMuestra(int a) {
		return labelMuestra[a];
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
	 * @return the carro
	 */
	public JButton getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(JButton carro) {
		this.carro = carro;
	}

	/**
	 * @return the moto
	 */
	public JButton getMoto() {
		return moto;
	}

	/**
	 * @param moto the moto to set
	 */
	public void setMoto(JButton moto) {
		this.moto = moto;
	}

	/**
	 * @return the avion
	 */
	public JButton getAvion() {
		return avion;
	}

	/**
	 * @param avion the avion to set
	 */
	public void setAvion(JButton avion) {
		this.avion = avion;
	}

	/**
	 * @return the camioneta
	 */
	public JButton getCamioneta() {
		return camioneta;
	}

	/**
	 * @param camioneta the camioneta to set
	 */
	public void setCamioneta(JButton camioneta) {
		this.camioneta = camioneta;
	}

	/**
	 * @return the helicoptero
	 */
	public JButton getHelicoptero() {
		return helicoptero;
	}

	/**
	 * @param helicoptero the helicoptero to set
	 */
	public void setHelicoptero(JButton helicoptero) {
		this.helicoptero = helicoptero;
	}

	/**
	 * @return the ver
	 */
	public JButton getVer() {
		return ver;
	}

	/**
	 * @param ver the ver to set
	 */
	public void setVer(JButton ver) {
		this.ver = ver;
	}

	/**
	 * @return the datosVenta
	 */
	public JComboBox<String> getDatosVenta() {
		return datosVenta;
	}

	/**
	 * @param datosVenta the datosVenta to set
	 */
	public void setDatosVenta(JComboBox<String> datosVenta) {
		this.datosVenta = datosVenta;
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
	
	
	
	

}
