package ejercito;

public class Vehiculo {
private int cantVehiculos;
private String Tipo;
private int Presupuesto;
//Constructor
public Vehiculo(int cantVehiculos, String tipo, int presupuesto) {
	super();
	this.cantVehiculos = cantVehiculos;
	Tipo = tipo;
	Presupuesto = presupuesto;
}
//Getters y setters
public int getCantVehiculos() {
	return cantVehiculos;
}
public void setCantVehiculos(int cantVehiculos) {
	this.cantVehiculos = cantVehiculos;
}
public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
public int getPresupuesto() {
	return Presupuesto;
}
public void setPresupuesto(int presupuesto) {
	Presupuesto = presupuesto;
}

}
