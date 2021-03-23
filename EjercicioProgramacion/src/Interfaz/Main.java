package Interfaz;

import java.awt.Frame;

public class Main {
	
	public static void main(String[] args) {
		
		Marco m1 = new Marco();
		
		m1.setVisible(true);
		//m1.setSize(500, 300);
		m1.setTitle("Ejército de España");
		m1.setResizable(false);
		m1.setExtendedState(Frame.MAXIMIZED_BOTH);
		//m1.setLocation(200, 200);
		//m1.setBounds(200, 200, 200, 200);
	}
	

}
