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
public Ejercito(String sede, int nºTropas, int nºNaves,int dia,int mes,int annio) {
	super();
	this.sede = sede;
	this.NumTropas = nºTropas;
	this.NumNaves = nºNaves;
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
public int getNºTropas() {
	return NumTropas;
}
public void setNºTropas(int nºTropas) {
	this.NumTropas = nºTropas;
}
public int getNºNaves() {
	return NumNaves;
}
public void setNºNaves(int nºNaves) {
	this.NumNaves = nºNaves;
}

}
