
public class Verificador {
	
	public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
		
		if (r2.esquina1.esMayor(r1.esquina1) && !r2.esquina1.esMayor(r1.esquina2)) {
			return true;
		}else if(!r2.esquina1.esMayorY(r1.esquina1) && r2.esquina2.esMayorY(r1.esquina2)){
			return true;
		}else if(r2.esquina1.esMayor(r1.esquina1) && !r2.esquina1.esMayor(r1.esquina2)) {
			return true;
		}else if(r2.esquina1.esMayor(r1.esquina1) && !r2.esquina2.esMayor(r1.esquina2)) {
			return true;
		}
		return false;
	}
	
	public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
		if(r1.esquina2.equals(r2.esquina1)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
		if(r2.esquina1.esMayorX(r1.esquina2)) {
			return true;
		}else if(r2.esquina1.esMayor(r1.esquina2)) {
			return true;
		}else if(r2.esquina1.esMayorY(r1.esquina2)) {
			return true;
		}
		return false;
	}
}
