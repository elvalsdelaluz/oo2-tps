package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public class GuerreroConcreto  implements CreadorPersonaje{

	@Override
	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraAcero(), new ArmaEspada());
	}

}
