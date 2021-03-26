package ejercito;

import java.text.SimpleDateFormat;

public class Tierra extends Ejercito {

	private int Id;
	private static int IdSigiente=1;
	
	//Constructor
	public Tierra(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "Tierra Id=" + Id + "|Nombre de la base: "+getNombreBase()+"|Lugar de la sede: "+getSede()+"|Número de tropas: "+getNumTropas()+"|Número de naves: "+getNumNaves() +"|Fecha de fundación de la Armada:  "+formatter.format(getFechaFundacion());
	}
	
}
