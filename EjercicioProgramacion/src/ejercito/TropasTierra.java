package ejercito;

public class TropasTierra extends Tropa {

	public TropasTierra(int cantTropas,  String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TropasTierra Cantidad de tropas: " + getCantTropas() + "| Presupuesto" + getCantPresupuesto()
				+ "|Rango: " + getRango() + "|Base: " + getBase();
	}

	
	

}
