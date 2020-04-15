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
		int numero=0;
		for(int j=0;j < cartas.size();j++) {
			columnas.get(numero).agregarCarta(cartas.get(j));
			numero++;
			if(numero == 9) {
				numero = numero - 10;
			}
		}		
	}
}
