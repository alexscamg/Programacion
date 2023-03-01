package testMaven;


import org.junit.Test;

import ejercicioPrueba.Persona;

public class TestJavaUnit {

	Persona persona3 = new Persona("Ana", 'M', 20, 50.00, 1.60);
	@Test
    void testNotEquals() {
		
		System.out.println(persona3.toString());
		
    }
	

}
