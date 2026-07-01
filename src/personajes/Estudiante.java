package personajes;
import java.util.*;
import hechizo.Hechizo;

public class Estudiante extends Mago{
	public Estudiante(String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
		super(nombre, puntosVida, nivelMagia, hechizos);
	}
}
