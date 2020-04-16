package main.java.liceosorolla;

public class Carta {
	private int numero;
	private Figura figura;
	private boolean x;
	
	
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
	
	public boolean isX() {
		return x;
	}
	public void setX(boolean x) {
		this.x = x;
	}
	
	public String toString() {
		if(x) {
			if(numero==0) {
				return "["+ figura+"]";
			}else {
				return "[" + numero+"]";
			}
		}else{
			return "[X]";
		}
	}

	
	
}
