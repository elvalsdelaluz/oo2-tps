package ar.edu.info.unlp.oo1.ejer19_personajeDeJuegoDeRol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonajeTest {
	private Personaje atacado;
	private Personaje atacante; //YO

	@BeforeEach
	void setUp() throws Exception {
		this.atacado = new GuerreroConcreto().crearPersonaje(); //armadura --> acero, arma --> espada
		this.atacante = new MagoConcreto().crearPersonaje(); //armadura --> cuero, arma --> baston
	}

	@Test
	void test() {
		
		atacante.hacerDaño(atacado);
		assertEquals(99, atacado.puntosRestantes());
		
	}

}
