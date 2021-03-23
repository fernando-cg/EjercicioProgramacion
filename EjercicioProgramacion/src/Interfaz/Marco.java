package Interfaz;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.*;


@SuppressWarnings("serial")
public class Marco extends JFrame {
	
	private JPanel panel;
	private JLabel etiqueta;
	private JButton img1, img2, img3;
	private boolean a=false, b=false , c=false;
	
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
		etiqueta = new JLabel("Escoja el ejército que quiere ver");
		etiqueta.setBounds(580, 10, 300, 100);
		
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
		
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==img1) {
			a=true;
			b=false;
			c=false;
			
			}
		if (e.getSource()==img2) {
			b=true;
			a=false;
			c=false;
			
			}
		if (e.getSource()==img3) {
			c=true;
			b=false;
			a=false;
				
			}
	
	
	}
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	

}
