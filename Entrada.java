/**
 * Clase hija Entrada, que extiende la clase Escenario
 * @author lilianacisternasjara
 *
 */
public class Entrada extends Escenario{
	
	/*
	 * Atributo de la clase Entrada
	 */
	
	private String ubicacion;//ubicación se refiere a derecha o izquierda del escenario

	/*
	 * Constructor de la clase Entrada
	 */
	
	public Entrada(int ancho, int alto, String color, String formaContorno, String colorContorno, String ubicacion) {
		super(ancho, alto, color, formaContorno, colorContorno);
		this.ubicacion = ubicacion;
	}

	/*
	 * Get y Set de la clase Entrada
	 */
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}
