package personajes;
import java.util.*;
import hechizo.Hechizo;

public class Comandante extends Mortifago {
	public Comandante(String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
		super(nombre, puntosVida, nivelMagia, hechizos);
	}
}
