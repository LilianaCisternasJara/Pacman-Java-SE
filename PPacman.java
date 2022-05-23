/**
 * Clase hija PPacman, que extiende de la clase Personaje
 * @author lilianacisternasjara
 *
 */
public class PPacman extends Personaje{
	
	private String poder;//Atributo de la clase PPacman
	
	/*
	 * Constructor de la clase PPacman
	 */
	
	public PPacman(String nombre, int alto, int ancho, String color, int vidas, String posX, String posY,
			String poder) {
		super(nombre, alto, ancho, color, vidas, posX, posY);
		this.poder = poder;
	}
	
	/*
	 * Get y Set de la clase PPacman
	 */

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	/**
	 * Métodos propios de la clase PPacman
	 */
	
	public void comerFantasmas() {//Método que es llamado cuando Pacman come a un fantasma
		System.out.println("Pacman se ha comido a un fantasma");
	}
	 public void tomarPoder() {//Método que es llamado cuando Pacman adquiere un poder
		 System.out.println("Pacman tiene un super poder ahora");
	 }
	 public void comerPuntosG() {//Método que es llamado cuando Pacman come un punto grande
			System.out.println("Ha comido un punto grande, le ha dado powerUp");
		}
}
