package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public class ArqueroConcreto  implements CreadorPersonaje{

	@Override
	public Personaje crearPersonaje() {
		return new Personaje(new ArmaduraCuero(), new ArmaArco());
	}

}
