package escritura;

import java.io.* ;
import java.util.ArrayList;
import java.util.StringTokenizer;

import ejercito.*;
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

public ArrayList<Tierra> actualizaratier(ArrayList<Tierra> array) {
	
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
		   array.add(new Tierra(nombreBase,sede,numTropas2,numNaves2,dia2,mes2,annio2));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasArmada> actualizartroparm(ArrayList<TropasArmada> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantTropas =  token.nextToken().trim() ;
		   String  rango =  token.nextToken().trim();
		   String       base =  token.nextToken().trim();
		  
		  
		   
		   int    cantTropas2=Integer.parseInt(cantTropas);
		   
		   array.add(new TropasArmada(cantTropas2,rango,base));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasTierra> actualizartropatier(ArrayList<TropasTierra> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantTropas =  token.nextToken().trim() ;
		   String  rango =  token.nextToken().trim();
		   String       base =  token.nextToken().trim();
		  
		  
		   
		   int    cantTropas2=Integer.parseInt(cantTropas);
		   
		   array.add(new TropasTierra(cantTropas2,rango,base));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<TropasAire> actualizartropaair(ArrayList<TropasAire> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantTropas =  token.nextToken().trim() ;
		   String  rango =  token.nextToken().trim();
		   String       base =  token.nextToken().trim();
		  
		  
		   
		   int    cantTropas2=Integer.parseInt(cantTropas);
		   
		   array.add(new TropasAire(cantTropas2,rango,base));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}




public ArrayList<VehiculosArmada> actualizarvehiarm(ArrayList<VehiculosArmada> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantVehiculos =  token.nextToken().trim() ;
		   String  tipo =  token.nextToken().trim();
		   String       descripcion =  token.nextToken().trim();
		  
		  
		   
		   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
		   
		   array.add(new VehiculosArmada(cantVehiculos2,tipo,descripcion));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<VehiculosAire> actualizarvehiair(ArrayList<VehiculosAire> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantVehiculos =  token.nextToken().trim() ;
		   String  tipo =  token.nextToken().trim();
		   String       descripcion =  token.nextToken().trim();
		  
		  
		   
		   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
		   
		   array.add(new VehiculosAire(cantVehiculos2,tipo,descripcion));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}

public ArrayList<VehiculosTierra> actualizarvehitier(ArrayList<VehiculosTierra> array) {
	
	String linea = null;
	
    BufferedReader leerFichero;
    
    try {
    	
    	leerFichero = new BufferedReader (new FileReader(directorio));
		while( (linea = leerFichero.readLine()) != null)
		{
			
		   StringTokenizer token = new StringTokenizer(linea, "\t");
		   
		   String     cantVehiculos =  token.nextToken().trim() ;
		   String  tipo =  token.nextToken().trim();
		   String       descripcion =  token.nextToken().trim();
		  
		  
		   
		   int    cantVehiculos2=Integer.parseInt(cantVehiculos);
		   
		   array.add(new VehiculosTierra(cantVehiculos2,tipo,descripcion));
		   
		   
		   }
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	return array ;
}


}
