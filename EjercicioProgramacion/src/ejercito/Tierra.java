package ejercito;

public class Tierra extends Ejercito {

	private int Id;
	private static int IdSigiente=0;
	
	//Constructor
	public Tierra(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
	}
}
