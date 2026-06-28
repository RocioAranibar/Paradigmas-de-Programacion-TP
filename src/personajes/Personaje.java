package personajes;
import hechizo.Hechizo;
import java.util.*;

public abstract class Personaje {
	private String nombre;
	private int puntosVida;
	private int puntosVidaMax;
	private int nivelMagia;
	private List<Hechizo> hechizos;
	
	public Personaje(String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVida;
		this.hechizos = hechizos;
	}
}
