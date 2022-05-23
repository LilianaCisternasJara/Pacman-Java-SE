/**
 * Clase que contiene el método main, y los diferentes objetos de las clases padres e hijas
 * <pre>Se llama a los diferentes métodos de la clase Padre Personaje para simular acciones de Pacman y Fantasmas </pre>
 * <pre>Se llama a los diferentes métodos de la clase Padre Escenario para simular acciones de las clase Entrada, Salida y CasaFantasma </pre>
 * <pre>Se llama a los diferetes métodos particulares de cada clase para realizar algunas simulaciones de acciones </pre>
 * @author lilianacisternasjara
 * @version 1.0
 */
public class AppPacman {

	public static void main(String[] args) {
		
		/**
		 * Creacion de diferentes objetos de las diferentes clases
		 */
		
		//Objeto de PPacman p1
		PPacman p1 = new PPacman ("Pacman", 2, 3, "amarillo", 3, "a la derecha", "Arriba", "PowerUp");
		
		//Objeto de PFantasma f1
		PFantasma f1 = new PFantasma("Fantasma", 2, 4, "rojo", 3, "A la izquierda", "abajo", 5);
		
		//Objeto de CasaFantasma cf
		CasaFantasmas cf = new CasaFantasmas(4, 2, "Negro", "redondeado", "azul", false);
		
		//Objeto de Entrada e
		Entrada e = new Entrada(2, 3, "Negro", "cuadrada", "azul", "a la izquierda");
		
		//Objeto de Salida s
		Salida s = new Salida(2, 3, "Negro", "cuadrada", "azul", "a la derecha");
		
		//Objeto de Puntos p
		Puntos p = new Puntos(1, 1, "blanco", "circular", "blanco", false);
		
		//Objeto de Puntos g
		Puntos g = new Puntos (2, 2, "blanco", "circular", "blanco", false);
		
		//Objeto de Bloques b
		Bloques b = new Bloques("L");
		
		/*
		 * Pruebas de llamar a diferentes métodos y que se muestren por consola
		 */
		p1.comerFantasmas();
		System.out.print("Pacman "); p1.muere();
		p1.tomarPoder();
		System.out.print("Pacman "); p1.moverseDerecha();
		
		System.out.print("Fantasma "); f1.comerFrutas();
		
		cf.cambiarColor();
		e.cambiarColor();
		e.ubicacionEntradaDerecha();
		s.ubicacionSalidaDerecha();
		g.cambiarColor();
		
		b.formaBloqueL();
		b.formaBloqueT();
		
		s.cambiarColor();
		f1.moverseArriba();
	
	}
	

}
