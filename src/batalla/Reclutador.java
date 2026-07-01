package batalla;

import personajes.Mago;
import personajes.Auror;
import personajes.Estudiante;
import personajes.Profesor;
import personajes.Seguidor;
import personajes.Comandante;


public class Reclutador {
    public Mago crearMago(String tipo, String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
    	switch (tipo.toLowerCase()) {

        case "auror":
            return new Auror(nombre, puntosVida, nivelMagia, hechizos);

        case "profesor":
            return new Profesor(nombre, puntosVida, nivelMagia, hechizos);

        case "estudiante":
            return new Estudiante(nombre, puntosVida, nivelMagia, hechizos);

        default:
            throw new IllegalArgumentException("Tipo de mago inválido.");
    	}
    }
    public Mortifago crearMago(String tipo, String nombre, int puntosVida, int nivelMagia, List<Hechizo> hechizos) {
    	switch (tipo.toLowerCase()) {

        case "seguidor":
            return new Seguidor(nombre, puntosVida, nivelMagia, hechizos);

        case "comandante":
            return new Comandante(nombre, puntosVida, nivelMagia, hechizos);

        default:
            throw new IllegalArgumentException("Tipo de mago inválido.");
    	}
    }
}
