package ejercito;

import java.util.ArrayList;
import escritura.Editor ;

public class main {

	public static void main(String[] args) {
		
		//arraylist
		ArrayList<Armada>armadas=new ArrayList<Armada>();
		ArrayList<Aire>aires=new ArrayList<Aire>();
		ArrayList<Tierra>tierras=new ArrayList<Tierra>();
		ArrayList<TropasArmada>tropasarmada=new ArrayList<TropasArmada>();
		ArrayList<VehiculosArmada>vehiculosarmada=new ArrayList<VehiculosArmada>();
		ArrayList<TropasAire>tropasaire=new ArrayList<TropasAire>();
		ArrayList<VehiculosAire>vehiculosaire=new ArrayList<VehiculosAire>();
		ArrayList<TropasTierra>Tropastierra=new ArrayList<TropasTierra>();
		ArrayList<VehiculosTierra>vehiculostierra=new ArrayList<VehiculosTierra>();
		
		//editor
		Editor aire = new Editor("datos/Aire.txt") ; 
		Editor armada = new Editor("datos/Armada.txt") ;
		Editor tierra = new Editor("datos/Tierra.txt") ;
		Editor tropasAire = new Editor("datos/TropasAire.txt") ;
		Editor tropasArmada = new Editor("datos/TropasArmada.txt") ;
		Editor tropasTierra = new Editor("datos/TropasTierra.txt") ;
		Editor usuarios = new Editor("/Users/fernando_cg/Desktop/datos/Usuarios.txt") ;
		Editor vehiculosAire = new Editor("/Users/fernando_cg/Desktop/datos/VehiculosAire.txt") ;
		Editor vehiculosArmada = new Editor("/Users/fernando_cg/Desktop/datos/VehiculosArmada.txt") ;
		Editor vehiculosTierra = new Editor("/Users/fernando_cg/Desktop/datos/VehiculosTierra.txt") ;
		
		armadas = armada.actualizar(armadas) ;
		
		Armada arm1=new Armada("Comandancia Naval de Sevilla","", 20838, 203, 17, 2, 1915);
		Aire air1=new Aire("Cuartel General del Ejército del Aire", "Madrid", 20900, 412, 28,2, 1913);
		Tierra tier1=new Tierra("Cuartel General de l  Ejército de Tierra","Madrid",80000,132,1,1,1767);
		TropasTierra tt1=new TropasTierra(10000, "Oficiales", "Cuartel General	del Ejercito de Tierra");
		VehiculosTierra vt1=new VehiculosTierra(219, "Leopardo 2E","El Leopardo 2E es una variante del carro de combate alemán Leopard 2A6 adaptado a los requerimientos del Ejército de Tierra de España, que lo adquirió como parte del programa de modernización de armamento llamado Programa Coraza. ");
		TropasArmada ta1=new TropasArmada(8400, "Oficiales", "Comandancia Naval de Sevilla");
		VehiculosArmada a1= new VehiculosArmada(5, "Fragatas","La fragata es un buque de guerra concebido para actuar en misiones de guerra naval y antisubmarina, aunque puede disponer de sistemas para actuar como buque de apoyo en otras misiones. ");
		TropasAire tair1= new TropasAire(9500, "Oficiales", "Base Aerea de Moron");
		VehiculosAire va1=new VehiculosAire(73, "Eurofighter Typhoon","El Eurofighter Typhoon es un caza polivalente, bimotor y de gran maniobrabilidad, diseñado y construido por el consorcio de empresas europeas Eurofighter GmbH creado en 1983 y compuesto por las compañías Airbus, BAE Systems y Alenia Aeronautica.​");


		
	}

}

