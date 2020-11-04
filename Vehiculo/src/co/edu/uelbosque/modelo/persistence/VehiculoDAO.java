package co.edu.uelbosque.modelo.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.uelbosque.modelo.Vehiculo;

public class VehiculoDAO {

	private Archivo opArchivo;
	private ArrayList<Vehiculo> vehiculos;

	/**
	 * Este es el método constructor de la clase
	 * 
	 * @param opArchivo - el archivo de tipo Archivo
	 */
	public VehiculoDAO(Archivo opArchivo) {
		vehiculos = new ArrayList<Vehiculo>();
		this.opArchivo = opArchivo;
		verificarInvariante();
	}

	/**
	 * Este metodo registra un vehiculo en el arreglo<br>
	 * <b>pre</b> Existe un arrego!=null<br>
	 * <b>post</b> Agrega un vehivulo al arreglo
	 * 
	 * @param modelo       - Es el modelo del vehiculo de tipo String != null.
	 * @param marca        - Es la marca del vehiculo de tipo String != null.
	 * @param placa        - Es la placa del vehiculo de tipo String != null.
	 * @param nPuertas     - Es el numero de puertas del vehiculo de tipo int != 0.
	 * @param nAsientos    - Es la capacidad del vehiculo de tipo int != 0.
	 * @param tipoVehiculo - Es el tipo de vehiculo de tipo String != null.
	 * @param estado       - Es el estado false si no se ha vendido el vehiculo
	 * @param file         - La dirección donde se agregará el vehiculo
	 * @return - Boolean, true al agregar un vehiculo
	 */
	public boolean agregarVehiculo(String modelo, String marca, String placa, int nPuertas, int nAsientos,
			String tipoVehiculo, Boolean estado, String file) {
		Vehiculo nuevoVehiculo = new Vehiculo(modelo, marca, placa, nPuertas, nAsientos, tipoVehiculo, estado);
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(nuevoVehiculo.getPlaca())) {
				System.out.println("Vehiculo repetido no se agregara al arreglo");
				return false;
			}
		}

		vehiculos.add(nuevoVehiculo);
		opArchivo.escribirEnArchivo(vehiculos, file);
		return true;
	}

	

	/**
	 * Este metodo busca un vehiculo del arreglo por la placa <br>
	 * <b>pre</b> Debe existir un arrayList != null.<br>
	 * <b>post</b> Mostrar la informacion segun la placa.<br>
	 * 
	 * @param placa     - Es la placa o identificador del vehiculo de tipo String !=
	 *                  null.
	 * @param vehiculos - Es el array donde se buscará el vehiculo
	 * @return un objeto vehiculo
	 */
	public Vehiculo mostrarVehiculo(String placa, ArrayList<Vehiculo> vehiculos) {
		Vehiculo vehiculo = null;
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placa)) {
				vehiculo = vehiculos.get(i);
				return vehiculo;
			} else {
				System.out.println("No aparece");
			}
		}
		return vehiculo;
	}

	/**
	 * Este metodo muestra la informacion de todos los vehiculos guardados.<br>
	 * <b>pre</b> Debe haber una arreglo != null<br>
	 * <b>post</b> Regresa los datos de todos los vehiculos<br>
	 * 
	 * @param vehiculos -Es el array que se usará para mostrar todos los vehiculos
	 * @return Regresa un String con los datos de todos los vehiculos.
	 */

	public String mostrarLista(ArrayList<Vehiculo> vehiculos) {
		String lista = "Informacion de los vehiculos guardados " + "\n" + "\n";

		for (int i = 0; i < vehiculos.size(); i++) {
			lista = lista.concat(vehiculos.get(i).toString() + "\n");
		}
		return lista;
	}

	/**
	 * Este metodo quita un vehiculo del arreglo. <br>
	 * <b>pre</b> Debe existir unarreglo!= null<br>
	 * <b>post</b> Quita un vehiculo del arreglo<br>
	 * 
	 * @param placa     - String identificador del vehiculo !null
	 * @param vehiculos - ArrayList arreglo de vehiculos !null
	 * @param archivo   - File archivo dat del programa !null
	 * @return true si se elimino
	 */
	public boolean eliminarVehiculo(String placa, ArrayList<Vehiculo> vehiculos, File archivo) {
		boolean resp = false;
		try {
			Vehiculo e = mostrarVehiculo(placa, vehiculos);
			if (e != null) {
				vehiculos.remove(e);
				archivo.delete();
				archivo.createNewFile();
				opArchivo.escribirEnArchivo(vehiculos, archivo.getAbsolutePath());
				resp = true;
			}
			return resp;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resp;
	}

	/**
	 * Este metodo muestra la informacion de un vehiculo por placa <br>
	 * <b>pre</b> Debe existir un arrayList != null.<br>
	 * <b>post</b> Mostrar la informacion segun la placa.<br>
	 * 
	 * @param placa     - Es la placa o identificador del vehiculo de tipo String !=
	 *                  null.
	 * @param vehiculos - Es el array donde se buscará el vehiculo
	 * @return un String mostrando toda la información
	 */
	public String mostrarInfoString(String placa, ArrayList<Vehiculo> vehiculos) {
		String contenido = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placa)) {
				contenido += vehiculos.get(i).toString();
				return contenido;
			}
		}
		return null;
	}

	/**
	 * Este metodo vende los vehiculos guardados. <b>pre</b>Debe haber una arreglo
	 * != null<br>
	 * <b>post</b>Regresa la venta del vehiculo<br>
	 * 
	 * @param placa     - Es la placa o identificador del vehiculo de tipo String !=
	 *                  null.
	 * @param vehiculos - Es el array donde se buscará el vehiculo
	 * @return Regresa un String con la venta del vehiculo.
	 */

	public String venderVehiculo(String placa, ArrayList<Vehiculo> vehiculos) {
		String vendido = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placa)) {
				vehiculos.get(i).setEstado(true);
				vendido = "Vehiculo " + vehiculos.get(i).getModelo() + " de placa " + vehiculos.get(i).getPlaca()
						+ " vendido con exito";
				return vendido;
			}
		}
		return null;
	}

	/**
	 * Este metodo regresa el estado del vehiculo ingresado. <br>
	 * <b>pre</b> Debe haber una arreglo != null<br>
	 * <b>post</b> Regresa si el vehiculo esta vendido o no<br>
	 * 
	 * @param placa     - Es la placa o identificador del vehiculo de tipo String !=
	 *                  null.
	 * @param vehiculos - Es el array donde se buscará el vehiculo
	 * @return Regresa un String con el estado del vehiculo.
	 */
	public String estadoVehiculo(String placa, ArrayList<Vehiculo> vehiculos) {
		String estad = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placa)) {
				if (vehiculos.get(i).getEstado() == false) {
					estad = "Sin Vender";
					return estad;
				} else {
					estad = "Vendido";
					return estad;
				}
			}
		}
		System.out.println("No se encontro el vehiculo");
		return null;
	}
	
	
	/**
	 * Este metodo compara dos vehiculos en el arreglo<br>
	 * <b>pre</b> Existe un arrego!=null<br>
	 * <b>post</b> Retorna la info que se quiera comparar
	 * 
	 * @param placaA    - Identidficador del primer vehiculo tipo String !=null
	 * @param placaB    - Identificador del segundo Vehiculo tipo String !=null
	 * @param comparar  - Que se va a comparar tipo String !=null
	 * @param vehiculos - El arraylist donde se comparan los vehiculos
	 * @return - La comparacion en una cadena de texto
	 */
	public String compararVehiculopor(String placaA, String placaB, String comparar, ArrayList<Vehiculo> vehiculos) {
		String aux = "";
		String aux2 = "";

		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placaA)) {

				if (comparar.equals("Modelo")) {
					aux = "El modelo del vehiculo, con identificacion: " + placaA + " es:"
							+ vehiculos.get(i).getModelo();
				} else if (comparar.equals("Marca")) {
					aux = "La marca del vehiculo, con identificacion: " + placaA + " es:" + vehiculos.get(i).getMarca();
				} else if (comparar.equals("Capacidad")) {
					aux = "La capacidad del vehiculo, con identificacion: " + placaA + " es: "
							+ vehiculos.get(i).getnAsientos() + "(asientos)";
				} else if (comparar.equals("#Puertas")) {
					aux = "El numero de puertas del vehiculo, con identificacion: " + placaA + " es: "
							+ vehiculos.get(i).getnPuertas();
				} else if (comparar.equals("Tipo")) {
					aux = "El tipo del vehiculo, con identificacion: " + placaA + " es: "
							+ vehiculos.get(i).getTipoVehiculo();
				}
			}
			if (vehiculos.get(i).getPlaca().equals(placaB)) {
				if (comparar.equals("Modelo")) {
					aux2 = vehiculos.get(i).getModelo();
				} else if (comparar.equals("Marca")) {
					aux2 = vehiculos.get(i).getMarca();
				} else if (comparar.equals("Capacidad")) {
					aux2 = vehiculos.get(i).getnAsientos() + "";
				} else if (comparar.equals("#Puertas")) {
					aux2 = "" + vehiculos.get(i).getnPuertas();
				} else if (comparar.equals("Tipo")) {
					aux2 = vehiculos.get(i).getTipoVehiculo();
				}
			}
		}
		aux2 = " \nMientras que el de " + placaB + " es " + aux2;
		return aux + aux2;
	}

	/**
	 * Este metodo compara toda la informacion de los dos vehiculos dados<br>
	 * <b>pre</b> Existe un arrego!=null<br>
	 * <b>post</b> Retorna la info completa de la comparacion
	 * @param placaA	- Identidficador del primer vehiculo tipo String !=null
	 * @param placaB    - Identificador del segundo Vehiculo tipo String !=null
	 * @param vehiculos - El arraylist donde se comparan los vehiculos
	 * @return - La comparacion de toda la info en una cadena de texto
	 */
	public String compararVehiculos(String placaA, String placaB, ArrayList<Vehiculo> vehiculos) {
		String aux = "";
		String aux2 = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getPlaca().equals(placaA)) {
				aux = vehiculos.get(i).toString();
			}
			if (vehiculos.get(i).getPlaca().equals(placaB)) {
				aux2 = "\nComparado con: " + vehiculos.get(i).toString();
			}
		}
		return aux + aux2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the vehiculos
	 */
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	/**
	 * @param vehiculos the vehiculos to set
	 */
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	private void verificarInvariante() {
		assert opArchivo != null : "El archivo con el que se va a trabajar no puede ser null";
	}

}
