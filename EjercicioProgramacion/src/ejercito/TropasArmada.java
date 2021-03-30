package ejercito;

import escritura.Editor;

public class TropasArmada extends Tropa {

	public TropasArmada(int cantTropas, String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
		
		Editor e = new Editor("datos/TropasArmada.txt") ;
		
		e.escribir(cantTropas + "\t" + rango + "\t" + base + "\t" + getCantPresupuesto() +"\r\n");
	}

	@Override
	public String toString() {
		return "\t|Cantidad de tropas: " + getCantTropas() + "\t|Presupuesto" + getCantPresupuesto()
				+ "\t|Rango: " + getRango() + "\t|Base: " + getBase();
	}

	

}
