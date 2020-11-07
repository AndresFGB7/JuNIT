package co.edu.uelbosque.test;

import java.io.File;
import java.util.ArrayList;

import co.edu.uelbosque.modelo.Vehiculo;
import co.edu.uelbosque.modelo.persistence.Archivo;
import co.edu.uelbosque.modelo.persistence.VehiculoDAO;
import junit.framework.TestCase;

/**
 * En esta clase realizamos un test de la clase VehiculoDAO<br>
 * <b>pre</b> Debe Terminar el nombre en Test para el correcto
 * funcionamiento<br>
 * <b>post</b> Podremos saber que funciona la clase
 */
public class VehiculoDAOTest extends TestCase {

	VehiculoDAO vehiculo;
	Archivo opArchivo;
	File file = new File("dataTest/VehiculoTest.dat");
	ArrayList<Vehiculo> lista;
	Vehiculo vehiculo_1;
	Vehiculo vehiculo_2;
	Vehiculo vehiculo_3;
	Vehiculo vehiculo_4;
	Vehiculo vehiculo_5;
	String f = "dataTest/VehiculoTest.dat";

	/**
	 * Este metodo prepara el escenario para las pruebas que se realizarán
	 * <b>pre</b> Deben existir unos componentes<br>
	 * <b>post</b> Se prepara el escenario
	 */
	public void setupEscenario() {
		file.delete();
		try {
			file.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		opArchivo = new Archivo(file);
		lista = opArchivo.leerArchivo(file);
		vehiculo = new VehiculoDAO(opArchivo);

		vehiculo_1 = new Vehiculo("prueba1", "BMW", "123-XYZ", 4, 5, "Auto Movil", false);
		vehiculo_2 = new Vehiculo("prueba2", "NISSAN", "456-QWE", 6, 8, "Camioneta", false);
		vehiculo_4 = new Vehiculo("prueba4", "Ford", "247-FGH", 2, 67, "Avion", false);
		vehiculo_5 = new Vehiculo("prueba5", "Tesla", "123-XYZ", 4, 6, "Helicoptero", false);

		lista.add(vehiculo_1);
		lista.add(vehiculo_2);
		lista.add(vehiculo_5);

	}

	public void testVehiculoDAO() {
		setupEscenario();
		assertEquals("La cantidad de vehiculos debe ser 3", 3, lista.size());
		System.out.println(lista.size());
	}

	/**
	 * Se mira que funcione el metodo agregarVehiculo
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */
	public void testAgregarVehiculo() {
		setupEscenario();
		assertTrue("se debio agregar el vehiculo",
				vehiculo.agregarVehiculo(vehiculo_1.getModelo(), vehiculo_1.getMarca(), vehiculo_1.getPlaca(),
						vehiculo_1.getnPuertas(), vehiculo_1.getnAsientos(), vehiculo_1.getTipoVehiculo(),
						vehiculo_1.getEstado(), f));
		assertFalse("no se ddeberia agregar el vehiculo con placa repetida",
				vehiculo.agregarVehiculo(vehiculo_5.getModelo(), vehiculo_5.getMarca(), vehiculo_5.getPlaca(),
						vehiculo_5.getnPuertas(), vehiculo_5.getnAsientos(), vehiculo_5.getTipoVehiculo(),
						vehiculo_5.getEstado(), f));
		;
	}
	/**
	 * Se mira que funcione el metodo agregarVehiculo
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */
	
	public void testMostrarVehiculo() {
		setupEscenario();
		assertNull("No se encontro el vehiculo", vehiculo.mostrarVehiculo("444-GAE", lista));
		assertNotNull("Se encontro el vehiculo", vehiculo.mostrarVehiculo(vehiculo_1.getPlaca(), lista));
	}
	/**
	 * Se mira que funcione el metodo mostrarLista
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testMostrarLista() {
		setupEscenario();
		assertNotNull("Se devuelve la lista de vehiculos", vehiculo.mostrarLista(lista));
	}
	/**
	 * Se mira que funcione el metodo eliminarVehiculo
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testEliminarVehiculo() {
		setupEscenario();
		assertTrue("Se debio eliminar el vehiculo", vehiculo.eliminarVehiculo(vehiculo_2.getPlaca(), lista, file));
		assertFalse("No se debio eliminar el vehiculo", vehiculo.eliminarVehiculo("327-HJS", lista, file));
	}
	/**
	 * Se mira que funcione el metodo mostrarInformacion
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testMostrarInformacion() {
		setupEscenario();
		assertNotNull("Debio retornar la informacion del vehiculo",
				vehiculo.mostrarInfoString(vehiculo_1.getPlaca(), lista));
		assertNull("No debio retornar la informacion del vehiculo", vehiculo.mostrarInfoString("345-jha", lista));

	}
	/**
	 * Se mira que funcione el metodo venderVehiculo
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testeVenderVehiculo() {
		setupEscenario();
		assertNull("No se encontro el vehiculo buscado", vehiculo.venderVehiculo("126-gdh", lista));
		assertNotNull("Se vendio el vehiculo", vehiculo.venderVehiculo(vehiculo_1.getPlaca(), lista));

	}
	/**
	 * Se mira que funcione el metodo estadoVehiculo
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testEstadoVehiculo() {
		setupEscenario();
		assertNull("No se encontro el vehiculo buscado", vehiculo.estadoVehiculo("126-gdh", lista));
		assertNotNull("Se muestra el estado del vehiculo", vehiculo.estadoVehiculo(vehiculo_1.getPlaca(), lista));

	}
	/**
	 * Se mira que funcione el metodo compararVehiculopor
	 * <b>pre</b> Debe Existir el metodo<br>
	 * <b>post</b> Podremos saber que funciona el metodo
	 */

	public void testCompararVehiculopor() {
		setupEscenario();
		assertNotNull("Se compararon los vehiculos", vehiculo.mostrarInfoPor(vehiculo_1.getPlaca(), "Modelo", lista));
		assertNull("Se compararon los vehiculos", vehiculo.mostrarInfoPor("aa", "Modelo", lista));
	}

}
