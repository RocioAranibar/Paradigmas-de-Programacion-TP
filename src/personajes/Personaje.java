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
	public abstract void lanzarHechizo(Hechizo hechizo, Personaje objetivo);
	public String getNombre() {
		return nombre;
	}
	public List<Hechizo> getHechizos(){
		return hechizos;
	}
	public int getNivelMagia() {
		return nivelMagia;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public void recibirDanio(int danio) {
		puntosVida -= danio;
		if(puntosVida < 0) {
			puntosVida = 0;
		}
	}
	public void curar (int vida) {
		puntosVida += vida;
		if(puntosVida > puntosVidaMax) {
			puntosVida = puntosVidaMax;
		}
	}
	public boolean estaVivo() {
		return puntosVida > 0;
	}
	public void agregarHechizo(Hechizo hechizo) {
		hechizos.add(hechizo);
	}
	public int modificarDanio(int danioBase) {
	    return danioBase;
	}

	public int modificarCuracion(int curacionBase) {
	    return curacionBase;
	}
}
