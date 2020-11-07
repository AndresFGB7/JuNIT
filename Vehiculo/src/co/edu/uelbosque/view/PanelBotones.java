package co.edu.uelbosque.view;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;


/**
 * Esta clase aporta los botones de catalogo
 *
 */
public class PanelBotones extends JPanel{
	private JLabel fondo;
	private JButton carro,camion,moto,avion,helicoptero,todos,vendidos,disponibles,buscar,comparar;
	/**
	 * El metodo constructor de la clase Panel Botones
	 */
	public PanelBotones() {
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
	}
	/**
	 * Este metodo inicializa los Componentes de la clase  Panel Botones
	 * 
	 */
	
	public void inicializarComponentes() {
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(973,107));
		
		//BOTONES SUPERIORES
		carro = newButtonTipe("CARROBUSCAR");
		carro.setBounds(24, 19, 53, 53);
		add(carro);
		
		camion = newButtonTipe("CAMIONBUSCAR");
		camion.setBounds(105, 19, 53, 53);
		add(camion);
		
		moto = newButtonTipe("MOTOBUSCAR");
		moto.setBounds(200, 19, 53, 53);
		add(moto);

		avion = newButtonTipe("AVIONBUSCAR");
		avion.setBounds(287, 19, 53, 53);
		add(avion);
		
		helicoptero = newButtonTipe("HELICOPTEROBUSCAR");
		helicoptero.setBounds(386, 19, 53, 53);
		add(helicoptero);
		
		todos = newButtonTipe("TODOS");
		todos.setBounds(487, 19, 53, 53);
		add(todos);
		
		vendidos = newButtonTipe("VENDIDOS");
		vendidos.setBounds(587, 19, 53, 53);
		add(vendidos);
		
		disponibles = newButtonTipe("DISPONIBLES");
		disponibles.setBounds(696, 19, 53, 53);
		add(disponibles);
		
		ImageIcon busc = new ImageIcon(getClass().getResource("/imagenes/"+"lupa.gif"));
		buscar = new JButton(busc);
	    buscar.setBorderPainted(false);
		buscar.setOpaque(false);
		buscar.setActionCommand("BUSCAR");
		buscar.setBounds(792, 16, 53, 53);
		add(buscar);
		
		ImageIcon vs = new ImageIcon(getClass().getResource("/imagenes/"+"vs.gif"));
		comparar = new JButton(vs);
		comparar.setBorderPainted(false);
		comparar.setOpaque(false);
		comparar.setActionCommand("COMPARAR");
		comparar.setBounds(883, 19, 53, 53);
		add(comparar);
		
		
		//FONDO DEL PANEL
		
		ImageIcon backGround = new ImageIcon(getClass().getResource("/imagenes/"+"botonesFondo.png"));
		fondo = new JLabel(backGround);
		fondo.setBounds(-1, 0, 973, 107);
		add(fondo);
		
		
	}
	
	/**
	 * Este metodo crea un nuevo metodo creando un boton
	 * @param comando - El comando a dar al boton String!=null
	 * @return JButton
	 */
	private JButton newButtonTipe(String comando){
		JButton boton;
		boton = new JButton();
		boton.setActionCommand(comando);
	    boton.setBorderPainted(false);
		boton.setOpaque(false);
		boton.setBackground(Color.white);
		return boton;
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
	 * @return the camion
	 */
	public JButton getCamion() {
		return camion;
	}
	/**
	 * @param camion the camion to set
	 */
	public void setCamion(JButton camion) {
		this.camion = camion;
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
	 * @return the todos
	 */
	public JButton getTodos() {
		return todos;
	}
	/**
	 * @param todos the todos to set
	 */
	public void setTodos(JButton todos) {
		this.todos = todos;
	}
	/**
	 * @return the vendidos
	 */
	public JButton getVendidos() {
		return vendidos;
	}
	/**
	 * @param vendidos the vendidos to set
	 */
	public void setVendidos(JButton vendidos) {
		this.vendidos = vendidos;
	}
	/**
	 * @return the disponibles
	 */
	public JButton getDisponibles() {
		return disponibles;
	}
	/**
	 * @param disponibles the disponibles to set
	 */
	public void setDisponibles(JButton disponibles) {
		this.disponibles = disponibles;
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
	 * @return the comparar
	 */
	public JButton getComparar() {
		return comparar;
	}
	/**
	 * @param comparar the comparar to set
	 */
	public void setComparar(JButton comparar) {
		this.comparar = comparar;
	}

	

}
