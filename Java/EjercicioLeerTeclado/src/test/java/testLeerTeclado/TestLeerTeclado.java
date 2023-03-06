package testLeerTeclado;

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
	public void testSingleSuccessTest() {
    
	  while (true) {
		  LeerPorTeclado t1 = new LeerPorTeclado();
		  
		  try {
			t1.procesaCaracter();
		} catch (ExcepcionVocal e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ExcepcionBlanco e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		} catch (ExcepcionNumero e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ExcepcionSalida e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			break;
		}
	  }
    
  }
  







}
