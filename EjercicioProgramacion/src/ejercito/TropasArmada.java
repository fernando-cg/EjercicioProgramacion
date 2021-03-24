package ejercito;

public class TropasArmada extends Tropa {

	public TropasArmada(int cantTropas, String rango, String base) {
		super(cantTropas, rango, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TropasArmada Cantidad de tropas=" + getCantTropas() + "| Presupuesto" + getCantPresupuesto()
				+ "|Rango: " + getRango() + "|Base: " + getBase();
	}

	

}
