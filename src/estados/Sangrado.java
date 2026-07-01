package estados;

import personajes.Personaje;

public class Sangrado implements EstadoTemporal {

    private int turnosRestantes;
    private int danioPorTurno;

    public Sangrado(int turnosRestantes, int danioPorTurno) {
        this.turnosRestantes = turnosRestantes;
        this.danioPorTurno = danioPorTurno;
    }

    @Override
    public void aplicar(Personaje personaje) {
        personaje.recibirDanio(danioPorTurno);
        turnosRestantes--;
    }

    @Override
    public boolean estaActivo() {
        return turnosRestantes > 0;
    }

}