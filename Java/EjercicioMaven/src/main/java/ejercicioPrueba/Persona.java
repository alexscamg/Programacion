package ejercicioPrueba;

public class Persona {
	
	private String nombre;
	private char sexo;
	private int edad;
	private String DNI;
	private int peso;
	private int altura;
	
	private final static char SEXO = 'H';
	
	public Persona() {
		nombre="";
		sexo = SEXO;
		edad = 0;
		peso= 0;
		altura = 0;
	}
	
	public Persona(String nombre, char sexo, int edad){
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		peso= 0;
		altura = 0;
	}
	
	public Persona(String nombre, char sexo, int edad, int peso, int altura){
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
        generaDNI();
		this.peso = peso;;
		this.altura = altura;
	}
	
	/* Calculara si la persona esta en su peso ideal */          
	public int CalcularIMC() throws ExceptionIMC{
		
		int imc = 0;
		
		if (peso>5 && altura > 40) {
			int calculo = (int) (peso/(altura*altura));
			if(calculo < 20) {
				return -1;
			}else if (calculo >=20 && calculo <= 25) {
				return 0; 
			}else if (calculo >25) {
				return 1;
			}else {
				throw new ExceptionIMC("Problema en el calculo");
			}
		}else {
			throw new ExceptionIMC("Problema en el calculo");
		}
		
		
	}

	// Indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad() throws ExceptionEdad {
    	
    	if (edad<=0) {
    		throw new ExceptionEdad("Problema en la edad");
    	}
    	else {
    		if(edad>18);
  		  return true;
    	}
		
	}
    
    // Comprueba que el sexo introducido es correcto. Si no es correcto, sera H. 
    private void comprobarSexo() {
		if (sexo!='H'&& sexo != 'M'){
			sexo = 'H';	
		}
	}
    
    //  Devuelve toda la información del objeto.
    public String toString() {
    	String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona: "  + "Nombre: " + nombre  + " Sexo: " + 
        sexo + " Edad: " + edad + " años" + " DNI: " + DNI  + " Peso: " + peso + " kg" + " Altura: " + altura + " metros";
    }
    
    // Denera un DNI aleatorio
	private void generaDNI() {
		
		final int divisor = 23;

        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);
 
        DNI = Integer.toString(numDNI) + letraDNI;
		
	}
	// Genera una Letra aleatoria para el DNI
	private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
    
    // Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	// public static String generaDNIExt(String dni) {
		
	// }
	
	
	
	
	
	
	
	public static void main(String[] args) {
    
		// Generamos un objeto
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Alex", 'H', 20);
		Persona persona3 = new Persona("Ana", 'M', 20, 50, 160);
		
		System.out.println(persona3.toString());
		try {
			System.out.println(persona3.CalcularIMC());
		} catch (ExceptionIMC e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(persona2.toString());
		try {
			System.out.println(persona2.CalcularIMC());
		} catch (ExceptionIMC e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
