package ejercicio12_decodificador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class EstrategiaDeSugerencia {
	
	//MÉTODOS
	
	public List<Pelicula> noReproducidas(List<Pelicula> conocidas, List<Pelicula> reproducidas){
		return conocidas.stream().filter(pelicula->!reproducidas.contains(pelicula)).toList();
	}
	
	
	
	public List<Pelicula> ordenarPorAño (List<Pelicula> noReproducidas){
		return noReproducidas.stream()
   		     .sorted(Comparator.comparingInt(Pelicula::getAño).reversed())
			  .limit(3).toList(); 	
	};
		
	
	
//	public List<Pelicula> sugerir2(List<Pelicula> conocidas, List<Pelicula> reproducidas){
////		conocidas.forEach(System.out::println);
////		System.out.println("---------------------------");
////		reproducidas.forEach(System.out::println);
////		System.out.println("---------------------------");
//		List<Pelicula> noReproducidas = peliculasNoReproducidas(conocidas, reproducidas);
//		noReproducidas.forEach(System.out::println);
//		System.out.println("---------------------------");
//		noReproducidas = hook(noReproducidas, conocidas); //ACA SE HACE ALGO MÁS O NO, DEPENDIENDO EL TIPO DE SUGERENCIA
//		noReproducidas.forEach(System.out::println);
//		System.out.println("---------------------------");
//		return ordenarPorAño(noReproducidas);
//	}

	
	public List <Pelicula> sugerir(List<Pelicula> conocidas, List<Pelicula> reproducidas){
//	    noReproducidas() //Devuelve las peliculas no reproducidas, en el caso de la sugerencia por similaridad devuelve las noReproducidas de las similares
//	    hook() //Cambia el criterio de ordenamiento
	    return ordenarPorAño(noReproducidas(conocidas, reproducidas));	
	}

	
    //abstract List<Pelicula> hook(List<Pelicula> noReproducidas, List<Pelicula> conocidas);
//	abstract List<Pelicula> noReproducir(List<Pelicula> conocidas, List<Pelicula> reproducidas);
//	abstract List<Pelicula> ordenarPorAño(List<Pelicula> noReproducidas);
		

}
