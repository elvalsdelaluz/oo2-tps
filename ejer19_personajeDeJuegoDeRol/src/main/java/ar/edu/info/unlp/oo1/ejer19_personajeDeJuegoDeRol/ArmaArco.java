package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

public class ArmaArco extends  Arma  {

	@Override
	public int decimeElDañoArmaduraCuero(ArmaduraCuero armadura) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int decimeElDañoArmaduraHierro(ArmaduraHierro armadura) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int decimeElDañoArmaduraAcero(ArmaduraAcero armadura) {
		// TODO Auto-generated method stub
		return 2;
		
	}
//	public int decimeElDañoSegunElArmadura(ArmaduraCuero armadura) {
//		return 5;
//	}
//	
//	public int decimeElDañoSegunElArmadura(ArmaduraAcero armadura) {
//		return 2;
//	}
//	
//	public int decimeElDañoSegunElArmadura(ArmaduraHierro armadura) {
//		return 3;
//	}

    

}
