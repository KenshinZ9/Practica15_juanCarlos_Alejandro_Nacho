package main.java.liceosorolla;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.liceosorolla.Carta;

public class StartSolitario {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		ArrayList<Carta> primerasCartas = new ArrayList<Carta>();
		int columna;
		int columna1;
		int cantidad;
		boolean acabar = true;
		
		for(int j = 0; j < 54 ;j++) {
			primerasCartas.add(baraja.sacarCarta());
		}
		tablero.pasar(primerasCartas,primerasCartas.size());
		System.out.println("Bienvenido al Solitario Spider!!!");
		System.out.println("Empieza el juego..."+"\r");
		do {
			if(baraja.getCartas().size() !=0) {
				System.out.println("M                     --------");
			}else {
				System.out.println("-                     --------");
			}
			primerasCartas.clear();
			tablero.girar();
			tablero.imprimir();
			if(baraja.getCartas().size() != 0){
				System.out.println("¿Desea sacar nuevas cartas del mazo?");
				if(scanner.next().equals("si")) {
					for(int j = 0; j < 10 ;j++) {
						primerasCartas.add(baraja.sacarCarta());
					}
					tablero.pasar(primerasCartas,10);
					continue;
				}
			}
			System.out.println("¿Qué columna desea mover?");
			columna = scanner.nextInt()-1;
			System.out.println("¿A qué columna desea mover?");
			columna1 = scanner.nextInt()-1;
			System.out.println("¿Cuántas cartas?");
			cantidad = scanner.nextInt();
			tablero.mover(columna, columna1,cantidad);
		}while(acabar);
	}
	
	
}

	
	
	


/*public static int comprobarInt() {
		boolean corregir;
		int numero = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			corregir = teclado.hasNextInt();
				if(corregir){
					numero = teclado.nextInt();
				}else{
						System.out.println("Introduce un numero");
				}
		}while(!corregir); 
		return numero;
	}

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



	for(int j = 0; j < baraja.getCartas().size();j++) {
		System.out.println(baraja.getCartas().get(j));
	}
	System.out.println(baraja.getCartas().size());
	
	for(int j = 0; j < tablero.size();j++) {
		System.out.println(tablero.get(j));
	}
	System.out.println(tablero.size());
	*/

	
	

