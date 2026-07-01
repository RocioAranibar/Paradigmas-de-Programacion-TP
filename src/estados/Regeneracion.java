package estados;

import personajes.Personaje;

public class Regeneracion implements EstadoTemporal {

    private int turnosRestantes;
    private int curacionPorTurno;

    public Regeneracion(int turnosRestantes, int curacionPorTurno) {
        this.turnosRestantes = turnosRestantes;
        this.curacionPorTurno = curacionPorTurno;
    }

    @Override
    public void aplicar(Personaje personaje) {
        personaje.curar(curacionPorTurno);
        turnosRestantes--;
    }

    @Override
    public boolean estaActivo() {
        return turnosRestantes > 0;
    }
}