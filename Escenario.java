package Padres;
/**
 * Clase Padre Escenario
 * <pre>contiene los métodos que podrán ocupar sus clases hijas</pre>
 * <pre> Sus clases hijas son Entrada, Salida y Casa Fantasma</pre>
 * @author lilianacisternasjara
 *
 */
public class Escenario {
	
	/*
	 * Atributos de la clase Escenario
	 */

	private int ancho;
	private int alto;
	private String color;
	private String formaContorno;//se refiere a si es circular o cuadrada
	private String colorContorno;
	
	/*
	 * Constructor de la clase PFantasma
	 */
	
	public Escenario(int ancho, int alto, String color, String formaContorno, String colorContorno) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
		this.formaContorno = formaContorno;
		this.colorContorno = colorContorno;
	}
	
	/*
	 * Get y Set de la clase PFantasma
	 */
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFormaContorno() {
		return formaContorno;
	}
	public void setFormaContorno(String formaContorno) {
		this.formaContorno = formaContorno;
	}
	public String getColorContorno() {
		return colorContorno;
	}
	public void setColorContorno(String colorContorno) {
		this.colorContorno = colorContorno;
	}
	
	/*
	 * Método que es llamado cuando se cambia de color
	 */
	
	public void cambiarColor() {
		System.out.println("El escenario ha cambiado de color");
	}
	
	/*
	 * Métodos que son llamados para la ubicación de las entradas y las salidas
	 */
	
	public void ubicacionEntradaIzquierda() {
		System.out.println("La entrada está a la izquierda");	
	}
	
	public void ubicacionEntradaDerecha() {
		System.out.println("La entrada está a la derecha");	
	}
	public void ubicacionSalidaIzquierda() {
		System.out.println("La salida está a la izquierda");	
	}
	
	public void ubicacionSalidaDerecha() {
		System.out.println("La salida está a la derecha");	
	}
	

	
	
	
	
	
	
	
	
	
	
	}
	
