package co.edu.uelbosque.controller;

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
		agregar();
		
	}public void agregar() {
	//maybe error jeje 
		System.out.println(vehiculodao.mostrarLista(vehiculodao.getVehiculos()));
	}
}
