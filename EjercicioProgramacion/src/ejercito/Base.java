package ejercito;

public class Base {
	
	private String base;
	private String coordenadas;
	private int cantPresupuesto;
	
	
	public Base(String base, String coordenadas, int cantPresupuesto) {
		super();
		this.base = base;
		this.coordenadas = coordenadas;
		this.cantPresupuesto = cantPresupuesto;
	}


	public String getBase() {
		return base;
	}


	public String getCoordenadas() {
		return coordenadas;
	}


	public int getCantPresupuesto() {
		return cantPresupuesto;
	}


	public void setBase(String base) {
		this.base = base;
	}


	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}


	public void setCantPresupuesto(int cantPresupuesto) {
		this.cantPresupuesto = cantPresupuesto;
	}
	
	
	
	

}
