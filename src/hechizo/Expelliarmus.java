package hechizo;

import personajes.Personaje;

public class Expelliarmus implements Hechizo {

    @Override
    public void ejecutar(Personaje atacante, Personaje objetivo) {
        // EL DAÑO DEPENDE DEL TIPO DE PERSONAJE QUE LANZA EL HECHIZO
        int danio = atacante.modificarDanio(20);
        objetivo.recibirDanio(danio);
    }
}
