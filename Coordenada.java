

public class Coordenada {
	//Argumentos
	private double x;
	private double y;
	//Constructores
	public Coordenada() {
		this.x = 0;
		this.y = 0;
	}
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Coordenada(Coordenada c) {
		this.x = c.x;
		this.y = c.y;
	}
	//Setters and Getters
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//Metodo de objeto
	public double distancia(Coordenada c) {
		double dis = Math.sqrt( Math.pow( c.x-this.x, 2 ) + Math.pow( c.y-this.y, 2));
		return dis;
	}
	//Metodo de clase
	public static double distancia(Coordenada c1, Coordenada c2) {
		double dis = Math.sqrt( Math.pow( c2.x-c1.x, 2 ) + Math.pow( c2.y-c1.y, 2));
		return dis;
	}
	public  boolean esMayor(Coordenada c) {
		if(this.getX() > c.getX() && this.getY() > c.getY()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean esMayorX(Coordenada c) {
		if(this.getX() > c.getX()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean esMayorY(Coordenada c) {
		if(this.getY() > c.getY()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean equals(Coordenada coord) {
		if(!(coord instanceof Coordenada))
			return false;
		Coordenada c = (Coordenada) coord;
		return this.x == c.x || this.y == c.y ;
	}
	
	//Mostrando coordenadas
	@Override
	public String toString() {
		return "(" + this.x + ", " + y + ")";
	}
	
}
