package ejercito;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Armada>armadas=new ArrayList<Armada>();
		ArrayList<Aire>aires=new ArrayList<Aire>();
		ArrayList<Tierra>tierras=new ArrayList<Tierra>();
		ArrayList<TropasArmada>tropasarmada=new ArrayList<TropasArmada>();
		ArrayList<VehiculosArmada>vehiculosarmada=new ArrayList<VehiculosArmada>();
		ArrayList<TropasAire>tropasaire=new ArrayList<TropasAire>();
		ArrayList<VehiculosAire>vehiculosaire=new ArrayList<VehiculosAire>();
		ArrayList<TropasTierra>Tropastierra=new ArrayList<TropasTierra>();
		ArrayList<VehiculosTierra>vehiculostierra=new ArrayList<VehiculosTierra>();
		
		Armada arm1=new Armada("Comandancia Naval de Sevilla","", 20838, 203, 17, 2, 1915);
		Aire air1=new Aire("Cuartel General del Ejército del Aire", "Madrid", 20900, 412, 28,2, 1913);
		Tierra tier1=new Tierra("Cuartel General del Ejercito de Tierra","Madrid",80000,132,1,1,1767);
	}

}

