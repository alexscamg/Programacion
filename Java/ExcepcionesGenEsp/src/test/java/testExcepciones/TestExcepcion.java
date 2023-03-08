package testExcepciones;


import java.util.Random;

import org.junit.Test;

import excepcionesGenEsp.AdultoException;
import excepcionesGenEsp.InfantilException;
import excepcionesGenEsp.MayorException;
import excepcionesGenEsp.PruebaEdadPersona;



public class TestExcepcion {
	Random random = new Random();
	
	private int[] miArray;
	PruebaEdadPersona p1 = new PruebaEdadPersona();
	

	public void procesaNumero(int edad) {
			
		      try {
		    	  p1.generaExcepcionEdad(edad);
				} catch (InfantilException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (AdultoException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (MayorException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
		      }
	public int generaNumero() {
		miArray = new int[100];

	    for (int i = 0; i < miArray.length; i++) {
	    	
	      miArray[i] = random.nextInt(101); // genera un número aleatorio entre 0 y 100 (ambos incluidos)
	    }
	    
	    for (int i = 0; i < miArray.length; i++) {
	    	return miArray[i];
	    }
		return 0;
	}
		    
	
	@Test
	public void testException() {
		

		
	}
	
	
	@Test
	public void testException2() {
		
		for (int i = 0; i < miArray.length; i++) {
	    	
		      miArray[i] = (int) (Math.random() * 100) + 1;
		      
		      System.out.println(miArray[i]);
		    }
		
		for (int i = 1; i < miArray.length+1; i++) {
			
		      
		    	  try {
		    	 p1.generaExcepcionEdad(miArray[i]);
				} catch (InfantilException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (AdultoException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (MayorException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
		      }
		    }
	
	
	
	
	
	@Test
	public void testException3() {
		PruebaEdadPersona p1 = new PruebaEdadPersona();
		
		try {
			p1.generaExcepcionEdad(13);
		} catch (InfantilException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (AdultoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (MayorException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
