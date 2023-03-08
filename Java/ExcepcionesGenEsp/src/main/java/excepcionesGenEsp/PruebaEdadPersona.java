package excepcionesGenEsp;

public class PruebaEdadPersona {
	
	
	public void generaExcepcionEdad(int edad) throws InfantilException, AdultoException, MayorException{
		if (edad < 18) {
			throw new InfantilException("Es infantil, menor de 18 años");
		}else if (edad >= 18 && edad < 65) {
			throw new AdultoException("Es mayor de edad, mayor de 18 y menor de 65");
		}else if(edad>=65) {
			throw new MayorException("Es mayor de 65");
		}
	}
	
	
	public static void main (String [] args) {
		
	}

}
