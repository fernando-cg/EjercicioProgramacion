package pruebas;

import java.io.* ;
public class Leer {
	public static void main(String[] args) {
		
    String cadena;
    
	FileReader f = null;
	
	try {
		f = new FileReader("/Users/fernando_cg/Desktop/objetos.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
    BufferedReader b = new BufferedReader(f);
    
    try {
		while((cadena = b.readLine())!=null) {
		      System.out.println(cadena);
		  }
	} catch (IOException i) {
		i.printStackTrace();
	}
    
    try {
		b.close();
	} catch (IOException a) {
		a.printStackTrace();
	}
}
}
