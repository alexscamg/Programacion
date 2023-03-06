package ejercicioLeerTeclado;

import java.util.Scanner;

import ejercicioLeerTeclado.ExcepcionBlanco;
import ejercicioLeerTeclado.ExcepcionNumero;
import ejercicioLeerTeclado.ExcepcionSalida;
import ejercicioLeerTeclado.ExcepcionVocal;

/**
 * 
 * @author alexsc.dev
 * @version 1.0
 * 
 */


public class LeerPorTeclado {
	
	// Creo el objeto de la Clase escaner para 
	Scanner entrada = new Scanner(System.in);
	
	char caracter;
	
	public LeerPorTeclado() {
		System.out.println("Introduce un caracter");
		
		// Paso el caracter introducido a minusculas conforme lo introduce
		caracter = Character.toLowerCase(entrada.nextLine().charAt(0));
	}
	
	
	
	
	public void procesaCaracter() throws ExcepcionVocal, ExcepcionBlanco, ExcepcionNumero, ExcepcionSalida {
		if (caracter == 'a' || caracter == 'e' || caracter == 'i'|| caracter == 'o' || caracter == 'u' ) {
			throw new ExcepcionVocal("Has introducido una vocal");
			
		}else if(Character.isWhitespace(caracter)){
			throw new ExcepcionBlanco("Has introducido un espacio en blanco");
			
		}else if(Character.isDigit(caracter)){
			throw new ExcepcionNumero("Has introducido un numero");
			
		}else if(caracter == 'x'){
			throw new ExcepcionSalida("Has introducido el caracter de salida");
			
		}else{
			System.out.println("Has introducido algun caracter no reconocido");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
