package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public class ArmaEspada extends Arma {

	@Override
	public int decimeElDañoArmaduraCuero(ArmaduraCuero armadura) {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int decimeElDañoArmaduraHierro(ArmaduraHierro armadura) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int decimeElDañoArmaduraAcero(ArmaduraAcero armadura) {
		// TODO Auto-generated method stub
		return 3;
	}
	
//	public int decimeElDañoSegunElArmadura(ArmaduraCuero armadura) {
//		return 8;
//	}
//	
//	public int decimeElDañoSegunElArmadura(ArmaduraAcero armadura) {
//		return 3;
//	}
//	
//	public int decimeElDañoSegunElArmadura(ArmaduraHierro armadura) {
//		return 5;
//	}

	


}
