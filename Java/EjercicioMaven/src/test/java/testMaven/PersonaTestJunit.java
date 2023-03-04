package testMaven;


import org.junit.Test;

import ejercicioPrueba.ExceptionEdad;
import ejercicioPrueba.ExceptionIMC;
import ejercicioPrueba.Persona;

public class PersonaTestJunit {

	Persona persona3 = new Persona("Ana", 'M', 0, 50, 160);
	Persona persona4 = new Persona("Alex", 'H', 20, 10, 0);
	
	@Test
     public void testNotEquals() {
		
		System.out.println(persona3.toString());
		
    }
	
	@Test
    public void testSingleSuccessTest() {
		Persona persona2 = new Persona("Alex", 'H', 20);
		System.out.println(persona2.toString());
		
    }
	
	@Test
	public void testIMC() {
		try {
			persona4.CalcularIMC();
		} catch (ExceptionIMC e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
	}
	
	@Test
	public void testEdad() {
			try {
				persona3.esMayorDeEdad();
			} catch (ExceptionEdad e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		
	}
	

}
