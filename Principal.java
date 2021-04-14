import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double coordenada1x, coordenada1y, coordenada2x, coordenada2y;
		
		System.out.println("Ingrese las coordenadas para una esquina del primer rectangulo");
		System.out.print("Coordenada X: "); coordenada1x = entrada.nextDouble();
		System.out.print("Coordenada Y: "); coordenada1y = entrada.nextDouble();
		
		System.out.println("Ingrese las coordenadas para la esquina opuesta del primer rectangulo");
		System.out.print("Coordenada X: "); coordenada2x = entrada.nextDouble();
		System.out.print("Coordenada Y: "); coordenada2y = entrada.nextDouble();
		Rectangulo A = new Rectangulo(new Coordenada(coordenada1x,coordenada1y),new Coordenada(coordenada2x,coordenada2y));
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("Ingrese las coordenadas para una esquina del segundo rectangulo");
		System.out.print("Coordenada X: "); coordenada1x = entrada.nextDouble();
		System.out.print("Coordenada Y: "); coordenada1y = entrada.nextDouble();
		
		System.out.println("Ingrese las coordenadas para la esquina opuesta del segundo rectangulo");
		System.out.print("Coordenada X: "); coordenada2x = entrada.nextDouble();
		System.out.print("Coordenada Y: "); coordenada2y = entrada.nextDouble();
		
		Rectangulo B = new Rectangulo(new Coordenada(coordenada1x,coordenada1y),new Coordenada(coordenada2x,coordenada2y));
		
		System.out.println(A);
		System.out.println(B);
		
		System.out.println(Verificador.esSobrePos(A, B));
		System.out.println(Verificador.esJunto(A, B));
		System.out.println(Verificador.esDisjunto(A, B));
		

	}
}
