package ejercicio12_decodificador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int año;
	private double puntaje;
	private List<Pelicula> similares;
	
	//CONSTRUCTOR
	public Pelicula (String titulo, double puntaje, int año) {
		this.titulo = titulo;
		this.año = año;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	//MÉTODOS
    public void agregarSimilar(Pelicula B) {
    	if (! this.similares.contains(B)){
    	    this.similares.add(B);
    	    B.agregarSimilar(this);
    	}
    	
    }

	public int getAño() {
		return this.año;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
    
    public String getTitulo() {
		return titulo;
	}

	public List<Pelicula> getSimilares(){ //¿RETORNAR UNA LISTA ES MALA PRÁCTICA? 
    	return this.similares;
    }
	
	@Override
    public String toString() {
        return getTitulo() + " "+ getAño();
    }
	
}
