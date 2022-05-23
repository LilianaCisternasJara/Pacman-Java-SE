/**
 * Clase hija Puntos, que extiende la clase Escenario
 * @author lilianacisternasjara
 *
 */
public class Puntos extends Escenario{
	private boolean tamanio;//Atributo de la clase Escenario
	
	/*
	 * Constructor de la clase Puntos
	 */

	public Puntos(int ancho, int alto, String color, String formaContorno, String colorContorno, boolean tamanio) {
		super(ancho, alto, color, formaContorno, colorContorno);
		this.tamanio = true;
	}

	/*
	 * Get y Set de la clase Puntos
	 */
	
	public boolean isTamanio() {
		return tamanio;
	}

	public void setTamanio(boolean tamanio) {
		this.tamanio = tamanio;
	}

	
	

}
