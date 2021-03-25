package escritura;

import java.io.* ;
public class Editor {
	
	private String directorio ;

	public Editor(String directorio) {
		super();
		this.directorio = directorio;
	}
	
	
	public String lectura(){
		
		String cadena = null ;
		String cadenaf="" ;
		
		FileReader f = null ;
		
		try {
			
			f = new FileReader(directorio);
			
		} catch (FileNotFoundException e) {
			
			cadenaf = "No se ha encontrado el archivo" ;
			
		}
		
		
	    BufferedReader b = new BufferedReader(f);
	    
	    try {
	    	
			while((cadena = b.readLine())!=null) {
			      
				cadenaf = cadenaf + cadena + "\n" ;
			  }
			
		} catch (IOException i) {
			
			i.printStackTrace();
			
		}

	    
	    try {
			b.close();
			
		} catch (IOException a) {
			
			a.printStackTrace();
		}
	    return cadenaf ;
	}
	
	public void escribir(String cadena) {
		
		String cad = lectura() ;
		
		try {
			
	        FileWriter myWriter = new FileWriter(directorio);
	        
	        myWriter.write(cad + cadena);
	        myWriter.close();
        
    	
        System.out.println("Escrito");
        
      } catch(IOException e) {
    	  
        System.out.println("Error");
        
        e.printStackTrace();
      }
	    
		
	}
}
