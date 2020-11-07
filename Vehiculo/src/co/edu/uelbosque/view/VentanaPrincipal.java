package co.edu.uelbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * En esta clase se adjuntan los paneles y 
 * se da el tamaño a la ventana
 *
 */
public class VentanaPrincipal  extends JFrame{
	
	private PanelPrincipal panelInicio;
	private PanelNuevo panelNuevo;
	
	/**
	 * Este es el metodo constructor
	 */
	public VentanaPrincipal() {
		
		setSize(972, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// getContentPane().setBackground(Color.RED);
		getContentPane().setLayout(new BorderLayout(10, 10));

		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	/**
	 * Se inicializan los componentes
	 */
	public void inicializarComponentes() {
		
		panelInicio = new PanelPrincipal();
		
		panelNuevo = new PanelNuevo();
		getContentPane().add(panelInicio, BorderLayout.CENTER);

		
	}
	public void mostrarMensaje(String a) {
		JOptionPane.showMessageDialog(null, a);
	}

	/**
	 * @return the panelInicio
	 */
	public PanelPrincipal getPanelInicio() {
		return panelInicio;
	}

	/**
	 * @param panelInicio the panelInicio to set
	 */
	public void setPanelInicio(PanelPrincipal panelInicio) {
		this.panelInicio = panelInicio;
	}

	/**
	 * @return the nuevo
	 */
	public PanelNuevo getPanelNuevo() {
		return panelNuevo;
	}

	/**
	 * @param nuevo the nuevo to set
	 */
	public void setPanelNuevo(PanelNuevo panelNuevo) {
		this.panelNuevo = panelNuevo;
	}

}
