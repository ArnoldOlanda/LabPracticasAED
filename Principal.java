
public class Principal {

	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(5,9);
		Coordenada c2 = new Coordenada(2,8);
		
		Rectangulo r1 = new Rectangulo(c1, c2);
		Rectangulo r2 = new Rectangulo(new Coordenada(20,4),new Coordenada(1,3));
		
		System.out.println("Rectangulo A: " + r1);
		System.out.println("------------------------------------");
		System.out.println("Rectangulo B: " + r2);
		

	}

}
