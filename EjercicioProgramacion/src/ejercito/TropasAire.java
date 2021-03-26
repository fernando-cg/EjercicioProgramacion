package ejercito;

import escritura.Editor;

public class TropasAire extends Tropa {

	public TropasAire(int cantTropas,  String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
		
		Editor e = new Editor("datos/TropasAire.txt") ;
		
		e.escribir(cantTropas + "\t" + rango + "\t" + base + "\t" + getCantPresupuesto() +"\r\n");
	}
	
	@Override
	public String toString() {
		return "TropasAire Cantidad de tropas=" + getCantTropas() + "| Presupuesto: " + getCantPresupuesto()
				+ "|Rango: " + getRango() + "|Base: " + getBase();
	}


}
