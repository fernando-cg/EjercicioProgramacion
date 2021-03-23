package Interfaz;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Marco extends JFrame {
	
	private JPanel panel;
	private JLabel etiqueta;
	private JRadioButton rb1, rb2, rb3;
	private JButton bt1,img1, img2, img3;
	
	public Marco() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		
		Toolkit monitor = Toolkit.getDefaultToolkit();
		Dimension tamanio=monitor.getScreenSize();
		int alturaM = tamanio.width;
		int anchuraM= tamanio.height;
		
		setSize(anchuraM/2, alturaM/2);
		setLocation(anchuraM/4, alturaM/4);
		
		iniciarComponentes();
	}
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarElementos();
		
	}
	private void colocarPanel() {
		
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		
	}
	private void colocarEtiqueta() {
		etiqueta = new JLabel("Escoja el ejercito que quiere ver");
		etiqueta.setBounds(560, 10, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 0, 20));
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Tierra");
		etiqueta.setBounds(145, 200, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 0, 20));
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Aire");
		etiqueta.setBounds(710, 200, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 0, 20));
		panel.add(etiqueta);
		
		etiqueta = new JLabel("Armada");
		etiqueta.setBounds(1205, 200, 300, 100);
		
		etiqueta.setFont(new Font("Arial", 0, 20));
		panel.add(etiqueta);
		
	}
	private void colocarElementos() {
		img1 = new JButton();
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Tierra.png"));
		img1.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(150,187,Image.SCALE_SMOOTH)));
		panel.add(img1);
		img1.setBounds(100,300,150,187);
		
		
		
		img2 = new JButton ();
		ImageIcon imgAire = new ImageIcon(getClass().getResource("/Imagenes/Aire.png"));
		img2.setIcon(new ImageIcon(imgAire.getImage().getScaledInstance(300,131,Image.SCALE_SMOOTH)));
		img2.setBounds(580,300,300,131);
		panel.add(img2);
		
		img3 = new JButton();
		ImageIcon imgArmada = new ImageIcon(getClass().getResource("/Imagenes/Armada.png"));
		img3.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(120,216,Image.SCALE_SMOOTH)));
		img3.setBounds(1180,290,120,216);
		panel.add(img3);
		
		ButtonGroup grupo = new ButtonGroup();
			grupo.add(rb1);
			grupo.add(rb2);
			grupo.add(rb3);
			eventoClic();
		
		bt1 = new JButton("Siguiente");
		bt1.setBounds(690, 600, 80, 40);
		panel.add(bt1);
		
		
		
	}
	public void eventoClic() {
		
		
		
		
		
		/*img1 = new JLabel();
		img1.setBounds(100,300,150,187);
		panel.add(img1);
		
		img2 = new JLabel();
		img2.setBounds(580,300,300,131);
		panel.add(img2);
		
		img3 = new JLabel();
		img3.setBounds(1180,280,120,216);
		panel.add(img3);
		
		
		ImageIcon imgTierra = new ImageIcon(getClass().getResource("/Imagenes/Tierra.png"));
		ImageIcon imgAire = new ImageIcon(getClass().getResource("/Imagenes/Aire.png"));
		ImageIcon imgArmada = new ImageIcon(getClass().getResource("/Imagenes/Armada.png"));
		
		img1.setIcon(new ImageIcon(imgTierra.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(),Image.SCALE_SMOOTH)));
		img2.setIcon(new ImageIcon(imgAire.getImage().getScaledInstance(img2.getWidth(), img2.getHeight(),Image.SCALE_SMOOTH)));
		img3.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(img3.getWidth(), img3.getHeight(),Image.SCALE_SMOOTH)));*/



	}

}
