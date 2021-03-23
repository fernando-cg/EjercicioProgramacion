package Interfaz;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class mTierra extends JFrame{
	
	private JPanel panel;
	private JLabel etiqueta;
	private JButton img1, img2, img3;
	
	public mTierra() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		
		Toolkit monitor = Toolkit.getDefaultToolkit();
		Dimension tamanio=monitor.getScreenSize();
		int alturaM = tamanio.width;
		int anchuraM= tamanio.height;
		
		setSize(anchuraM/2, alturaM/2);
		setLocation(anchuraM/4, alturaM/4);
	}

}
