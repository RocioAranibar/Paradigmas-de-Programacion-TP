package batalla;

import hechizo.CrearHechizo;
import java.util.Random;

public class Reclutador {

    private static final Random rand = new Random();
    private static int contadorMagos = 1;
    private static int contadorMortifagos = 1;

    public static Personaje crearMago() {
        int tipo = rand.nextInt(3); 
        Personaje mago;

        switch (tipo) {
            case 0:
                mago = new Auror("Auror " + contadorMagos++, 80, 100);
                mago.agregarHechizo(CrearHechizo.porNombre("Expelliarmus"));
                mago.agregarHechizo(CrearHechizo.porNombre("Protego"));
                break;
            case 1:
                mago = new Profesor("Profesor " + contadorMagos++, 95, 120);
                mago.agregarHechizo(CrearHechizo.porNombre("Expecto Patronum"));
                mago.agregarHechizo(CrearHechizo.porNombre("Protego"));
                break;
            default:
                mago = new Estudiante("Estudiante " + contadorMagos++, 50, 80);
                mago.agregarHechizo(CrearHechizo.porDificultad(1)); 
                break;
        }
        return mago;
    }

    public static Personaje crearMortifago() {
        int tipo = rand.nextInt(2);
        Personaje mortifago;

        switch (tipo) {
            case 0:
                mortifago = new Comandante("Comandante " + contadorMortifagos++, 90, 115);
                mortifago.agregarHechizo(CrearHechizo.porNombre("Avada Kedavra"));
                mortifago.agregarHechizo(CrearHechizo.porNombre("Protego"));
                break;
            default:
                mortifago = new Seguidor("Seguidor " + contadorMortifagos++, 60, 85);
                mortifago.agregarHechizo(CrearHechizo.porNombre("Avada Kedavra"));
                break;
        }
        return mortifago;
    }
}