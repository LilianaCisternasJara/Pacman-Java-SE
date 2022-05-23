/**
 * Clase hija PFantasma, que extiende de la clase Personaje
 * @author lilianacisternasjara
 *
 */
public class PFantasma extends Personaje {
	private int velocidad;//Atributo de la clase PFantasma
	
	/*
	 * Constructor de la clase PFantasma
	 */
	
	public PFantasma(String nombre, int alto, int ancho, String color, int vidas, String posX, String posY,
			int velocidad) {
		super(nombre, alto, ancho, color, vidas, posX, posY);
		this.velocidad = velocidad;
	}
	
	/*
	 * Get y Set de la clase PFantasma
	 */
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Métodos propios de la clase PFantasma
	 */

	
	
	public void salirCasaFantasma() {//Método que es llamado cuando un fantasma sale de la casa
		System.out.println("Un fantasma ha salido de su casa");
	}

	@Override
	public void moverseArriba() {
		System.out.println("El fantasma se movió hacia arriba");
	}

	public void entrarCasaFantasma() {//Método que es llamado cuando un fantasma entra a la casa
		System.out.println("Un fantasma ha entrado a su casa");
	}
	
	public void comerPacman() {//Método que es llamado cuando un Fantasma se come a Pacman
		System.out.println("Un fantasma se ha comido a Pacman");
	}
	
}
