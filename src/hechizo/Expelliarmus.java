package hechizo;

import personajes.Personaje;

public class Expelliarmus implements Hechizo {

    @Override
    public void ejecutar(Personaje atacante, Personaje objetivo) {
        objetivo.recibirDanio(20);
    }
}
