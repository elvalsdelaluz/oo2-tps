package ejercicio12_decodificador;

import java.util.Comparator;
import java.util.List;

public class SugerenciaPorPuntaje extends EstrategiaDeSugerencia{
	
	//MÉTODOS
		public List<Pelicula> ordenarPorAño(List<Pelicula>noReproducidas){
			return noReproducidas.stream()
  		     .sorted(Comparator.comparingDouble(Pelicula::getPuntaje).thenComparing(Pelicula::getAño)
  		     .reversed())
			 .limit(3).toList(); 	
		}
		

}
