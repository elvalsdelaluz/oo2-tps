package ejer4_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParcelaTest {
	private Topografia parcelaTierra;
	private Topografia parcelaAgua;
	private Topografia parcelaTierra2;
	private Topografia parcelaAgua2;
	private Topografia mixta;
	private Topografia mixtaMixta;
	private Topografia mixtaMixta2;
	
	@BeforeEach 
	void setUp() throws Exception{
		parcelaTierra = Simple.tierra();
		parcelaAgua = Simple.agua();
		parcelaTierra2 = Simple.tierra();
		parcelaAgua2 = Simple.agua();
		mixta = new Mixta(Simple.agua(), Simple.tierra(), Simple.agua(), Simple.tierra());
		mixtaMixta = new Mixta(Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.tierra()),
				Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.tierra()));
		mixtaMixta2 = new Mixta(Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.tierra()), 
				Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.tierra()));
	}

	@Test
	public void testProporcionAgua() {
		assertEquals(1, parcelaAgua.calcularProporcionAgua());
		assertEquals(0.5, mixta.calcularProporcionAgua());
	//	assertEquals (0.5, mixtaMixta.calcularProporcionAgua());
	}

	@Test
	public void testsIgualdad() {
		assertTrue(parcelaTierra.compararIgualdad(parcelaTierra2));
		assertFalse(parcelaTierra.compararIgualdad(parcelaAgua));
		assertFalse(parcelaTierra.compararIgualdad(mixta));
	    assertFalse(mixta.compararIgualdad(mixtaMixta));
		assertTrue(mixtaMixta.compararIgualdad(mixtaMixta2));
		
		Mixta mixtaMalvado = new Mixta(Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.tierra()), 
				Simple.agua(), 
				new Mixta(Simple.agua(), Simple.agua(), Simple.agua(), Simple.agua()));
		assertFalse(mixtaMixta.compararIgualdad(mixtaMalvado));
		assertFalse(mixtaMixta.equals((Object)null));
		assertFalse(mixtaMixta.equals("hola"));
	}
	
}
