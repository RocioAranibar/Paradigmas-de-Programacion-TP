package personajes;
import hechizo.Hechizo;
import java.util.*;

public class Mago extends Personaje{
	public Mago(String nombre, int puntosVida, int NivelMagia, List<Hechizo> hechizos) {
		super(nombre,puntosVida,NivelMagia,hechizos);
	}
	@Override
		public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
			if(getHechizos().contains(hechizo)) { //Validamos que el hechizo que se quiere lanzar, lo tenga el personaje.
				hechizo.ejecutar(this,objetivo);
			}else {
				throw new IllegalStateException("El mago no tiene el hechizo indicado.");
			}	
	}
	@Override
	public int modificarCuracion(int curacionBase) {
	    return curacionBase + getNivelMagia() * 0.5;
	}
}
