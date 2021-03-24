package ejercito;

public class TropasAire extends Tropa {

	public TropasAire(int cantTropas,  String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "TropasAire Cantidad de tropas=" + getCantTropas() + "| Presupuesto: " + getCantPresupuesto()
				+ "|Rango: " + getRango() + "|Base: " + getBase();
	}


}
