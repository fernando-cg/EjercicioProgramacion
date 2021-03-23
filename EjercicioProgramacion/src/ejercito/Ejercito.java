package ejercito;

import java.util.Calendar;
import java.util.Date;

public abstract class Ejercito {
private  Date fechaFundacion;
private String sede;
private int presupuesto;
private int NumTropas;
private int NumNaves;
//Constructor
public Ejercito(String sede, int numTropas, int numNaves,int dia,int mes,int annio) {
	super();
	this.sede = sede;
	this.NumTropas = numTropas;
	this.NumNaves = numNaves;
	Calendar Fecha1=Calendar.getInstance();
	Fecha1.set(annio, (mes-1),dia);
	this.fechaFundacion=Fecha1.getTime();
	
}
//Getters y Setters
public Date getFechaFundacion() {
	return fechaFundacion;
}
public void setFechaFundacion(Date fechaFundacion) {
	this.fechaFundacion = fechaFundacion;
}
public String getSede() {
	return sede;
}
public void setSede(String sede) {
	this.sede = sede;
}
public int getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(int presupuesto) {
	this.presupuesto = presupuesto;
}
public int getNumTropas() {
	return NumTropas;
}
public void setNºTropas(int numTropas) {
	this.NumTropas = numTropas;
}
public int getNumNaves() {
	return NumNaves;
}
public void setNumNaves(int numNaves) {
	this.NumNaves = numNaves;
}

}
