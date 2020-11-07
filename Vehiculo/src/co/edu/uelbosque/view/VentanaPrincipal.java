package co.edu.uelbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * En esta clase se adjuntan los paneles y 
 * se da el tama�o a la ventana
 *
 */
public class VentanaPrincipal  extends JFrame{
	
	private PanelPrincipal panelInicio;
	private PanelNuevo panelNuevo;
	private PanelBotones pBotones;
	private PanelCatalogo pCatalogo;
	private JScrollPane scroll;
	
	/**
	 * Este es el metodo constructor
	 */
	public VentanaPrincipal() {
		
		setSize(972, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// getContentPane().setBackground(Color.RED);
		getContentPane().setLayout(new BorderLayout());

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
		pBotones = new PanelBotones();
		pCatalogo =  new PanelCatalogo();
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

	/**
	 * @return the pBotones
	 */
	public PanelBotones getpBotones() {
		return pBotones;
	}

	/**
	 * @param pBotones the pBotones to set
	 */
	public void setpBotones(PanelBotones pBotones) {
		this.pBotones = pBotones;
	}

	/**
	 * @return the pCatalogo
	 */
	public PanelCatalogo getpCatalogo() {
		return pCatalogo;
	}

	/**
	 * @param pCatalogo the pCatalogo to set
	 */
	public void setpCatalogo(PanelCatalogo pCatalogo) {
		this.pCatalogo = pCatalogo;
	}

	/**
	 * @return the scroll
	 */
	public JScrollPane getScroll() {
		return scroll;
	}

	/**
	 * @param scroll the scroll to set
	 */
	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

}
