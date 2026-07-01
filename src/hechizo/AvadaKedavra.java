package hechizo;

import personajes.Personaje;

public class AvadaKedavra implements Hechizo {

    @Override
    public void ejecutar(Personaje atacante, Personaje objetivo) {
        objetivo.recibirDanio(50);
    }
}
