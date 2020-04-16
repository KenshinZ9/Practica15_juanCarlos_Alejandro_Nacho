package main.java.liceosorolla;

import java.util.ArrayList;

import main.java.liceosorolla.Carta;

public class StartSolitario {
	
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		ArrayList<Carta> primerasCartas = new ArrayList<Carta>();
		
		
		for(int j = 0; j < 54 ;j++) {
			primerasCartas.add(baraja.sacarCarta());
		}
		
		
		Tablero tablero = new Tablero();
		
		tablero.pasar(primerasCartas);
		tablero.imprimir();
		
		System.out.println(tablero.maximo());
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Baraja: "+baraja.getCartas().size());
	
		System.out.println("Tablero: "+barajaTablero.size());
		int x=9;
		for(int j = 0; j < barajaTablero.size();j++) {
			System.out.print(barajaTablero.get(j));
			if(j == x) {
				System.out.println();
				x = x+10;
			}
			
		}
		
		/*System.out.println("columna:" +columna.getColumna().size());
		
		Columna columna = new Columna(barajaTablero);
		for(int j = 0; j < columna.getColumna().size();j++) {
			System.out.print(columna.getColumna().get(j));
		}
		System.out.println();
		Columna columna1 = new Columna(barajaTablero);
		for(int j = 0; j < columna1.getColumna().size();j++) {
			System.out.print(columna1.getColumna().get(j));
		}
		*/
	}

	
	
}

	
	
	
/*
	for(int j = 0; j < baraja.getCartas().size();j++) {
		System.out.println(baraja.getCartas().get(j));
	}
	System.out.println(baraja.getCartas().size());
	
	for(int j = 0; j < tablero.size();j++) {
		System.out.println(tablero.get(j));
	}
	System.out.println(tablero.size());
	*/

	
	

