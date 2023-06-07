package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public abstract class Arma { //Que funcionalidad le doy?
    
	public int decimeElDañoQueRecibo(Armadura armadura) {
		return armadura.decimeElDañoSegunElArma(this);
	}
	
//	public abstract int decimeElDañoSegunElArmadura(ArmaduraCuero armadura);
//	public abstract int decimeElDañoSegunElArmadura(ArmaduraHierro armadura);
//	public abstract int decimeElDañoSegunElArmadura(ArmaduraAcero armadura);
//	
//	public int decimeElDañoSegunElArmadura(Armadura armadura) { //Si no agrego esto me chisha
//		System.out.println("La estoy pasando mal");
//        return 0;
//	}	
	
	public abstract int decimeElDañoArmaduraCuero(ArmaduraCuero armadura);
	public abstract int decimeElDañoArmaduraHierro(ArmaduraHierro armadura);
	public abstract int decimeElDañoArmaduraAcero(ArmaduraAcero armadura);
	
}
	
