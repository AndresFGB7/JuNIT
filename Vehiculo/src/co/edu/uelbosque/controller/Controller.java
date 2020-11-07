package co.edu.uelbosque.controller;

import java.io.File;
import java.util.ArrayList;
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
		ventana.getpBotones().getComparar().addActionListener(this);
		
		//BOTON CATALOGO
		ventana.getpCatalogo().getBuscar().addActionListener(this);
		ventana.getpCatalogo().getbComparar().addActionListener(this);
		ventana.getpCatalogo().getbAtras().addActionListener(this);
		
		//BOTON PANEL VENTA
		ventana.getpVender().getAvion().addMouseListener(e);
		ventana.getpVender().getCamioneta().addMouseListener(e);
		ventana.getpVender().getCarro().addMouseListener(e);
		ventana.getpVender().getHelicoptero().addMouseListener(e);
		ventana.getpVender().getMoto().addMouseListener(e);
		ventana.getpVender().getComprar().addActionListener(this);
		ventana.getpVender().getCarro().addActionListener(this);
		ventana.getpVender().getCamioneta().addActionListener(this);
		ventana.getpVender().getMoto().addActionListener(this);
		ventana.getpVender().getAvion().addActionListener(this);
		ventana.getpVender().getHelicoptero().addActionListener(this);
		ventana.getpVender().getVer().addActionListener(this);
		ventana.getpVender().getbAtras().addActionListener(this);
		
		
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
			// BOTONES PVENTA
			if (e.getSource() == ventana.getpVender().getMoto()) {
				tipo = "Moto";
				mostrarImagen2(0, "MOTO");
			}
			if (e.getSource() == ventana.getpVender().getHelicoptero()) {
				tipo = "Helicoptero";
				mostrarImagen2(1, "HELICOPTERO");
			}
			if (e.getSource() == ventana.getpVender().getCarro()) {
				tipo = "Carro";
				mostrarImagen2(2, "CARRO");
			}
			if (e.getSource() == ventana.getpVender().getAvion()) {
				tipo = "Avion";
				mostrarImagen2(3, "AVION");
			}
			if (e.getSource() == ventana.getpVender().getCamioneta()) {
				tipo = "Camioneta";
				mostrarImagen2(4, "CAMIONETA");
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
					"Se agreg� el vehiculo \n" + vehiculodao.mostrarInfoString(placa, vehiculodao.getVehiculos()));
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
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Carro")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}

		}
		if (command.equals("CAMIONBUSCAR")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Camioneta")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("MOTOBUSCAR")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Moto")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("AVIONBUSCAR")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Avion")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("HELICOPTEROBUSCAR")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Helicoptero")) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("TODOS")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			VentanaInfo v = new VentanaInfo();
			String a =vehiculodao.mostrarLista(vehiculodao.getVehiculos());
			v.getPanelInfo().getMostrarInfo3().setText(a);;
			
		}
		if (command.equals("VENDIDOS")) {
			changeToComparar(true);

			ventana.getpCatalogo().getDatos().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getEstado() == true) {
					ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if (command.equals("DISPONIBLES")) {
			changeToComparar(true);

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

		if (command.equals("COMPARAR")) {
			ventana.getpCatalogo().getDatos().removeAllItems();
			changeToComparar(false);
			ventana.getpCatalogo().getComparar().addItem("Todo");
			ventana.getpCatalogo().getComparar().addItem("Modelo");
			ventana.getpCatalogo().getComparar().addItem("Marca");
			ventana.getpCatalogo().getComparar().addItem("Capacidad");
			ventana.getpCatalogo().getComparar().addItem("#Puertas");
			ventana.getpCatalogo().getComparar().addItem("Tipo");
			ventana.getpCatalogo().getComparar().setVisible(true);
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				ventana.getpCatalogo().getDatos().addItem(vehiculodao.getVehiculos().get(i).getPlaca());
				ventana.getpCatalogo().getDatos2().addItem(vehiculodao.getVehiculos().get(i).getPlaca());
			}	
		}
		if (command.equals("Compara")) {
			

			
			String placa1 = ventana.getpCatalogo().getDatos().getSelectedItem().toString();
			String placa2 = ventana.getpCatalogo().getDatos2().getSelectedItem().toString();
			String comparar = ventana.getpCatalogo().getComparar().getSelectedItem().toString();
			if (comparar.equals("Todo")) {
				String a ="<html><body>Informacion del "+vehiculodao.mostrarInfoString(placa1, vehiculodao.getVehiculos()).replace("\n", "<br>")+"</body></html>";
				String b ="<html><body>Informacion del "+vehiculodao.mostrarInfoString(placa2, vehiculodao.getVehiculos()).replace("\n", "<br>")+"</body></html>";
				a = a.replace("true", "Vendido").replace("false", "Disponible");
				b = b.replace("true", "Vendido").replace("false", "Disponible");
				ventana.getpCatalogo().getMostrarInfo3().setText(a);
				ventana.getpCatalogo().getMostrarInfo4().setText(a);
				
				ventana.getpCatalogo().getMostrarInfo5().setText(b);
				ventana.getpCatalogo().getMostrarInfo6().setText(b);
			}else{
				
				String a = "<html><body>"+vehiculodao.mostrarInfoPor(placa1,comparar, vehiculodao.getVehiculos()).replace("\n", "<br>")+"</body></html>";
				String b ="<html><body>"+vehiculodao.mostrarInfoPor(placa2,comparar, vehiculodao.getVehiculos()).replace("\n", "<br>")+"</body></html>";
				ventana.getpCatalogo().getMostrarInfo3().setText(a);
				ventana.getpCatalogo().getMostrarInfo4().setText(a);
				
				ventana.getpCatalogo().getMostrarInfo5().setText(b);
				ventana.getpCatalogo().getMostrarInfo6().setText(b);
			}
				
		}
		if(command.equals("CARROVENTA")) {
			changeToComparar2(true);

			ventana.getpVender().getDatosVenta().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Carro")) {
					ventana.getpVender().getDatosVenta().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if(command.equals("CAMIONETAVENTA")) {
			changeToComparar2(true);

			ventana.getpVender().getDatosVenta().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Camioneta")) {
					ventana.getpVender().getDatosVenta().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if(command.equals("MOTOVENTA")) {
			changeToComparar2(true);

			ventana.getpVender().getDatosVenta().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Moto")) {
					ventana.getpVender().getDatosVenta().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if(command.equals("AVIONVENTA")) {
			changeToComparar2(true);

			ventana.getpVender().getDatosVenta().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Avion")) {
					ventana.getpVender().getDatosVenta().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if(command.equals("HELICOPTEROVENTA")) {
			changeToComparar2(true);

			ventana.getpVender().getDatosVenta().removeAllItems();
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getTipoVehiculo().equals("Carro")) {
					ventana.getpVender().getDatosVenta().addItem(vehiculodao.getVehiculos().get(i).getPlaca().toString());
				}
			}
		}
		if(command.equals("VERAUTO")) {
			String placa = ventana.getpVender().getDatosVenta().getSelectedItem().toString();
		
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getPlaca().equals(placa)) {
					ventana.getpVender().getPlaca().setText(vehiculodao.getVehiculos().get(i).getPlaca());	
					ventana.getpVender().getMarca().setText(vehiculodao.getVehiculos().get(i).getMarca());	
					ventana.getpVender().getModelo().setText(vehiculodao.getVehiculos().get(i).getModelo());	
					ventana.getpVender().getPuertas().setText(vehiculodao.getVehiculos().get(i).getnPuertas()+ "");	
					ventana.getpVender().getAsientos().setText(vehiculodao.getVehiculos().get(i).getnAsientos()+ "");	
				}
			}
		}
		if(command.equals("COMPRARAUTO")) {
			String placa = ventana.getpVender().getDatosVenta().getSelectedItem().toString();
			
			for (int i = 0; i < vehiculodao.getVehiculos().size(); i++) {
				if (vehiculodao.getVehiculos().get(i).getPlaca().equals(placa)) {
					ventana.mostrarMensaje("Vehiculo: " + vehiculodao.getVehiculos().get(i).getMarca() + " - " + vehiculodao.getVehiculos().get(i).getModelo()+ "\n Con placa: " + vehiculodao.getVehiculos().get(i).getPlaca() + "\n VENDIDO CON EXITO");	
					vehiculodao.getVehiculos().get(i).setEstado(true);
					
					
					ventana.getpVender().getPlaca().setText("");	
					ventana.getpVender().getMarca().setText("");
					ventana.getpVender().getModelo().setText("");	
					ventana.getpVender().getPuertas().setText("");	
					ventana.getpVender().getAsientos().setText("");	
					
					ventana.getpVender().getDatosVenta().removeAllItems();
					
			
					
					
				
				}
			}
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
	
	public void mostrarImagen2(int a, String text) {
		
		for (int i = 0; i < 5; i++) {
			if (i == a) {
				ventana.getpVender().getLabelMuestra(i).setVisible(true);;
			} else {
				ventana.getpVender().getLabelMuestra(i).setVisible(false);
			}
		}
	}
	
	/**
	 *Este metodo apaga unos componentes del panel catalogo para comparar o no
	 * @param a - true si no se compara
	 */
	public void changeToComparar(Boolean a) {
		if (a == true) {
			ventana.getpCatalogo().getbComparar().setVisible(false);
			ventana.getpCatalogo().getBuscar().setVisible(true);
			
			ventana.getpCatalogo().getDatos2().setVisible(false);
			ventana.getpCatalogo().getComparar().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo().setVisible(true);
			ventana.getpCatalogo().getMostrarInfo2().setVisible(true);
			ventana.getpCatalogo().getMostrarInfo3().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo4().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo5().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo6().setVisible(false);
		}else {
			ventana.getpCatalogo().getbComparar().setVisible(true);
			ventana.getpCatalogo().getDatos2().setVisible(true);
			ventana.getpCatalogo().getComparar().setVisible(true);
			ventana.getpCatalogo().getBuscar().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo2().setVisible(false);
			ventana.getpCatalogo().getMostrarInfo3().setVisible(true);
			ventana.getpCatalogo().getMostrarInfo4().setVisible(true);
			ventana.getpCatalogo().getMostrarInfo5().setVisible(true);
			ventana.getpCatalogo().getMostrarInfo6().setVisible(true);
		}
	}
	/**
	 *Este metodo apaga unos componentes del panel catalogo para comparar o no
	 * @param a - true si no se compara
	 */
	public void changeToComparar2(Boolean a) {
		if (a == true) {
			ventana.getpVender().getVer().setVisible(true);
			ventana.getpVender().getComprar().setVisible(true);
			
			ventana.getpVender().getPlaca().setVisible(true);
			ventana.getpVender().getMarca().setVisible(true);
			ventana.getpVender().getModelo().setVisible(true);
			ventana.getpVender().getPuertas().setVisible(true);
			ventana.getpVender().getAsientos().setVisible(true);
		}
	}
}
