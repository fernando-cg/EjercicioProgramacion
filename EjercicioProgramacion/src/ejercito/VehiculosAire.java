package ejercito;

public class VehiculosAire extends Vehiculo {

	public VehiculosAire(int cantVehiculos, String tipo,String descripcion) {
		super(cantVehiculos, tipo,descripcion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "VehiculosAire Cantidad: " + getCantVehiculos() + "|Tipo" + getTipo()
				+ "|Presupuesto=" + getPresupuesto()+"|Descripción del vehículo: "+getDescripcion();
	}

}
