package ejercicio12_decodificador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDecodificador {
	private Decodificador miDeco;
	private Pelicula thor;
	private Pelicula capitaA;
	private Pelicula IronMan;
	private Pelicula Dunkirk;
	private Pelicula Rocky;
	private Pelicula Rambo;

	public void inicializar() {
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.capitaA = new Pelicula("Capitan America", 7.8, 2016);
		this.IronMan = new Pelicula("Iron man", 7.9, 2010);
		this.Dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.Rocky = new Pelicula("Rocky", 8.1, 1976);
		this.Rambo = new Pelicula("Rambo", 7.8, 1979);
		this.thor.agregarSimilar(this.capitaA);
		this.thor.agregarSimilar(this.IronMan);
		this.capitaA.agregarSimilar(this.thor);
		this.capitaA.agregarSimilar(this.IronMan);
		this.IronMan.agregarSimilar(this.thor);
		this.IronMan.agregarSimilar(this.capitaA);
		this.Rocky.agregarSimilar(Rambo);
		this.Rambo.agregarSimilar(this.Rocky);
	}
	@BeforeEach
	void setUp() throws Exception {
		this.miDeco = new Decodificador ();
		inicializar();
		this.miDeco.agregarPelicula(this.thor);
		this.miDeco.agregarPelicula(this.capitaA);
		this.miDeco.agregarPelicula(this.IronMan);
		this.miDeco.agregarPelicula(this.Dunkirk);
		this.miDeco.agregarPelicula(this.Rocky);
		this.miDeco.agregarPelicula(this.Rambo);
	}

	@Test
	void testSugerencias() {
		this.miDeco.mostrarSugerencias();
		this.miDeco.reproducirPelicula(this.thor);
		this.miDeco.reproducirPelicula(this.Rocky);
		this.miDeco.mostrarSugerencias();
		this.miDeco.setSugerencia(new SugerenciaPorSimilaridad());
		this.miDeco.mostrarSugerencias();
		
		//TENGO PROBLEMAS ACAAA
		this.miDeco.setSugerencia(new SugerenciaPorPuntaje());
		this.miDeco.mostrarSugerencias();
	}

}
