package ejercito;

import escritura.Editor;

public class VehiculosAire extends Vehiculo {

	public VehiculosAire(int cantVehiculos, String tipo,String descripcion) {
		super(cantVehiculos, tipo,descripcion);
		
		
		Editor e = new Editor("datos/VehiculosAire.txt") ;
		
		e.escribir(cantVehiculos + "\t" + tipo + "\t" + descripcion +"\r\n");
	}
	
	@Override
	public String toString() {
		return "-Nombre:" + getTipo()+"\n-Cantidad: " + getCantVehiculos() +
				 "\n-Descripción del vehículo: "+getDescripcion();
	}

}
