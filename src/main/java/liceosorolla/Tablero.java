package main.java.liceosorolla;

import java.util.ArrayList;

public class Tablero {
	public static void tablero(ArrayList<Carta> tablero){
		
		for(int i = 0; i < 6;i++) {
			if(i != 6) {
				for(int j = 0; j < 10;j++) {
					System.out.println(tablero.get(j));
				}
			}else {
				for(int j = 0; j < 4;j++) {
					System.out.println(tablero.get(j));
				}
			}
		}
	}
	

	/*
	public static void pasa(int cantidad, ArrayList<Carta> tablero, ArrayList<Carta> fila) {
		for(int j = 0; j < cantidad ;j++) {
			tablero.add(fila.sacarCarta());
		}		
	}*/
}
