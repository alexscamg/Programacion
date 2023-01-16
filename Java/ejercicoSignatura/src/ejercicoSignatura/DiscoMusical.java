package ejercicoSignatura;

public class DiscoMusical {

	//Atributos
	private String titulo;
	private String autor;
	private int añoEdicion;
	private String formato;
	private boolean digital;
	
	//Constructor
	public DiscoMusical(String titulo, String autor, int añoEdicion, String formato, boolean digital) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.añoEdicion = añoEdicion;
		this.formato = formato;
		this.digital = digital;
	}

	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoEdicion() {
		return añoEdicion;
	}

	public void setAñoEdicion(int añoEdicion) {
		this.añoEdicion = añoEdicion;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	
	// Get Inventado
	public float getDuracionCancion(int cancionselected) {
		return cancionselected;
		
	}
	
	
	
	
	
	
	
	

}