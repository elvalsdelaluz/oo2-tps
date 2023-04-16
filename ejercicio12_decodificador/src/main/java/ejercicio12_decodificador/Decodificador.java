package ejercicio12_decodificador;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> todasLasPeliculas;
	private List<Pelicula> reproducidas;
	private EstrategiaDeSugerencia estrategia;
	//private List<Pelicula> noReproducidas;
	
	
	//CONSTRUCTOR
	public Decodificador () {
		this.todasLasPeliculas = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.estrategia = new SugerenciaPorNovedad();
		//this.noReproducidas = new ArrayList<Pelicula>();
	}
	
	//MÉTODOS
	public void agregarPelicula (Pelicula A) {
		this.todasLasPeliculas.add(A);
		//this.noReproducidas.add(A); //a penas se agrega significa que no fue reproducida
	}
	
	public void reproducirPelicula (Pelicula reproducida) {
		if (!this.reproducidas.contains(reproducida)) {
		    this.reproducidas.add(reproducida); //deberia controlar que no se agregue dos veces una misma peli?
		}
	}
	
	
	public void mostrarSugerencias() {
		 List<String> esperoQueFuncione = estrategia.sugerir(todasLasPeliculas, reproducidas).stream().map(peli -> peli.getTitulo()).toList();
		 System.out.println("---Sugerencias---");
		 esperoQueFuncione.forEach(System.out::println);
	}
	
	public void setSugerencia(EstrategiaDeSugerencia nueva) {
		this.estrategia = nueva;
	}
	

}
