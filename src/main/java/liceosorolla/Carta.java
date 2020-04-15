package main.java.liceosorolla;

public class Carta {
	private int numero;
	private Figura figura;
	
	
	public Carta(int numero) {
		this.numero=numero;
	}
	
	public Carta(Figura figura) {
		this.figura=figura;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Figura getFigura() {
		return figura;
	}
	public void setFigura(Figura figura) {
		this.figura = figura;
	}
	
	public String toString() {
		if(numero==0) {
			return "["+ figura+"]";
		}else {
			return "[" + numero+"]";
		}
	}
	
}
