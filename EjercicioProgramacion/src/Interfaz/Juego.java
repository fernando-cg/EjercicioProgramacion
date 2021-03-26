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
	private JLabel etiqueta, fondo, tabl1, tabl2;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13,bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28, bt29, bt30, bt31, bt32, bt33, bt34, bt35, bt36, bt37, bt38, bt39, bt40, bt41, bt42, bt43, bt44, bt45, bt46, bt47, bt48, bt49, bt50, bbt1, bbt2, bbt3, bbt4, bbt5, bbt6, bbt7, bbt8, bbt9, bbt10, bbt11, bbt12, bbt13,bbt14, bbt15, bbt16, bbt17, bbt18, bbt19, bbt20, bbt21, bbt22, bbt23, bbt24, bbt25, bbt26, bbt27, bbt28, bbt29, bbt30, bbt31, bbt32, bbt33, bbt34, bbt35, bbt36, bbt37, bbt38, bbt39, bbt40, bbt41, bbt42,bbt43, bbt44, bbt45, bbt46, bbt47, bbt48, bbt49, bbt50;
	private JTextField tb1, tb2;
	Toolkit monitor = Toolkit.getDefaultToolkit();
	Dimension tamanio=monitor.getScreenSize();
	int alturaM = tamanio.width;
	int anchuraM= tamanio.height;
	
	int alturaT = alturaM/6;
	int anchuraT= anchuraM/6;
	
	
	public Juego() {
	
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Hundir la flota");
		
		
		
		
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
		tabl1 = new JLabel ();
		ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagenes/mar.png"));
		tabl1.setIcon(new ImageIcon(img2.getImage().getScaledInstance(anchuraM/2,anchuraM/2,Image.SCALE_SMOOTH)));
		tabl1.setBounds(anchuraM/6,-alturaM/6,anchuraM*2,alturaM);
		panel.add(tabl1);
		
		tabl2 = new JLabel ();
		tabl2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(anchuraM/2,anchuraM/2,Image.SCALE_SMOOTH)));
		tabl2.setBounds((int) (anchuraM/1.1),-alturaM/6,anchuraM*2,alturaM);
		panel.add(tabl2);
		
		
		fondo = new JLabel ();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		fondo.setIcon(new ImageIcon(img1.getImage().getScaledInstance(anchuraM*2,alturaM,Image.SCALE_SMOOTH)));
		fondo.setBounds(0,0,anchuraM*2,alturaM);
		panel.add(fondo);
		
		
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
		
		
		//FILA 10
		bt1 = new JButton("IR");
		ImageIcon imgArmada = new ImageIcon(getClass().getResource("/Imagenes/marco.png"));
		bt1.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt1.setOpaque(false);
		bt1.setContentAreaFilled(false);
		bt1.setBorderPainted(false);
		panel.add(bt1);
		bt1.setBounds((int) (anchuraT*1.25), (int) (alturaT*1.06), 52, 40);
		
		bt2 = new JButton("IR");
		bt2.setIcon(new ImageIcon(imgArmada.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH)));
		bt2.setOpaque(false);
		bt2.setContentAreaFilled(false);
		bt2.setBorderPainted(false);
		panel.add(bt2);
		bt2.setBounds((int) (anchuraT*1.25)+ 40, (int) (alturaT*1.06), 52, 40);
		
		
		
		
		
		
	}
	


	
	
}
