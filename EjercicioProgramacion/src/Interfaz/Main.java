package Interfaz;

import java.awt.Frame;


public class Main {
	
	public static void main(String[] args) {
		
		new Thread (new mMarco()).start();
		new mReproductor().start();
		
		
		
		
	}
	

}
