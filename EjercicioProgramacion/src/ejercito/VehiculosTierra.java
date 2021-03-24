package ejercito;

public class VehiculosTierra extends Vehiculo{

	public VehiculosTierra(int cantVehiculos, String tipo) {
		super(cantVehiculos, tipo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "VehiculosArmada Cantidad: " + getCantVehiculos() + "|Tipo" + getTipo()
				+ "|Presupuesto=" + getPresupuesto();
	}

}
