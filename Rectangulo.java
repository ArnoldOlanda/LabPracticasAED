
public class Rectangulo {
	//Atributos
	Coordenada esquina1;
	Coordenada esquina2;
	//Constructor
	public Rectangulo(Coordenada c1, Coordenada c2) {
		setEsquina1(c1);
		setEsquina2(c2);
	}
	//Getters and Setters
	public Coordenada getEsquina1() {
		return this.esquina1;
	}

	public void setEsquina1(Coordenada esquina1) {
		this.esquina1 = esquina1;
	}

	public Coordenada getEsquina2() {
		return this.esquina2;
	}

	public void setEsquina2(Coordenada esquina2) {
		this.esquina2 = esquina2;
	}
	//Metodo to String

	@Override
	public String toString() {
		return "[" + esquina1 + ", " + esquina2 + "]";
	}
	
	
}
