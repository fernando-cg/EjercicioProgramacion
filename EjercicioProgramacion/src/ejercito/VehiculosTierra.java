package ejercito;

import escritura.Editor;

public class VehiculosTierra extends Vehiculo{

	public VehiculosTierra(int cantVehiculos, String tipo,String descripcion) {
		super(cantVehiculos, tipo,descripcion);
		
		
		Editor e = new Editor("datos/VehiculosTierra.txt") ;
		
		e.escribir(cantVehiculos + "\t" + tipo + "\t" + descripcion +"\r\n");
	}
	
	@Override
	public String toString() {
		return "VehiculosAire Cantidad: " + getCantVehiculos() + "|Tipo" + getTipo()
				+ "|Presupuesto=" + getPresupuesto()+"|Descripción del vehículo: "+getDescripcion();
	}

}
