package ejercito;

public class Armada extends Ejercito {

	private int Id;
	private static int IdSigiente;
	
	//Constructor
	public Armada(int id,String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
	}

}
