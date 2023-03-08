package testLeerTeclado;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
/**
 * 
 * @author alexsc.dev
 * @version 1.0
 * 
 */

import ejercicioLeerTeclado.ExcepcionBlanco;
import ejercicioLeerTeclado.ExcepcionNumero;
import ejercicioLeerTeclado.ExcepcionSalida;
import ejercicioLeerTeclado.ExcepcionVocal;
import ejercicioLeerTeclado.LeerPorTeclado;

public class TestLeerTeclado {

  
  
  
    @Test
	  public void testExcepcion() {
    	LeerPorTeclado t2 = new LeerPorTeclado();
    	   
    			  
    			try {
    				t2.procesaCaracter('a');
    				
    			} catch (ExcepcionVocal e) {
    				// TODO Auto-generated catch block
    				assertTrue(e.getMessage().contains("Excepcion de vocal"));
    			} catch (ExcepcionBlanco e) {
    				// TODO Auto-generated catch block
    				assertTrue(false);
    			} catch (ExcepcionNumero e) {
    				// TODO Auto-generated catch block
    				assertTrue(false);
    			} catch (ExcepcionSalida e) {
    				// TODO Auto-generated catch block
    				assertTrue(false);
    			}
    		  
	  }


}
