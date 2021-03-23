package ejercito;

import java.util.Calendar;
import java.util.Date;

public abstract class Ejercito {
private  Date fechaFundacion;
private String sede;
private int presupuesto;
private int nºTropas;
private int nºNaves;
//Constructor
public Ejercito(String sede, int nºTropas, int nºNaves,int dia,int mes,int annio) {
	super();
	this.sede = sede;
	this.nºTropas = nºTropas;
	this.nºNaves = nºNaves;
	Calendar Fecha1=Calendar.getInstance();
	Fecha1.set(annio, mes,dia);
	
}
//Getters y Setters

}
