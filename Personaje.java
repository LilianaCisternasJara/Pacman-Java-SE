package Padres;
/**
 * Clase padre Personajes
 * <pre>contiene los métodos que podrán ocupar sus clases hijas</pre>
 * <pre> Sus clases hijas son PPacman y PFantasma</pre>
 * @author lilianacisternasjara
 * @version 1.0
 *
 */
public class Personaje {
	
	/*
	 * Atributos de la clase Personaje
	 */
	
	private String nombre;
	private int alto;
	private int ancho;
	private String color;
	private int vidas;
	private boolean comer;
	private boolean comerPuntosG;//comer puntos grandes
	private boolean morir;
	private String posX;
	private String posY;
	private boolean salidaEntrada;//posición en salida o entrada
	
	/*
	 * Constructor de la clase Padre Personaje
	 */
	
	public Personaje(String nombre, int alto, int ancho, String color, int vidas, String posX, String posY) {
		this.nombre = nombre;
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.vidas = vidas;
		this.comer = false;//se inicializa en false, false quiere decir no ha comido aun
		this.comerPuntosG = false;//se inicializa en false, false quiere decir no ha comido puntos grandes aun
		this.morir = false;//se inicializa en false, es decir, no ha muerto, está vivo
		this.posX = posX;
		this.posY = posY;
		this.salidaEntrada = false;//Se iniciliaza en false, false quiere decir que está en la salida
	}
	
	/**
	 * Get y Set de la clase Personaje
	 * @return
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public boolean isComerPuntosG() {
		return comerPuntosG;
	}

	public void setComerPuntosG(boolean comerPuntosG) {
		this.comerPuntosG = comerPuntosG;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public boolean isComer() {
		return comer;
	}

	public void setComer(boolean comer) {
		this.comer = comer;
	}

	public boolean isMorir() {
		return morir;
	}

	public void setMorir(boolean morir) {
		this.morir = morir;
	}
	
	public String getPosX() {
		return posX;
	}

	public void setPosX(String posX) {
		this.posX = posX;
	}

	public String getPosY() {
		return posY;
	}

	public void setPosY(String posY) {
		this.posY = posY;
	}

	public boolean isSalidaEntrada() {
		return salidaEntrada;
	}

	public void setSalidaEntrada(boolean salidaEntrada) {
		this.salidaEntrada = salidaEntrada;
	}

	/**
	 * Método que es llamado cuando un personaje pierde vidas
	 */
	
	public void perderVidas() {
		System.out.println("Pacman ha perdido vidas");
	}
		/**
		 * Método que es llamado cuando un personaje come frutas 
		 */
	
	public void comerFrutas() {
		System.out.println("Ha comido frutas");
	}
	
	
	/**
	 * Método que es llamado cuando un personaje muere
	 */
	
	public void muere() {
		System.out.println("El personaje  ha muerto :(");
	}
	
	
	/**
	 * Los siguientes métodos son llamados cuando los personajes se mueven, hacia la izquierda, derecha, arriba o abajo
	 */
	public void moverseDerecha() {
		System.out.println("Se ha movido a la derecha");
	}
	public void moverseIzquierda() {
		System.out.println("Se ha movido a la izquierda");
	}
	public void moverseArriba() {
		System.out.println("Pacman se ha movido hacia arriba");
	}
	public void moverseAbajo() {
		System.out.println("Se ha movido hacia abajo");
	}

	
	/**
	 * Método que es llamado cuando los personajes comen puntos pequeños
	 */
	
	public void comerPuntosP() {
		System.out.println("Ha comido puntos");
	}
	
	/**
	 * Métodos que son llamados para cuando los personajes entran o salen del escenario
	 */
	
	public void entrar() {
		System.out.println("Ha entrado");
	}
	public void salir() {
		System.out.println("Ha salido");
	}
	
	
	

}
