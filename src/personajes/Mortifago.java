package personajes;
import hechizo.Hechizo;
import java.util.List;

public class Mortifago extends Personaje{
	public Mortifago(String nombre, int puntosVida, int NivelMagia, List<Hechizo> hechizos) {
		super(nombre,puntosVida,NivelMagia,hechizos);
	}
	@Override
		public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
			if(getHechizos().contains(hechizo)) { //Validamos que el hechizo que se quiere lanzar, lo tenga el personaje.
				hechizo.ejecutar(this,objetivo);
			}else {
				throw new IllegalStateException("El Mortifago no tiene el hechizo indicado.");
			}	
	}
	//LOS MORTIFAGOS SON MAS LETALES CON LOS HECHIZOS DE ATAQUE
	@Override
	public int modificarDanio(int danioBase) {
	    return danioBase + getNivelMagia() * 0.2;
	}
}
