package testExcepciones;




import org.junit.Test;

import excepcionesGenEsp.AdultoException;
import excepcionesGenEsp.InfantilException;
import excepcionesGenEsp.MayorException;
import excepcionesGenEsp.PruebaEdadPersona;


public class TestExcepcion {
	int[]  miArray = new int[100];
	
	PruebaEdadPersona p1 = new PruebaEdadPersona();

		  
	
	@Test
	public void testExcepciones() {
		for (int i = 0; i < miArray.length; i++) {
	    	
		      miArray[i] = (int) (Math.random()*100 + 1); 
		    }
	
		for (int i = 0; i < miArray.length+0; i++) {
			
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
	public void testExcepciones2() {
		for (int i = 0; i < miArray.length; i++) {
	    	
		      miArray[i] = (int) (Math.random()*100 + 1);
		    }
	
		for (int i = 0; i < miArray.length+0; i++) {
			
		    		  try {
						p1.generaExcepcionEdad(miArray[i]);
					} catch (Exception e) {
						System.out.println("Una excepcion ha sido capturada");
					} 
		}
		}
		
	}
	
	

