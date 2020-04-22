package main.java.liceosorolla;

public class Carta {
	private Figura figura;
	private boolean x;
	
	

	
	public Carta(Figura figura) {
		this.figura=figura;
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
			switch(figura.ordinal()) {
			case 0:
				return "["+ figura+"]";
			case 10:
				return "["+ figura+"]";
			case 11:
				return "["+ figura+"]";
			case 12:
				return "["+ figura+"]";	
			default:
			return "["+ (figura.ordinal()+1)+"]";
			}
		}else{
			return "[X]";
		}
	}

	
	
}
