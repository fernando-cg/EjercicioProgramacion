package Interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Juego extends JFrame{
	
	private JPanel panel;
	private JLabel etiqueta, fondo, tabl;
	private JButton bt1, bt2;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	
	public Juego() {
	
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hola soy el titulito");
		
		
		Toolkit monitor = Toolkit.getDefaultToolkit();
		Dimension tamanio=monitor.getScreenSize();
		int alturaM = tamanio.height;
		int anchuraM = tamanio.width;
		
		setSize(anchuraM/2,alturaM/2);
		setLocation(anchuraM/4,alturaM/4);
		
		Image iconoAPP=monitor.getImage("icona.png");
		setIconImage(iconoAPP);
		
		iniciarComponentes();	
	
	}
	
	
	private void iniciarComponentes() {
		colocarPanel();
		colocarEtiqueta();
		colocarElementos();
		colocarFondo();
	}
	private void colocarFondo() {
		fondo = new JLabel ();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		fondo.setIcon(new ImageIcon(img1.getImage().getScaledInstance(anchuraM*2,alturaM,Image.SCALE_SMOOTH)));
		fondo.setBounds(0,0,anchuraM*2,alturaM);
		panel.add(fondo);
		
		tabl = new JLabel ();
		ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagenes/mar.png"));
		tabl.setIcon(new ImageIcon(img2.getImage().getScaledInstance(anchuraM*2,alturaM,Image.SCALE_SMOOTH)));
		tabl.setBounds(0,0,anchuraM*2,alturaM);
		panel.add(tabl);
	}
	
	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
	}
	
	private void colocarEtiqueta() {
		etiqueta = new JLabel("Hundir la flota");
		etiqueta.setBounds((int) ((anchuraM/2)+ anchuraM/4.5),10,300,40);
		etiqueta.setFont(new Font("Arial", 1, 20));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
	}
	
	private void colocarElementos() {
		
		ActionListener eventoClic1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Accion boton ir
					
			}
				
				
		};
		bt1.addActionListener(eventoClic1);
		
		ActionListener eventoClic = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Accion boton atras
				Marco m1 = new Marco();		
				m1.setVisible(true);
				m1.setTitle("Ejército de España");
				m1.setResizable(false);
				m1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		bt2.addActionListener(eventoClic);
		
		ActionListener eventoClic2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Accion boton easter egg
				
				Juego j1 = new Juego();		
				j1.setVisible(true);
				j1.setTitle("Hundir la Flota");
				j1.setResizable(false);
				j1.setExtendedState(Frame.MAXIMIZED_BOTH);
					
			}
				
				
		};
		egg.addActionListener(eventoClic2);
		
	}
	


	
	
}
