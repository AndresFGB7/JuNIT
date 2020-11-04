package co.edu.uelbosque.modelo.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import co.edu.uelbosque.modelo.Vehiculo;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public Archivo(File archivo) {
		if (archivo.exists()) {

		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void escribirEnArchivo(ArrayList<Vehiculo> vehiculo, String archivo) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(vehiculo);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Vehiculo> leerArchivo(File archivo) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				vehiculos = (ArrayList<Vehiculo>) entrada.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return vehiculos;
	}
}
