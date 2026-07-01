package hechizo;

import personajes.Personaje;

public class Protego implements Hechizo {

    @Override
    public void ejecutar(Personaje atacante, Personaje objetivo) {
        atacante.curar(15);
    }
}
