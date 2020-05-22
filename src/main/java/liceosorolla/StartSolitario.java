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
				if(	bucleRespuesta("¿Desea sacar nuevas cartas del mazo?").equals("si")) {
					for(int j = 0; j < 10 ;j++) {
						primerasCartas.add(baraja.sacarCarta());
					}
					tablero.pasar(primerasCartas,10);
					continue;
				}
			}
			System.out.println("¿Qué columna desea mover?");
			columna = comprobarMoverCarta()-1;
			System.out.println("¿A qué columna desea mover?");
			columna1 = comprobarMoverCarta()-1;
			System.out.println("¿Cuántas cartas?");
			cantidad = comprobarMoverMaximaCantidad(tablero);
			tablero.mover(columna, columna1,cantidad);
		}while(acabar);
	}	
	
	
	public static int comprobarMoverCarta() {
		boolean corregir;
		int numero = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			corregir = teclado.hasNextInt();
				if(corregir){
					numero = teclado.nextInt();
					if(numero > 10 || numero < 1) {
						corregir = false;
						System.out.println("Introduce un numero entre 1 y 10");
					}
				}else{
						System.out.println("Introduce un numero");
				}
		}while(!corregir); 
		return numero;
	}
	
	public static int comprobarMoverMaximaCantidad(Tablero tablero) {
		boolean corregir;
		int numero = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			corregir = teclado.hasNextInt();
				if(corregir){
					numero = teclado.nextInt();
					if(numero > tablero.maximo()) {
						corregir = false;
					}
				}else{
						System.out.println("Introduce un numero");
				}
		}while(!corregir); 
		return numero;
	}
	
	
	public static String bucleRespuesta(String correcto) {
		Scanner scanner = new Scanner(System.in);
		String letra;
		boolean sino = true;
		boolean bucle = true;
		do {
			System.out.println(correcto);
			letra = scanner.next();
				if(letra.equalsIgnoreCase("si") || letra.equalsIgnoreCase("no")){
					sino = false;
					if(letra.equalsIgnoreCase("si")) {
						bucle = false;
					}
				}
		}while(sino);
		return letra; 
	}	
	
	
}

	
	


	
	

