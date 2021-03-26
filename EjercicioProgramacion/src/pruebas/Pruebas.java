package pruebas;

import java.io.* ;
import java.util.ArrayList;
import java.util.StringTokenizer;

import ejercito.*;

public class Pruebas {
		
		private String directorio ;

		public Pruebas(String directorio) {
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
			
			FileReader f = null ;
			
			try {
				
				f = new FileReader(directorio);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}
			
			try {
				
				BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directorio,true), "utf-8"));
			
				escribir.write(cadena);
				
				escribir.close();
			} catch (IOException e) {
				
				e.printStackTrace();
				System.out.println("Error");
			}
				
		    
			
		}
		
		public ArrayList<Armada> actualizarar(ArrayList<Armada> array) {
			
			String linea = null;
			
	        BufferedReader leerFichero;
	        
	        try {
	        	
	        	leerFichero = new BufferedReader (new FileReader(directorio));
				while( (linea = leerFichero.readLine()) != null)
				{
					
				   StringTokenizer token = new StringTokenizer(linea, "\t");
				   String     nombreBase =  token.nextToken().trim() ;
				   String  sede =  token.nextToken().trim();
				   String       numeroTropas =  token.nextToken().trim();
				   String     numeroNaves =  token.nextToken().trim();
				   String     dia =  token.nextToken().trim();
				   String     mes =  token.nextToken().trim();
				   String     annio =  token.nextToken().trim();
				  
				   
				   int    numTropas2=Integer.parseInt(numeroTropas);
				   int    numNaves2=Integer.parseInt(numeroNaves);
				   int    dia2=Integer.parseInt(dia);
				   int    mes2=Integer.parseInt(mes);
				   int    annio2=Integer.parseInt(annio);
				   array.add(new Armada(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2));
				   
				   
				   }
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			return array ;
		}
		
	public ArrayList<Aire> actualizarair(ArrayList<Aire> array) {
			
			String linea = null;
			
	        BufferedReader leerFichero;
	        
	        try {
	        	
	        	leerFichero = new BufferedReader (new FileReader(directorio));
				while( (linea = leerFichero.readLine()) != null)
				{
					
				   StringTokenizer token = new StringTokenizer(linea, "\t");
				   
				   String     nombreBase =  token.nextToken().trim() ;
				   String  sede =  token.nextToken().trim();
				   String       numeroTropas =  token.nextToken().trim();
				   String     numeroNaves =  token.nextToken().trim();
				   String     dia =  token.nextToken().trim();
				   String     mes =  token.nextToken().trim();
				   String     annio =  token.nextToken().trim();
				  
				   
				   int    numTropas2=Integer.parseInt(numeroTropas);
				   int    numNaves2=Integer.parseInt(numeroNaves);
				   int    dia2=Integer.parseInt(dia);
				   int    mes2=Integer.parseInt(mes);
				   int    annio2=Integer.parseInt(annio);
				   array.add(new Aire(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2));
				   
				   
				   }
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			return array ;
		}
	
		private void eliminarFila(int fila) {
			
			ArrayList<String> array = new ArrayList<String>() ;
			String linea = null;
			
	        BufferedReader leerFichero;
	        
	        try {
	        	
	        	leerFichero = new BufferedReader (new FileReader(directorio));
				while( (linea = leerFichero.readLine()) != null)
				{
					
					array.add(linea) ;
				   
				   
				   }
				
				array.remove(fila) ;
				BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directorio,true), "utf-8"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(directorio));
				bw.write("");
				for(int x = 0 ; x < array.size() ; x++) {
					escribir.write(array.get(x)) ;
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			
		}
	}

