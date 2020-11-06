package co.edu.uelbosque.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JOptionPane;

import co.edu.uelbosque.modelo.Vehiculo;
import co.edu.uelbosque.modelo.persistence.Archivo;
import co.edu.uelbosque.modelo.persistence.VehiculoDAO;
import co.edu.uelbosque.view.VentanaPrincipal;

public class Controller {
	
	private Vehiculo vehiculo;
	private Archivo archivo;
	private VehiculoDAO vehiculodao;
	private File file = new File("Data/Vehiculo.dat");
	private VentanaPrincipal ventana;

	public Controller() {
		
		vehiculo = new Vehiculo();
		archivo = new Archivo(file);
		vehiculodao = new VehiculoDAO(archivo);
		vehiculodao.setVehiculos(archivo.leerArchivo(file));
		ventana = new VentanaPrincipal();
		
		asignarOyentes();
		
	}private void asignarOyentes() {
	
		ventana.getPanelInicio().getHand1().addMouseListener(e);
		ventana.getPanelInicio().getHand2().addMouseListener(e);
		ventana.getPanelInicio().getHand3().addMouseListener(e);
		
		
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
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == ventana.getPanelInicio().getHand1()) {
				ventana.getPanelInicio().getHand1().setVisible(true);
			}
			if (e.getSource() == ventana.getPanelInicio().getHand2()) {
				ventana.getPanelInicio().getHand2().setVisible(true);
			}
			if (e.getSource() == ventana.getPanelInicio().getHand3()) {
				ventana.getPanelInicio().getHand3().setVisible(true);
			}
		}
	};
	
	
	public void agregar() {
	}
}
