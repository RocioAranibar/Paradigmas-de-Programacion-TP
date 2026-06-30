package batalla;
import personajes.Personaje;
import hechizo.Hechizo;
import java.util.*;

public class Batallon {
	
	private List<Personaje> integrantesBatallon;
	private List<String> acciones;
	private Map<Personaje, List<Hechizo>> historialHechizos;
	private Set<Hechizo> hechizosLanzados;
	
	public Batallon() {
		
		this.integrantesBatallon = new ArrayList<>();
		
		this.acciones = new ArrayList<>();
		
		this.historialHechizos = new HashMap<>();
		
		this.hechizosLanzados = new HashSet<>();
	}
	
	public List<Personaje> obtenerIntegrantes() {
		return this.integrantesBatallon;
	}
	
	public List<String> obtenerAcciones() {
		return this.acciones;
	}
	
	public Map<Personaje, List<Hechizo>> obtenerHistorialHechizos() {
		return this.historialHechizos;
	}
	
	public Set<Hechizo> obtenerHechizosLanzados() {
		return this.hechizosLanzados;
	}
	
	public void agregarPersonaje(Personaje personaje) {
		this.integrantesBatallon.add(personaje);
		//Validar tipo de personaje ?
	}
	
	public boolean tienePersonajesSaludables() {
		for(Personaje pers : this.integrantesBatallon) {
			if(pers.getVida() > 0) { //Falta getter de vida
				return true;
			}
		}
		return false;
	}
	
	public void atacar(Batallon otro) {
		
		this.hechizosLanzados.clear();
		
		for(Personaje atacante : this.integrantesBatallon) {
			if(atacante.getVida <= 0) {
				continue;
			}
			
			Personaje objetivo = otro.obtenerObjetivoVivoAleatorio();
			if(objetivo == null) {
				break;
			}
			
			Hechizo hechizoElegido = null;
			for(Hechizo hech : atacante.getListaHechizos()) {
				if(!this.hechizosLanzados.contains(hech)) {
					hechizoElegido = hech;
					break;
				}
			}
			
			String registro;
			
			if(hechizoElegido != null) {
				hechizoElegido.ejecutar(atacante, objetivo);
				
				this.hechizosLanzados.add(hechizoElegido);
				registrarEnHistorial(atacante, hechizoElegido);
				
				registro = atacante.getNombre() + "lanzó " + hechizoElegido.getClass().getSimpleName() + " a " + objetivo.getNombre();
			}else {
				registro = atacante.getNombre() + " no pudo actuar (Hechizo repetido en este turno).";
			}
			
			this.acciones.add(registro);
			
		}
	}
	
	private Personaje obtenerObjetivoVivoAleatorio() {
		List<Personaje> vivos = new ArrayList<>();
		
		for(Personaje pers : this.integrantesBatallon) {
			if(pers.getVida() > 0) {
				vivos.add(pers);
			}
		}
		
		if(vivos.isEmpty()) {
			return null;
		}
		
		Random rand = new Random();
		int indiceAleatorio = rand.nextInt(vivos.size());
		
		return vivos.get(indiceAleatorio);
	}
	
	private void registrarEnHistorial(Personaje personaje, Hechizo hechizo) {
		
		List<Hechizo> hechizos = this.historialHechizos.getOrDefault(personaje, new ArrayList<>());
		
		hechizos.add(hechizo);
		
		this.historialHechizos.put(personaje, hechizos);
		
	}
}
