package ejercito;

public class Tierra extends Ejercito {

	private int Id;
	private static int IdSigiente;
	
	//Constructor
	public Tierra(int id,String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
	}
}
