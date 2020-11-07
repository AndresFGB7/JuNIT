package co.edu.uelbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/**
 * Esta clase agrega un nuevo vehiculo
 *
 */
public class PanelNuevo extends JPanel {

	private JLabel fondo,puntero, enunciado, enunciado2;
	private JLabel[] labelMuestra;
	private JButton bAvion, bCarro, bMoto, bHelicoptero, bCamioneta, bConfirmar,bAtras;
	private JTextPane textoMarca, textoPlaca;
	private JComboBox<String> modeloBox;
	private JComboBox<String> asientoBox;
	private JComboBox<String> puertaBox;
	/**
	 * El metodo constructor de la clase Panel Nuevo
	 */
	public PanelNuevo() {

		setLayout(null);

		inicializarComponentes();

		setVisible(false);

	}

	/**
	 * Este metodo inicializa los Componentes de la clase  PanelNuevo
	 * 
	 */
	private void inicializarComponentes() {
	
		//BOTONES ESCOGER
		bCarro = newButtonTipe("BOTONCARRO");
		bCarro.setBounds(512, 181, 80, 80);
		add(bCarro);

		bCamioneta = newButtonTipe("BOTONCAMIONETA");
		bCamioneta.setBounds(602, 181, 80, 80);
		add(bCamioneta);
		
		bMoto = newButtonTipe("BOTONMOTO");
		bMoto.setBounds(692, 181, 80, 80);
		add(bMoto);

		bAvion =newButtonTipe("BOTONAVION");
		bAvion.setBounds(782, 181, 80, 80);
		add(bAvion);

		bHelicoptero = newButtonTipe("BOTONHELICOPTERO");
		bHelicoptero.setBounds(872, 181, 80, 80);
		add(bHelicoptero);
		
		bConfirmar = new JButton("Confirmar");
		bConfirmar.setBounds(675,525,100,20);
		bConfirmar.setActionCommand("CONFIRMAR");
		add(bConfirmar);
		
		bAtras = new JButton("ATRAS");
		bAtras.setBounds(20,0,50,20);
		bAtras.setActionCommand("ATRAS");
		add(bAtras);
		
			
		//MARCA Y PLACA
		textoMarca = new JTextPane();
		textoMarca.setFont(new Font("Phosphate", 2, 17));
		textoMarca.setBounds(675, 285, 150, 25);
		add(textoMarca);
		
		textoPlaca = new JTextPane();
		textoPlaca.setBounds(675, 410, 114, 25);
		add(textoPlaca);
		
		//JCOMBOBOX 
		modeloBox = new JComboBox<String>();
		for (int i = 0; i < 100; i++) {
			modeloBox.addItem(""+(1930+i));
		}
		modeloBox.setBounds(675, 350, 134, 20);
		add(modeloBox);
		
		asientoBox = new JComboBox<String>();
		for (int i = 0; i < 630; i++) {
			asientoBox.addItem(""+i);
		}
		asientoBox.setBounds(575, 500, 50, 20);
		add(asientoBox);
		
		puertaBox = new JComboBox<String>();
		for (int i = 0; i < 10; i++) {
			puertaBox.addItem(""+i);
		}
		puertaBox.setBounds(800, 500, 50, 20);
		add(puertaBox);

		
		//LABELS MUESTRARIO
		labelMuestra = new JLabel[5];
		labelMuestra[0] = newLMuestra("motocicleta");
		labelMuestra[0].setBounds(85, 153, 341, 341);
		add(labelMuestra[0]);

		labelMuestra[1] = newLMuestra("helicoptero");
		labelMuestra[1].setBounds(85, 153, 341, 341);
		add(labelMuestra[1]);
		
		labelMuestra[2] = newLMuestra("carro");
		labelMuestra[2].setBounds(20, 50, 500, 500);
		add(labelMuestra[2]);
		
		labelMuestra[3] = newLMuestra("avion");
		labelMuestra[3].setBounds(110, 180, 313, 313);
		add(labelMuestra[3]);
		
		labelMuestra[4] = newLMuestra("camioneta");
		labelMuestra[4].setBounds(35, 100, 440, 440);
		add(labelMuestra[4]);
		
		
		//PUNTERO
		ImageIcon punt = new ImageIcon(getClass().getResource("/imagenes/" + "puntero.gif"));
		puntero = new JLabel(punt);
		puntero.setBounds(502, 275, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(502, 336, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(502, 397, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(502, 458, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		puntero = new JLabel(punt);
		puntero.setBounds(725, 458, 40, 48);
		puntero.setVisible(true);
		add(puntero);

		
		//ENUNCIADO
		enunciado = new JLabel("CAMIONETA",SwingConstants.CENTER);
		enunciado.setBounds(49, 500, 430, 94);
		enunciado.setForeground(Color.black);
		enunciado.setFont(new Font("Phosphate", 2, 60));
		add(enunciado);

		enunciado2 = new JLabel(enunciado.getText(),SwingConstants.CENTER);
		enunciado2.setBounds(47, 499, 430, 94);
		enunciado2.setForeground(Color.gray);
		enunciado2.setFont(new Font("Phosphate", 2, 60));
		add(enunciado2);
		
		
		ImageIcon fond = new ImageIcon(getClass().getResource("/imagenes/" + "choose.png"));
		fondo = new JLabel(fond);
		fondo.setBounds(-1, 0, 974, 604);
		add(fondo);
	}
	
	/**
	 * Este Metodo crea un label y le agrega el gif 
	 * @param a - el nombre del gif  en la carpeta imagenes
	 * @return JLabel 
	 */
	private JLabel newLMuestra(String a) {
		ImageIcon mot = new ImageIcon(getClass().getResource("/imagenes/" + a+".gif"));
		JLabel label = new JLabel(mot);
		label.setVisible(false);
		return label;
	}

	/**
	 * Este metodo crea un nuevo metodo creando un boton
	 * @param comando - El comando a dar al boton String!=null
	 * @return JButton
	 */
	private JButton newButtonTipe(String comando){
		JButton boton;
		ImageIcon b = new ImageIcon(getClass().getResource("/imagenes/" +comando +".png"));
		boton = new JButton(b);
		boton.setActionCommand(comando);
		boton.setBorderPainted(false);
		boton.setOpaque(false);
		boton.setBackground(Color.white);
		return boton;
	}

	/**
	 * @return the bConfirmar
	 */
	public JButton getbConfirmar() {
		return bConfirmar;
	}

	/**
	 * @param bConfirmar the bConfirmar to set
	 */
	public void setbConfirmar(JButton bConfirmar) {
		this.bConfirmar = bConfirmar;
	}

	/**
	 * @return the bAvion
	 */
	public JButton getbAvion() {
		return bAvion;
	}

	/**
	 * @param bAvion the bAvion to set
	 */
	public void setbAvion(JButton bAvion) {
		this.bAvion = bAvion;
	}

	/**
	 * @return the bCarro
	 */
	public JButton getbCarro() {
		return bCarro;
	}

	/**
	 * @param bCarro the bCarro to set
	 */
	public void setbCarro(JButton bCarro) {
		this.bCarro = bCarro;
	}

	/**
	 * @return the bMoto
	 */
	public JButton getbMoto() {
		return bMoto;
	}

	/**
	 * @param bMoto the bMoto to set
	 */
	public void setbMoto(JButton bMoto) {
		this.bMoto = bMoto;
	}

	/**
	 * @return the bHelicoptero
	 */
	public JButton getbHelicoptero() {
		return bHelicoptero;
	}

	/**
	 * @param bHelicoptero the bHelicoptero to set
	 */
	public void setbHelicoptero(JButton bHelicoptero) {
		this.bHelicoptero = bHelicoptero;
	}

	/**
	 * @return the bCamioneta
	 */
	public JButton getbCamioneta() {
		return bCamioneta;
	}

	/**
	 * @param bCamioneta the bCamioneta to set
	 */
	public void setbCamioneta(JButton bCamioneta) {
		this.bCamioneta = bCamioneta;
	}
	/**
	 * @return the enunciado
	 */
	public JLabel getEnunciado() {
		return enunciado;
	}

	/**
	 * @param enunciado the enunciado to set
	 */
	public void setEnunciado(JLabel enunciado) {
		this.enunciado = enunciado;
	}

	/**
	 * @return the enunciado2
	 */
	public JLabel getEnunciado2() {
		return enunciado2;
	}

	/**
	 * @param enunciado2 the enunciado2 to set
	 */
	public void setEnunciado2(JLabel enunciado2) {
		this.enunciado2 = enunciado2;
	}
	/**
	 * @return the textoMarca
	 */
	public JTextPane getTextoMarca() {
		return textoMarca;
	}

	/**
	 * @param textoMarca the textoMarca to set
	 */
	public void setTextoMarca(JTextPane textoMarca) {
		this.textoMarca = textoMarca;
	}
	/**
	 * @return the modeloBox
	 */
	public JComboBox<String> getModeloBox() {
		return modeloBox;
	}

	/**
	 * @param modeloBox the modeloBox to set
	 */
	public void setModeloBox(JComboBox<String> modeloBox) {
		this.modeloBox = modeloBox;
	}

	/**
	 * @return the asientoBox
	 */
	public JComboBox<String> getAsientoBox() {
		return asientoBox;
	}

	/**
	 * @param asientoBox the asientoBox to set
	 */
	public void setAsientoBox(JComboBox<String> asientoBox) {
		this.asientoBox = asientoBox;
	}

	/**
	 * @return the puertaBox
	 */
	public JComboBox<String> getPuertaBox() {
		return puertaBox;
	}

	/**
	 * @param puertaBox the puertaBox to set
	 */
	public void setPuertaBox(JComboBox<String> puertaBox) {
		this.puertaBox = puertaBox;
	}

	/**
	 * @return the bAtras
	 */
	public JButton getbAtras() {
		return bAtras;
	}

	/**
	 * @param bAtras the bAtras to set
	 */
	public void setbAtras(JButton bAtras) {
		this.bAtras = bAtras;
	}

	/**
	 * @return the textoPlaca
	 */
	public JTextPane getTextoPlaca() {
		return textoPlaca;
	}

	/**
	 * @param textoPlaca the textoPlaca to set
	 */
	public void setTextoPlaca(JTextPane textoPlaca) {
		this.textoPlaca = textoPlaca;
	}
	/**
	 * @return the labelMuestra
	 */
	public JLabel getLabelMuestra(int a) {
		return labelMuestra[a];
	}
}
