package co.edu.uelbosque.view;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class VentanaInfo extends JFrame{
	private JScrollPane scroll;
	private PanelInfo panelInfo;
	public VentanaInfo() {
		setSize(500, 400);
		setLayout(new BorderLayout());
		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {

		panelInfo = new PanelInfo();
		scroll = new JScrollPane();
		scroll.setViewportView(panelInfo);
		
		getContentPane().add(scroll, BorderLayout.CENTER);
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

	/**
	 * @return the panelInfo
	 */
	public PanelInfo getPanelInfo() {
		return panelInfo;
	}

	/**
	 * @param panelInfo the panelInfo to set
	 */
	public void setPanelInfo(PanelInfo panelInfo) {
		this.panelInfo = panelInfo;
	}
	
}
