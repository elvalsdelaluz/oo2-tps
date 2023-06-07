package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

import java.util.List;

public class Personaje {
    private String nombre;
    private int puntos;
    private List<String> habilidades;
    private Armadura armadura;
    private Arma arma;
    
    
    protected Personaje(Armadura armadura, Arma arma) { 
    	this.armadura = armadura;
    	this.arma = arma;
    	this.puntos = 100;
    }
    
    
    public void agregarHabilidad(String habilidad) {
    	this.habilidades.add(habilidad);
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public boolean puedoEnfrentarme() {
    	return this.puntos > 0;
    }
    
//    public int compararArmaduraYArma(Personaje yo) {
//    	
//    	return 1;
//    }
   
    //Le pedí al personaje objetivo del ataque que me diga que armadura tiene, 
    //y a la armadura le pedí el daño que recibe por el arma utilizada
    //Eso se lo desconte a la vida del personaje atacado
    public int puntosRestantes() {
    	return this.puntos;
    }
    public Arma getArma() {
    	return this.arma;
    }
    
    public Armadura getArmadura() {
    	return this.armadura;
    }
    
    public void recibirDaño(Arma armaDelAtacante) {
    	this.puntos = this.puntos - armaDelAtacante.decimeElDañoQueRecibo(this.armadura);
    }
    
    //Yo se que armadura y que arma tengo pero no sé que armadura y que arma tiene mi oponente
    public void hacerDaño(Personaje oponente) {
    	if (this.puedoEnfrentarme() && oponente.puedoEnfrentarme()) {
    		System.out.println(this.getArma());
    		System.out.println(oponente.getArmadura());
    	    //oponente.compararArmaduraYArma(this);
    		oponente.recibirDaño(this.arma);
    	}	
    }
    
    
}
