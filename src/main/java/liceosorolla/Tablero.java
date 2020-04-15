package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Columna> columnas = new ArrayList<Columna>();
	
	
	public Tablero(){
		for(int i=0;i < 10;i++) {
			columnas.add(new Columna());
		}
	}
	
	
	
	public void pasar(ArrayList<Carta> cartas) {
		for(int j=0;j < cartas.size();j++) {
			columnas.get(j%10).agregarCarta(cartas.get(j));
		}		
	}
}
