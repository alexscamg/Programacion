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


public class LeerPorTeclado   {
	
	// Creo el objeto de la Clase escaner para 
	Scanner entrada = new Scanner(System.in);
	
	private String caracter;
	private char c = ' ';
	
	public char getChar() {
		
		
		System.out.println("Introduce un caracter");
		
		// Paso el caracter introducido a minusculas conforme lo introduce
		caracter = entrada.nextLine();
		
		if (caracter.length() == 0 ) {
			return c = 'f';
		}else {
			return c =  caracter.charAt(0);
		}
	}
	
	
	
	
	public void procesaCaracter(char c) throws ExcepcionVocal, ExcepcionBlanco, ExcepcionNumero, ExcepcionSalida {
		if (c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u' ) {
			throw new ExcepcionVocal("Has introducido una vocal");
			
		}else if(Character.isWhitespace(c)){ 
			throw new ExcepcionBlanco("Has introducido un espacio en blanco");
			
		}else if(Character.isDigit(c)){
			throw new ExcepcionNumero("Has introducido un numero");
			
		}else if(c == 'x'){
			throw new ExcepcionSalida("Has introducido el caracter de salida");
			
		}else{
			System.out.println("Has introducido algun caracter no reconocido");
			
		}
		
		
	}




	
	

}
