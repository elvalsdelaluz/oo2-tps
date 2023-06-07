package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public class ArmaduraHierro extends Armadura {
	
	
	
	public int decimeElDañoSegunElArma(Arma arma) {
    	return arma.decimeElDañoArmaduraHierro(this);
    }

}
