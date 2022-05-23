/**
 * Clase hija CasaFantasmas, que extiende la clase Escenario
 * @author lilianacisternasjara
 *
 */
public class CasaFantasmas extends Escenario{
	
	/*
	 * Atributo de la clase CasaFantasmas
	 */
	
	private boolean puerta;//(puerta abierta true, puerta cerrada false)
	
	/*
	 * Constructor de la clase CasaFantasmas
	 */

	public CasaFantasmas(int ancho, int alto, String color, String formaContorno, String colorContorno,
			boolean puerta) {
		super(ancho, alto, color, formaContorno, colorContorno);
		this.puerta = puerta;
	}
	
	/*
	 * Get y Set de la clase CasaFantasmas
	 */

	public boolean isPuerta() {
		return puerta;
	}

	public void setPuerta(boolean puerta) {
		this.puerta = true;
	}
	
	

}
