package ejercicio12_decodificador;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaPorSimilaridad extends EstrategiaDeSugerencia {
	
	//MÉTODOS
	
	
	private List<Pelicula> similares(List<Pelicula> conocidas){  //Hay repetidos ...... :|
		List<List<Pelicula>> similares = new ArrayList <List<Pelicula>>();
		conocidas.forEach(pelicula -> similares.add(pelicula.getSimilares()));
		List<Pelicula> similares2 = similares.stream().flatMap(List::stream).toList();
		return similares2.stream().distinct().toList();
		
	}
	
	public List<Pelicula> noReproducidas(List<Pelicula> noReproducidas, List<Pelicula> conocidas){
		return similares(conocidas).stream().filter(pelicula->noReproducidas.contains(pelicula)).toList();
		
	}
	
//	public List<Pelicula> noReproducidas2(List<Pelicula> noReproducidas, List<Pelicula> conocidas){ //Devuelve las peliculas similares recientes
//		List<Pelicula> algo = similares(conocidas).stream().filter(peli -> noReproducidas.contains(peli)).toList(); 
//		System.out.println("algoooooo");
//		algo.forEach(System.out::println);
//		System.out.println("algoooooo");
//		return algo;
//	}
		

	
//	public List<Pelicula> sugerir(List<Pelicula> noReproducidas){
//		return null;
//	};
}
