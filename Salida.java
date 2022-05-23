/**
 * Clase hija Salida, que extiende la clase Escenario
 * @author lilianacisternasjara
 *
 */
public class Salida extends Escenario{
	
	/*
	 * Atributo de la clase Salida
	 */
	
	private String ubicacion;//ubicación se refiere a la izquierda o derecha del escenario
	
	/*
	 * Constructor de la clase Escenario
	 */

	public Salida(int ancho, int alto, String color, String formaContorno, String colorContorno, String ubicacion) {
		super(ancho, alto, color, formaContorno, colorContorno);
		this.ubicacion = ubicacion;
	}
	
	/*
	 * Get y Set de la clase Escenario
	 */

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	

}
