package ejercito;

import java.text.SimpleDateFormat;

import escritura.Editor;

public class Aire extends Ejercito{
	
	private int Id;
	private static int IdSigiente=1;
	
	//Constructor
	public Aire(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
		
		Editor e = new Editor("datos/Aire.txt") ;
		
		e.escribir(NombreBase + "\t" + sede + "\t" + numTropas + "\t" + numNaves + "\t" + dia + "\t" + mes + "\t" + annio + "\t" + this.Id+ "\t"+ getFechaFundacion()+"\r\n");
	
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "-IdAire=" + Id + "\n-Nombre de la base: "+getNombreBase()+"\n-Lugar de la sede: "+getSede()+"\n-Número de tropas: "+getNumTropas()+"\n-Número de naves: "+getNumNaves() +"\n-Fecha de fundación de la Armada:  "+formatter.format(getFechaFundacion());
	}
	
	
	
	
	
	
	
	

}
