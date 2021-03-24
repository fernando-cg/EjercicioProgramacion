package ejercito;

import java.text.SimpleDateFormat;

public class Aire extends Ejercito{
	
	private int Id;
	private static int IdSigiente=0;
	
	//Constructor
	public Aire(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "Aire Id=" + Id + "|Nombre de la base: "+getNombreBase()+"|Lugar de la sede: "+getSede()+"|Número de tropas: "+getNumTropas()+"|Número de naves: "+getNumNaves() +"|Fecha de fundación de la Armada: "+formatter.format(getFechaFundacion());
	}
	
	
	
	
	
	
	
	

}
