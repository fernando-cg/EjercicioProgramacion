package ejercito;

import escritura.Editor;

public class VehiculosArmada extends Vehiculo {

	public VehiculosArmada(int cantVehiculos, String tipo,String descripcion) {
		super(cantVehiculos, tipo,descripcion);
		// TODO Auto-generated constructor stub
		
		Editor e = new Editor("datos/VehiculosArmada.txt") ;
		
		e.escribir(cantVehiculos + "\t" + tipo + "\t" + descripcion +"\r\n");
	}

	@Override
	public String toString() {
		return "-Nombre:" + getTipo()+"\n-Cantidad: " + getCantVehiculos() +
				 "\n-Descripción del vehículo: "+getDescripcion();
	}
	
	

}
