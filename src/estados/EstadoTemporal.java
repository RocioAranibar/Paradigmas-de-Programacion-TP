package estados;
import personajes.Personaje;

public interface EstadoTemporal {

    void aplicar(Personaje personaje);

    boolean estaActivo();
}