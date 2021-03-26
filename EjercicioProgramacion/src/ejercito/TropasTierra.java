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
		return "TropasTierra Cantidad de tropas: " + getCantTropas() + "| Presupuesto" + getCantPresupuesto()
				+ "|Rango: " + getRango() + "|Base: " + getBase();
	}

	
	

}
