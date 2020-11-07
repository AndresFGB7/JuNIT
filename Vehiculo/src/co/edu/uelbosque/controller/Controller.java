package co.edu.uelbosque.controller;

import java.io.File;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import co.edu.uelbosque.modelo.Vehiculo;
import co.edu.uelbosque.modelo.persistence.Archivo;
import co.edu.uelbosque.modelo.persistence.VehiculoDAO;
import co.edu.uelbosque.view.VentanaInfo;
import co.edu.uelbosque.view.VentanaPrincipal;

/**
 * En esta clase se junta la parte de vista y modelo
 * para el correcto funcionamiento del programa
 *
 */
public class Controller implements ActionListener {

	private Vehiculo vehiculo;
	private Archivo archivo;
	private VehiculoDAO vehiculodao;
	private String f;
	private File file;
	private VentanaPrincipal ventana;
	private String tipo;

	/**
	 * Metodo constructor del controler
	 */
	public Controller() {

		f = "Data/Vehiculo.dat";
		File file = new File(f);
		vehiculo = new Vehiculo();
		archivo = new Archivo(file);
		vehiculodao = new VehiculoDAO(archivo);
		vehiculodao.setVehiculos(archivo.leerArchivo(file));
		ventana = new VentanaPrincipal();

		asignarOyentes();

	}

	/**
	 * Este metodo asigna los oyentes de los botones
	 * 
	 */
	private void asignarOyentes() {

		// BOTONES PANEL PRINCIPAL
		ventana.getPanelInicio().getCatalogo().addMouseListener(e);
		ventana.getPanelInicio().getAgregar().addMouseListener(e);
		ventana.getPanelInicio().getComprar().addMouseListener(e);
		ventana.getPanelInicio().getAgregar().addActionListener(this);
		ventana.getPanelInicio().getCatalogo().addActionListener(this);
		ventana.getPanelInicio().getComprar().addActionListener(this);

		// BOTONES AGREGAR
		ventana.getPanelNuevo().getbAvion().addMouseListener(e);
		ventana.getPanelNuevo().getbCamioneta().addMouseListener(e);
		ventana.getPanelNuevo().getbCarro().addMouseListener(e);
		ventana.getPanelNuevo().getbHelicoptero().addMouseListener(e);
		ventana.getPanelNuevo().getbMoto().addMouseListener(e);
		ventana.getPanelNuevo().getbConfirmar().addActionListener(this);
		ventana.getPanelNuevo().getbAtras().addActionListener(this);

		// BOTONES AGREGAR
		ventana.getpBotones().getAvion().addActionListener(this);
		ventana.getpBotones().getCamion().addActionListener(this);
		ventana.getpBotones().getCarro().addActionListener(this);
		ventana.getpBotones().getHelicoptero().addActionListener(this);
		ventana.getpBotones().getMoto().addActionListener(this);
		ventana.getpBotones().getTodos().addActionListener(this);
		ventana.getpBotones().getVendidos().addActionListener(this);
		ventana.getpBotones().getDisponibles().addActionListener(this);
		
		//BOTON CATALOGO
		ventana.getpCatalogo().getBuscar().addActionListener(this);
	}

	MouseListener e = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == ventana.getPanelInicio().getCatalogo()) {
				ventana.getPanelInicio().getHand1().setVisible(false);
			}
			if (e.getSource() == ventana.getPanelInicio().getAgregar()) {
				ventana.getPanelInicio().getHand2().setVisible(false);
			}
			if (e.getSource() == ventana.getPanelInicio().getComprar()) {
				ventana.getPanelInicio().getHand3().setVisible(false);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {

			// BOTONES PANELINICIO
			if (e.getSource() == ventana.getPanelInicio().getCatalogo()) {
				ventana.getPanelInicio().getHand1().setVisible(true);
			}
			if (e.getSource() == ventana.getPanelInicio().getAgregar()) {
				ventana.getPanelInicio().getHand2().setVisible(true);
			}
			if (e.getSource() == ventana.getPanelInicio().getComprar()) {
				ventana.getPanelInicio().getHand3().setVisible(true);
			}

			// BOTONES TIPO Y MOSTRAR
			if (e.getSource() == ventana.getPanelNuevo().getbMoto()) {
				tipo = "Moto";
				mostrarImagen(0, "MOTO");
			}
			if (e.getSource() == ventana.getPanelNuevo().getbHelicoptero()) {
				tipo = "Helicoptero";
				mostrarImagen(1, "HELICOPTERO");
			}
			if (e.getSource() == ventana.getPanelNuevo().getbCarro()) {
				tipo = "Carro";
				mostrarImagen(2, "CARRO");
			}
			if (e.getSource() == ventana.getPanelNuevo().getbAvion()) {
				tipo = "Avion";
				mostrarImagen(3, "AVION");
			}
			if (e.getSource() == ventana.getPanelNuevo().getbCamioneta()) {
				tipo = "Camioneta";
				mostrarImagen(4, "CAMIONETA");
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}
	};

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("AGREGAR")) {
			cambiarPanel(ventana.getPanelNuevo());
		}
		if (command.equals("CONFIRMAR")) {
			String modelo = ventana.getPanelNuevo().getModeloBox().getSelectedItem().toString();
			String marca = ventana.getPanelNuevo().getTextoMarca().getText();
			String placa = ventana.getPanelNuevo().getTextoPlaca().getText();
			int nPuertas = Integer.parseInt(ventana.getPanelNuevo().getPuertaBox().getSelectedItem().toString());
			int nAsientos = Integer.parseInt(ventana.getPanelNuevo().getAsientoBox().getSelectedItem().toString());

			vehiculodao.agregarVehiculo(modelo, marca, placa, nPuertas, nAsientos, tipo, false, f);
			ventana.mostrarMensaje(
					"Se agregó el vehiculo \n" + vehiculodao.mostrarInfoString(placa, vehiculodao.getVehiculos()));
			vehiculodao.mostrarLista(vehiculodao.getVehiculos());

			ventana.getPanelNuevo().getTextoMarca().setText("");
			ventana.getPanelNuevo().getTextoPlaca().setText("");
		}
		if (command.equals("ATRAS")) {
			cambiarPanel(ventana.getPanelInicio());
		}
		if (command.equals("CATALOGO")) {
			cambiarPanel(ventana.getpCatalogo());
			ventana.getContentPane().add(ventana.getpBotones(), BorderLayout.NORTH);
			ventana.getpBotones().setVisible(true);
			ventana.getContentPane().repaint();
		}
		if (command.equals("CARROBUSCAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Carro")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}

		}
		if (command.equals("CAMIONBUSCAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Camioneta")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("MOTOBUSCAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Moto")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("AVIONBUSCAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Avion")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("HELICOPTEROBUSCAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Helicoptero")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("TODOS")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			VentanaInfo v = new VentanaInfo();
			String a =vehiculodao.mostrarLista(vehiculodao.getVehiculos());
			v.getPanelInfo().getMostrarInfo3().setText(a);;
			
		}
		if (command.equals("VENDIDOS")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getEstado() == true) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("DISPONIBLES")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getEstado() == false) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}		}
		if (command.equals("COMPRAR")) {
			cambiarPanel(ventana.getpVender());
		}
		if (command.equals("MOSTRAR")) {
			
			String placa = ventana.getpCatalogo().getDatos().getSelectedItem().toString();
			String a ="<html><body>Informacion del "+vehiculodao.mostrarInfoString(placa, vehiculodao.getVehiculos()).replace("\n", "<br>")+"</body></html>";
			a = a.replace("true", "Vendido").replace("false", "Disponible");
			ventana.getpCatalogo().getMostrarInfo().setText(a);
			ventana.getpCatalogo().getMostrarInfo2().setText(a);
		}

	}

	/**
	 * Este metodo cambia a un nuevo panel
	 * 
	 * @param panel - panel nuevo
	 */
	public void cambiarPanel(Component panel) {
		ventana.getContentPane().removeAll();
		ventana.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setVisible(true);
		ventana.getContentPane().repaint();
	}

	/**
	 * Este metodo muestra las imagenes de los Labels
	 * 
	 * @param a    - La imagen ubicada en el numero a del arreglo
	 * @param text - el texto debajo de la imagen
	 */
	public void mostrarImagen(int a, String text) {
		ventana.getPanelNuevo().getEnunciado().setText(text);
		ventana.getPanelNuevo().getEnunciado2().setText(text);

		for (int i = 0; i < 5; i++) {
			if (i == a) {
				ventana.getPanelNuevo().getLabelMuestra(i).setVisible(true);
			} else {
				ventana.getPanelNuevo().getLabelMuestra(i).setVisible(false);
			}
		}
	}

}
