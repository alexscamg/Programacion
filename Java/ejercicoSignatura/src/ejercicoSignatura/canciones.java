package ejercicoSignatura;

public class canciones {

	public static void main(String[] args) {
		DiscoMusical Discoalejandro = new DiscoMusical(" DiscoPrueba", "Alejandro", 2022, "MP3", true);
		
		Discoalejandro.getAutor();
		
		System.out.println("El autor es: " + Discoalejandro.getAutor());
		

	}

}
