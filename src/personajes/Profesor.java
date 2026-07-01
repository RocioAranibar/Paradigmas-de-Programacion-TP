package personajes;
import java.util.*;
import hechizo.Hechizo;

public class Profesor extends Mago{
	public Profesor(String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
		super(nombre, puntosVida, nivelMagia, hechizos);
	}
}
