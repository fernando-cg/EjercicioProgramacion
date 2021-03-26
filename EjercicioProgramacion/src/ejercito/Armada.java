package ejercito;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import escritura.*;

public class Armada extends Ejercito {

	private int Id;
	private static int IdSigiente=1;
	private Date FechaFundacionArmada;
	
	//Constructor
	public Armada(String NombreBase, String sede, int numTropas, int numNaves, int dia, int mes, int annio) {
		super(NombreBase, sede, numTropas, numNaves, dia, mes, annio);
		Id=IdSigiente;
		IdSigiente++;
		
		Calendar cal=Calendar.getInstance();
		cal.set(annio, (mes-1),dia);
		this.FechaFundacionArmada=cal.getTime();
		
		Editor e = new Editor("datos/Armada.txt") ;
		
		e.escribir(NombreBase + "\t" + sede + "\t" + numTropas + "\t" + numNaves + "\t" + dia + "\t" + mes + "\t" + annio + "\t" + this.Id + "\t" + this.FechaFundacionArmada + "\r\n");
	
	}

	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "Armada Id=" + Id + "|Nombre de la base: "+getNombreBase()+"|Lugar de la sede: "+getSede()+"|Número de tropas: "+getNumTropas()+"|Número de naves: "+getNumNaves() +"|Fecha de fundación de la Armada:  "+formatter.format(FechaFundacionArmada);
	}
	
	

}
