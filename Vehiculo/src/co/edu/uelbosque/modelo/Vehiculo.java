package co.edu.uelbosque.modelo;

import java.io.Serializable;

/**
 * Esta clase se utiliza para modificar los vehiculos
 * 
 *
 */
public class Vehiculo  implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private String modelo;
	private String marca;
	private String placa;
	private int nPuertas;
	private int nAsientos;
	private String tipoVehiculo;
	private Boolean estado;
	

	/**
	 * Metodo Constructor simple
	 */
	public Vehiculo() {
		
	}
	
	/**
	 * Metodo Constructor que inicializa las variables de vehiculo
	 * <b>pre</b>Deben crearse las variables.<br>
	 * <b>post</b>Se inicializan las variables<br>
	 * @param modelo
	 * @param marca
	 * @param placa
	 * @param nPuertas
	 * @param nAsientos
	 * @param tipoVehiculo
	 * @param estado
	 */
	public Vehiculo(String modelo, String marca, String placa, int nPuertas, int nAsientos, String tipoVehiculo,Boolean estado) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.nPuertas = nPuertas;
		this.nAsientos = nAsientos;
		this.tipoVehiculo = tipoVehiculo;
		this.estado = estado; 
		verificarInvariante();
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the nPuertas
	 */
	public int getnPuertas() {
		return nPuertas;
	}
	/**
	 * @param nPuertas the nPuertas to set
	 */
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	/**
	 * @return the nAsientos
	 */
	public int getnAsientos() {
		return nAsientos;
	}
	/**
	 * @param nAsientos the nAsientos to set
	 */
	public void setnAsientos(int nAsientos) {
		this.nAsientos = nAsientos;
	}
	/**
	 * @return the tipoVehiculo
	 */
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	/**
	 * @param tipoVehiculo the tipoVehiculo to set
	 */
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Vehiculo\nmodelo: " + modelo + "\nmarca: " + marca + "\nplaca: " + placa + "\n#Puertas: " + nPuertas
				+ "\n#Asientos: " + nAsientos + "\ntipoVehiculo: " + tipoVehiculo +"\nEstado: " + estado + ". \n";
	}
	
	private void verificarInvariante() {
		
		assert modelo != null : "El modelo no puede ser null";
		assert marca != null : "La marc no puede ser null";
		assert placa != null : "La placa no puede ser null";
		assert nPuertas >= 0: "El vehiculo no puede tener menos de 0 puertas";
		assert nAsientos >= 0 : "El vehiculo no puede tener menos de 0 asientos";
		assert tipoVehiculo != null : "El tipoVehiculo no puede ser null";
		assert estado != null : "El estado no puede ser null";
		
	}

}
