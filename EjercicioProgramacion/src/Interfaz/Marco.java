package Interfaz;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class Marco extends JFrame {
	
	private JPanel panel;
	private JLabel etiqueta;
	private JButton img1, img2, img3;
	private boolean tier = false, air = false, arm= false;
	
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
	private void colocarElementos(){
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
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mTierra t1 = new mTierra();		
				t1.setVisible(true);
				t1.setTitle("Ejército de Tierra");
				t1.setResizable(false);
				t1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		img1.addActionListener(eventoClic);
		
		ActionListener eventoClic2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				mAire a1 = new mAire();		
				a1.setVisible(true);
				a1.setTitle("Ejército de Tierra");
				a1.setResizable(false);
				a1.setExtendedState(Frame.MAXIMIZED_BOTH);
				
					
					
			}
				
				
		};
		img2.addActionListener(eventoClic2);
		
		ActionListener eventoClic3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				mArmada ar1 = new mArmada();		
				ar1.setVisible(true);
				ar1.setTitle("Ejército de Tierra");
				ar1.setResizable(false);
				ar1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
					
			}
				
				
		};
		img3.addActionListener(eventoClic3);
		

		
		
		
	}
	
	
	
	
	

}
