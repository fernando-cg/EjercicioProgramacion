package ejercito;

import escritura.Editor;

public class TropasTierra extends Tropa {

	public TropasTierra(int cantTropas,  String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
		
		Editor e = new Editor("datos/TropasTierra.txt") ;
		
		e.escribir(cantTropas + "\t" + rango + "\t" + base + "\t" + getCantPresupuesto() +"\r\n");
	}

	@Override
	public String toString() {
		return "\n|Cantidad de tropas: " + getCantTropas() + "\n|Presupuesto" + getCantPresupuesto()
				+ "\n|Rango: " + getRango() + "\n|Base: " + getBase();
	}

	
	

}
