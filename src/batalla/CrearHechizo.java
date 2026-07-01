package batalla;

public enum TipoHechizo {
    ATAQUE,
    DEFENSA,
    MALDICION,
    CURACION
}

public class CrearHechizo { 

    public static Hechizo crearHechizo(TipoHechizo tipo) {
        switch (tipo) {
            case ATAQUE:
                // here we have a spell 
                return new Expelliarmus(); 
            case DEFENSA:
                return new Protego();
            case CURACION:
                return new ExpectoPatronum(); // we have this class
            case MALDICION:
                return new AvadaKedavra(); // you have this class
            default:
                throw new IllegalArgumentException("Tipo de hechizo desconocido: " + tipo);
        }
    }
    
    // Variante: Crear por dificultad o nombre exacto si la consigna lo requiere
    public static Hechizo crearHechizoPorNombre(String nombre) {
        // Convertimos el nombre a minúsculas para que la búsqueda sea insensible a mayúsculas
        return switch (nombre.toLowerCase()) {
            case "expelliarmus" -> new Expelliarmus();
            case "protego" -> new Protego();
            case "expectopatronum" -> new ExpectoPatronum();
            case "avadakedavra" -> new AvadaKedavra();
            case "crucio" -> new Crucio(); 
            
            default -> throw new IllegalArgumentException("Hechizo no encontrado: " + nombre);
        };
    }
}
