package ejercito;

public class Tropa {
	
	private int cantTropas;
	private int cantPresupuesto;
	private String rango;
	private String base;
	
	public Tropa(int cantTropas, int cantPresupuesto, String rango, String base) {
		super();
		this.cantTropas = cantTropas;
		this.cantPresupuesto = cantPresupuesto;
		this.rango = rango;
		this.base = base;
	}

	public int getCantTropas() {
		return cantTropas;
	}

	public int getCantPresupuesto() {
		return cantPresupuesto;
	}

	public String getRango() {
		return rango;
	}

	public String getBase() {
		return base;
	}

	public void setCantTropas(int cantTropas) {
		this.cantTropas = cantTropas;
	}

	public void setCantPresupuesto(int cantPresupuesto) {
		this.cantPresupuesto = cantPresupuesto;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public void setBase(String base) {
		this.base = base;
	}
	
	
	
	

}
