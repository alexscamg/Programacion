package pruebaUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import libreria1.Calculadora;

public class TestUnit {
	
	@Test
	public void testSingleSucessTest() {
		Calculadora c1=new Calculadora();
		assertEquals(2, c1.suma(1, 1));
		
		
	}
	
	@Test
	public void testSingleSucessTest2() {
		System.out.println("un test");
		
	}

}
