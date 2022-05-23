/**
 * Clase Bloques
 * @author lilianacisternasjara
 *
 */
public class Bloques {
	private String forma;//Atributo de la clase Bloques

	/*
	 * Constructor de la clase Bloques
	 */
	
	public Bloques(String forma) {
		super();
		this.forma = forma;
	}

	/*
	 * Get y Set de la clase Bloques
	 */
	
	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public void formaBloqueL() {//Método que muestra la forma del bloque en L
		System.out.println("La forma del bloque es en L");
	}
	public void formaBloqueT() {//Método que muestra la forma del bloque en T
		System.out.println("La forma del bloque es en T");
	}
	

}
